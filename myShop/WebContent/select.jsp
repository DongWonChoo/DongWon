<%@page import="product.ProductDTO"%>
<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel ="stylesheet" type ="text/css" href="css/select.css"> 
		<link rel ="stylesheet" type ="text/css" href="css/index.css"> 
		<title>select</title>
	</head>
	<body>
		<h1>추동 상회</h1>
		<nav id="Menu">
			<ul>
				<li><a class="menuLink" href="select.html">상품 검색</a></li>
				<li><a class="menuLink" href="insert.html">상품 등록</a></li>
				<li><a class="menuLink" href="selectAll.html">상품 전체 조회</a></li>
				<li><a class="menuLink" href="update.html">상품 정보 수정</a></li>
				<li><a class="menuLink" href="delete.html">상품 삭제</a></li>
			</ul>
		</nav>
		<h2> 제품 조회 </h2>
		<jsp:useBean id="dto" class="product.ProductDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		 <%
			ProductDAO dao = new ProductDAO();
		 	ProductDTO select_dto = dao.select(dto);
		 	String id = select_dto.getPro_id();
		 %>
		 
		<% if(id == null) {
			out.print("제품이 없습니다.");
		} else {%>
			<table>
				<tr>
					<th>제품ID</th>
					<td><input type="text" name="pro_id" id="pro_id_check" value=<%=select_dto.getPro_id() %>><br></td>
				</tr>
				<tr>
					<th>제품명</th>
					<td><input type="text" name="pro_name" value=<%=select_dto.getPro_name() %>><br></td>
				</tr>
				<tr>
					<th>제품내용</th>
					<td><input type="text" name="pro_content" value=<%=select_dto.getPro_content() %>><br></td>
				</tr>
				<tr>
					<th>제품가격</th>
					<td><input type="text" name="pro_price" value=<%=select_dto.getPro_price() %>><br></td>
				</tr>
			</table>
		<% 
			} 
		%>
	</body>
</html>