package com.skycat;

import java.io.IOException;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;



/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String userId=request.getParameter("userid");
		String pwd=request.getParameter("pwd");
		//去数据库里取数据，进行比较
		try{
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取到数据库的链接
			Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","123456");
			//创建命令对象
			Statement stmt=(Statement) conn.createStatement();
			//执行命令
			java.sql.ResultSet rs= stmt.executeQuery("select user_name from user where user_id='"+userId+"' and pwd='"+pwd+"'");
			//读取结果
			if(rs.next()){
				//System.out.println("恭喜您登陆成功！");
				request.setAttribute("userName", rs.getString(1));
				request.getRequestDispatcher("/welcome.jsp").forward(request, response);
			}else{
				System.out.println("不好意思，登录失败！");
				//request.setAttribute("errorMessage", "用户名或密码错误，请重新输入！");
				//request.getRequestDispatcher("/shop.jsp").forward(request, response);
			}
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("请配置驱动程序");
		}
		doGet(request, response);
	}

}
