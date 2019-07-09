<%@page import="bean.MemberDTO"%>
<%@page import="sun.security.jgss.spi.MechanismFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>Insert title here</title>
	</head>
	<body>
		<!-- ↓액션태그 라고 부른다.  -->
		<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
		<!--              ↑ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ>↓ 명이 같아야함 -->
		<jsp:setProperty property="*" name="dto"/>	
		
		 <%
		 /*
		 	jsp:useBean은 밑의 작업을 전부 해주는 메소드 이다.
			MemberDTO dto = new MemberDTO();
			dto.setId(request.getParameter("id"));
			dto.setPw(request.getParameter("pw"));
			dto.setName(request.getParameter("name"));
			dto.setTel(request.getParameter("tel"));
		*/
		%>
		
		DTO에 들어간 값 출력
		<hr color="gold">
		ID: <%= dto.getId() %>  <br>
		PW: <%= dto.getPw() %>	 <br>	
		NAME: <%= dto.getName() %>	 <br>	
		TEL: <%= dto.getTel() %><br>
	</body>
</html>