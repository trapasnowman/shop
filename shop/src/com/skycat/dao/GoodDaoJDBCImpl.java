package com.skycat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.skycat.entity.Good;

public class GoodDaoJDBCImpl implements GoodDao {

	@Override
	public boolean add(Good good) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Good good) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Good oldgood, Good newgood) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Good> getAll() {
		// TODO Auto-generated method stub
		List<Good> goodList=new ArrayList<Good>(); 
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaee","root","123456");
			
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from good");
			while(rs.next()){
				Good good=new Good();
				good.setSno(rs.getInt(1));
				good.setName(rs.getString(2));
				good.setPrice(rs.getInt(3));
				goodList.add(good);
			}
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return goodList;
	}
}
