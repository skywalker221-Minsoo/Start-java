<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>비밀번호 찾기</h2>
	<form action="checkPw.jsp">
	아이디: <input name="id"><br>
	이름: <input name="name"><br>
 	휴대폰 번호: 
		 <select name="company"><!--name: 넘어갈때 이게 무엇인가를 알려주는 key역할 -->
		 	<option value="SKT">SKT</option>  <!-- 이것을 가장 많이 활용 -->
		 	<option value="LG">LGT</option>
		 	<option value="KT">KT</option>
		 </select>
		 <input name="tel"><br>
		 <button type="submit">확인</button>
		 </form>
</body>
</html>