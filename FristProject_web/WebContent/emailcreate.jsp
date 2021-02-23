<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
<p style="font-size:30px;">이메일 문의</p>
<p style="font-size:20px;">불편사항이나 문의사항을 남겨주시면 신속하게 답변드리겠습니다.</p>
      <hr color="grey"><br>
      <!-- form태그는 값을 입력하고 싶을 때 사용 -->
      <!-- 입력값들은 모두 form들어가야 한다. -->
      <!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
       <form action="emailconnect.jsp">
       		연&nbsp;&nbsp;락&nbsp;&nbsp;처&nbsp;&nbsp; <input name="tel">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       		이&nbsp;&nbsp;메&nbsp;&nbsp;일&nbsp;&nbsp; <input name="email"><br><br>
		 <hr color="grey">
		문의유형&nbsp;
		 <input type="radio" value="문의" name="type">문의
		 <input type="radio" value="불만" name="type">불만
		 <input type="radio" value="칭찬" name="type">칭찬
		 <input type="radio" value="제안" name="type">제안<br><br>
       	제&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목&nbsp;&nbsp; <input name="title"><br><br>
       	내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용&nbsp;&nbsp;
       	<textarea rows="10" cols="100" name="content"></textarea>
		<br>	
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button>등록하기</button>
       <a href="movie_main.jsp"><button type="button">홈</button></a>&nbsp;&nbsp;
       </form>
</body>
</html>