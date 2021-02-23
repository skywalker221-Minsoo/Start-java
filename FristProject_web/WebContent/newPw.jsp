<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String pw1 = request.getParameter("pw1");
    	String pw2 = request.getParameter("pw2");
    	String id = request.getParameter("id");
    	MemberDB db = new MemberDB();
        %>
        
       <% if (pw1.equals(pw2)); {
    		String pw = pw1;
    		
    		db.pwUpdate(pw, id);
    		response.sendRedirect("login.jsp");

    		}
    	%>

				    	
    
    

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
				두 비밀번호가 일치하지 않습니다.
				<a href="login.jsp">로그인 페이지로</a>
</body>
</html>