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
		<h2>3번 문제</h2>
		<%
			String trip = request.getParameter("trip");
			String trip_count = request.getParameter("trip_count");
			int tc = Integer.parseInt(trip_count);
		%>
			<%if(tc > 3){ %>
				<%= trip %>를 그만 가셔야 겠군요.
			
			<%} else {%>
				<%= trip %>를 더 갈 수 있겠군요오오오오오 반아 휘파람을 불어라 !!!
			<%} %>
			
			
		
	</body>
</html>