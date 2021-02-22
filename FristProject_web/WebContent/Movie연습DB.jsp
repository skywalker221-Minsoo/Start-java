<%@ page import="DB.MovieDB"%>
<%@ page import="DB.MovieVO"%>

<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String birth = request.getParameter("birth");
            String genre = request.getParameter("genre");
            String fee = request.getParameter("fee");
            String video = request.getParameter("video");
            String story = request.getParameter("story");

            MovieVO bag = new MovieVO();

            bag.setId(id);
            bag.setTitle(title);
            bag.setBirth(birth);
            bag.setGenre(genre);
            bag.setFee(fee);
            bag.setVideo(video);
            bag.setStory(story);
            
            MovieDB db = new MovieDB();
            db.create(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원가입 처리 되셨습니다. 환영합니다!<br>
돌아가기<br>
	<form action="Movie연습.jsp">
		<button>초기화면으로</button><br>
	</form>

</body>
</html>