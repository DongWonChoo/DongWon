<%@page import="product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel ="stylesheet" type ="text/css" href="css/selectAll.css">
		<link rel ="stylesheet" type ="text/css" href="css/index.css"> 
		<title>myShop</title>
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
		<h2> 제품 전체 조회 </h2>
		<%
			ProductDAO dao = new ProductDAO();
			ArrayList<ProductDTO> list = dao.selectAll();
		%>
		<table>
			<tr>
				<td>제품  ID</td>
				<td>제품  명</td>
				<td>제품내용</td>
				<td>제품가격</td>
			</tr>
		<% for(int i=0; i<list.size(); i++) { 
			ProductDTO dto = list.get(i);
			String pro_name = dto.getPro_name();
			String pro_content = dto.getPro_content();
			
			if(pro_name == null) {
				pro_name ="";
			}
			if(pro_content == null) {
				pro_content ="";
			}
		%>
			<tr>
				<td><%= dto.getPro_id() %></td>
				<td><%= pro_name %></td>
				<td><%= pro_content %></td>
				<td><%= dto.getPro_price() %></td>
			</tr>
		<%} %>
		</table>
	</body>
</html>