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
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String name = request.getParameter("name");
			String pw = request.getParameter("pw");
		%>		
		
		TITLE: <%=title%>
		CONTENT: <%=content%>
		NAME: <%=name%>
		PW: <%=pw%>
	</body>
</html>