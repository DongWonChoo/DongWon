<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="test_css2.css">
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
		%> 	
		<center>
		<div id="title">
			<h1>회원 정보 확인</h1>
		</div>
			<div id="form">
				<table border="1" bordercolor="gray">
					<tr>
						<td id="fff">아이디</td>
						<td id="fff2"><%= id %></td>
					</tr>
					<tr>
						<td id="fff">패스워드</td>
						<td id="fff2"><%= pw %></td>
					</tr>
					<tr>
						<td id="fff">이름</td>
						<td id="fff2"><%= name %></td>
					</tr>
					<tr>
						<td id="fff">연락처</td>
						<td id="fff2"><%= tel %></td>
					</tr>
				</table>
			</div>
		</center>
	</body>
</html>