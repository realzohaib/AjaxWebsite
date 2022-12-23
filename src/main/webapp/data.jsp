<%@page import="Pack.BankDAO"%>
<%@page import="Pack.BankDAOFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	BankDAO bankdao=BankDAOFactory.createBankDAO();
	String res=bankdao.fetchAll();
	out.println(res);
		
%>
</body>
</html>