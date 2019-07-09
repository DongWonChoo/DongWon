<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>	
		<%
			Connection conn = null;
			PreparedStatement pstmt = null; /* insert 할때 변수 */
			
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user = "root";
			String password = "1234";
			String sql_insert = "insert into member values (?,?,?,?)";
		
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url,user,password);
				
				pstmt = conn.prepareStatement(sql_insert);
				
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPw());
				pstmt.setString(3, dto.getName());
				pstmt.setString(4, dto.getTel());
				pstmt.executeUpdate();							
				
			} catch(Exception e) {
				e.printStackTrace();
			}finally{
				try{
					if(pstmt != null) {
						pstmt.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		%>
		
		DTO에 들어간 값 출력
		<hr color="gold">
		PW: <%= dto.getId() %>	 <br>	
		PW: <%= dto.getPw() %>	 <br>	
		NAME: <%= dto.getName() %>	 <br>	
		TEL: <%= dto.getTel() %><br>
	</body>
</html>