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
		if (session.getAttribute("id") == null) {
	%>
	<form action="check.jsp">

		아이디: <input name="id"><br> 비밀번호: <input name="pw"><br>
		<button type="submit">로그인 완료</button>
		<br>
	</form>
	<%
		} else {
	%>
	<%
		response.sendRedirect("movie_main.jsp");
	%>
	<%
		}
	%>
	<button type="button" onclick="location.href='findId.jsp'">아이디 찾기</button>
	<button type="button" onclick="location.href='findPw.jsp'">비밀번호
		찾기</button>
	<br>
	<button type="button" onclick="location.href='create.jsp'">회원가입</button>


</body>
</html>