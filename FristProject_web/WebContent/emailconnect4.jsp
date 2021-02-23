<%@page import="DB.EmailDB"%>
<%@page import="DB.EmailVO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//입력해서 전송된 데이터를 받아야 한다.
                String tel = request.getParameter("tel");
                
                //db전담하는 부품에서 db에서 read(리드)할 예정.
                EmailDB db = new EmailDB();
                EmailVO bag = db.read(tel); //
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시글 검색이 완료되었습니다.</h3>
<hr> <!-- 표현식, expression -->
Tel&nbsp;&nbsp; <%= bag.getTel() %><br><br>
Email&nbsp;&nbsp; <%= bag.getEmail() %><br><br>
Type&nbsp;&nbsp; <%= bag.getType() %><br><br>
Title&nbsp;&nbsp; <%= bag.getTitle() %><br><br>
Content&nbsp;&nbsp; <%= bag.getContent() %><br><br>

	<a href="emailcreate.jsp"><button type="button">게시글 등록</button></a>&nbsp;&nbsp;
	<a href="emailread.jsp"><button type="button">게시글 검색</button></a>&nbsp;&nbsp;
	<a href="emailupdate.jsp"><button type="button">게시글 수정</button></a>&nbsp;&nbsp;
	<a href="emaildelete.jsp"><button type="button">게시글 삭제</button></a>&nbsp;&nbsp;

</body>
</html>