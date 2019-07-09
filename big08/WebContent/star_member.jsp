<%@page import="bean.StarMemberDAO"%>
<%@page import="bean.StarMemberDAO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.StarMemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>	
		
		<%
			StarMemberDAO dao = new StarMemberDAO();
			dao.insert(dto);
		%>
	</body> 
</html>