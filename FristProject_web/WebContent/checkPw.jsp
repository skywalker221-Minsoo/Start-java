<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String company = request.getParameter("company");
	String tel = request.getParameter("tel");
	
    //여기 있는 아이디를 다음 페이지에 보내야함.
	MemberDB db = new MemberDB();
   
    
    boolean result = db.check3(id, name, company, tel);
    
    

%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% if (result) {%>
 		 <form action="newPw.jsp">
 	 아이디: <input name = "id" value="<%= id  %>"readonly="readonly"><br>
	 새 비밀번호: <input name="pw1"><br>
 	 새 비밀번호 확인: <input name="pw2"><br>
 	 <button type="submit">설정 완료</button>
  </form><% } else {%>
 	 비밀번호 찾기에 실패하셨습니다.
 	 <a href="login.jsp">로그인 페이지로</a>
 	 <a href="findPw">비밀번호 찾기 페이지로</a>
 	                                            
 	 
 <% } 
  %>

</body>
</html>