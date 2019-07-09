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
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String pw_check = request.getParameter("pw_check");
			String name = request.getParameter("name");
			String birth_year = request.getParameter("birth_year");
			String birth_month = request.getParameter("birth_month");
			String birth_day = request.getParameter("birth_day");
			String sex = request.getParameter("sex");
			String email = request.getParameter("email");
			String tel = request.getParameter("tel");
			String tel_check = request.getParameter("tel_check");
		%>		
		<h3>당신이 입력한 정보</h3>
		<hr color="gold">
		ID: <%= id %> <br>
		pw: <%= pw %> <br>
		NAME: <%= pw_check %> <br>
		NAME: <%= name %> <br>
		BIRTH: <%= birth_year %>년<%= birth_month %>월<%= birth_day %>일 <br>
		SEX: <%= sex %> <br>
		EMAIL: <%= email %> <br>
		TEL: <%= tel %> <br>
		CHECK: <%= tel_check %> <br>
	</body>
</html>