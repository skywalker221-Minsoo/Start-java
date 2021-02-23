<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원탈퇴</h2>
		<hr color="red">
		 <!--form태그는 값을 입력하고 싶을 때 사용  -->
		 <!-- 입력값들은 모두 form들어가야 한다.  -->
		 <!--action: 입력값을 받아서 처리하는 다음페이지를 지정 -->
		 <form action="deleteDB.jsp"><!--자바로 서버를 만드는곳  -->
		 아이디: <input name="id"><br><!-- jsp = java server page -->
		
		 <button type="submit">탈퇴 완료</button>
		 <!--네트워크를 위한 것: 랜선, ip, 포트   -->
		 </form>
       <!-- DB전담, 데이터전달묶는 가방 .java필요, 가방이 많으면 그것보다 큰 묶음-->
       
       
       
</body>
</html>