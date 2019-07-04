<%@page import="product.ProductDAO"%>
<%@page import="product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>delete</title>
	</head>
	<body>		
		<jsp:useBean id="dto" class="product.ProductDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
			ProductDAO dao = new ProductDAO();
			dao.delete(dto);
			response.sendRedirect("index.jsp");
		%>
	</body>
</html>