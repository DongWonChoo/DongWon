<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 액션태그  -->
		<jsp:useBean id="bbsdto" class="bean.BbsDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="bbsdto"/>	
		
		BBSDTO에 들어간 값 출력
		<hr color="gold">
		ID: <%= bbsdto.getId() %>  <br>
		PW: <%= bbsdto.getTitle() %>	 <br>	
		CONTENT: <%= bbsdto.getContent() %>	 <br>	
		WRITER: <%= bbsdto.getWriter() %><br>
	</body>
</html>