<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>Insert title here</title>
	</head>
	<body>
		<!-- 선언문 -->
		<%!
			String name;
			public String test() {
				return 1000000000 + "원";
			}
		%>
		
		<!-- 스크립트릿 -->
		<%
			/* PrintWriter out = new PrintWriter(); */
			String test=null;
			out.print("ok.↗↘↗↘↗↘↗↘↗↘<br>");
			out.print(100+200+"<br>");
		%>
		
		<!-- 표현식 -->
		<%=
			100+200
		%><br>
		<%= name %>, <%= test %><br>
		<%=
			test()
		%>
	</body>
</html>