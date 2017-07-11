<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物清单</title>
</head>
<body>
您所购买的物品：<br />
笔记本电脑：${itemMap["笔记本电脑"]}台<br />
单反：${itemMap["单反"]}件<br />
汽车：${itemMap["手机"]}部<br />
<p><a href="index.jsp">再次购买</a></p>
当前在线人数：
${applicationScope.count}
</body>
</html>