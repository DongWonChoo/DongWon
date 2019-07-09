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
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String[] hobby = request.getParameterValues("hobby");
			out.print("취미입니다"+"<hr>");
			for(int i=0 ; i<hobby.length ; i++){
				out.print(hobby[i] + "<br>");
			}
		%>
		
		받아온 파라미터 값
		
		<hr>
		ID: <%=id%> <br>
		PW: <%=pw%> <br>
		NAME: <%=name%> <br>
		TEL: <%=tel%> <br>
		음식: ${param.food}<br>
		성별: ${param.gender}
	</body>
</html>