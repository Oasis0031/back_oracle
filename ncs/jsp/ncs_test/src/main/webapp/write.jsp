<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 작성</title>
</head>
<body>

	<form action="/ncs/write-ok.product" method="post">
	<h1>상품 추가</h1>
	<div>
		<span>상품명</span>
		<input name="productName">
	</div>	
	<div>
		<span>가격</span>
		<input name="productPrice">
	</div>	
	<div>
		<span>판매자</span>
		<input name="productSeller">
	</div>	
			
	<button>제출</button>
	</form>
	
</body>
</html>