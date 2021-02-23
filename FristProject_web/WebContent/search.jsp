
<%@ page import="DB.MovieDB"%>
<%@ page import="DB.MovieVO"%>

<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
            String title = request.getParameter("title");
	//HttpServletRequest request2 = new HttpServletRequest();
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
	

            MovieDB db = new MovieDB();
            MovieVO bag = db.read(title);
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="main_exterior.css">
<style></style>
<title>Insert title here</title>
</head>
<body>
	<div id="total">
		<div id="top">
			<!-- 사이트 이름 및 검색 탭 -->
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<!-- 영화 선택 탭 -->
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
 		<div id="top3">
			<!-- 개인정보 및 고객센터 탭 -->
			<jsp:include page="top3.jsp"></jsp:include>
		</div> 
		<div class="thumb">
			<%= bag.getTitle()%>
		</div>
		<dl class="lst_dsc">
			<dt class="tit">
				<span class="ico_rating_all">전체 관람가</span></dt>
			<dt class ="tit_t1">평점 | <%= bag.getRank()%></dt>	
			<dt class="tit_t2">개요 | <%= bag.getGenre()%></dt>
			<dt class="tit_t3">금액 | <%= bag.getFee()%></dt>
			<dt class="tit_t5">줄거리 | <%= bag.getStory()%></dt>
		</dl>
	</div>
</body>
</html>