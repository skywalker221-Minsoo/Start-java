<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.setAttribute("id", "apple"); // 우측은 DB안에 있는 데이터이며, 로그인할때 세션을 잡아줘야 게속 로그인 상태 유지하면서 이용 가능.
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>이메일 문의 게시판 화면입니다.</h2>
      <hr color="red">
      <!-- form태그는 값을 입력하고 싶을 때 사용 -->
      <!-- 입력값들은 모두 form들어가야 한다. -->
      <!-- action: 입력값을 받아서 처리하는 다음 페이지를 지정 -->
       <form action="dbconnect.jsp">
          아이디: <input name="id" value="<%=session.getAttribute("id")%>"><br> <!-- readonly 사용하면 수정 불가 -->
          이름: <input name="name"><br>
          연락처: <input name="tel"><br>
          이메일: <input name="email"><br>
       <br>
       <hr>
          제목: <input name="title"><br>
          내용: 
          <textarea rows="20" cols="100" name="content"></textarea>
      <br>   
       <button>서버로 전송</button>
       </form>
</body>
</html>