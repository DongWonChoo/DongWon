<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>Insert title here</title>
			<style>
				
			</style>
	</head>
	<body>
		<h2>2번 문제</h2>
		<%
			String color = request.getParameter("color");
		%>
		<div style="background: <%= color %>">
			2번 문제 색상
		</div>
	</body>
</html>