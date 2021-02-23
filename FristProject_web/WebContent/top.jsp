<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
session.getAttribute("id");
String id = (String)session.getAttribute("id");
%>
<!DOCTYPE html>

<html>
<head></head>
<meta charset="UTF-8">
<style>
.center{
	text-align: center;
	font-size: 50px;
}
input {
	width: 700px;
	height: 30px;
	font-size: 20px;
	margin: 0 0 0 520px;
}

button {
	height: 38px;
	font-size: 20px;
}
</style>
</head>
<body>
	<!-- form 태그는 값을 입력하고 싶을 때 사용 -->
	<!-- 입력값들은 모두 form에 들어가야 한다. -->
	<!-- action : 입력값을 받아서 처리하는 다음 페이지를 지정 -->
	<h1 class="center">사이트 이름 및 검색</h1>
	<form action="search.jsp">
		<input name="title">
		<button type="submit">검색</button>
	</form>
</body>
</html>