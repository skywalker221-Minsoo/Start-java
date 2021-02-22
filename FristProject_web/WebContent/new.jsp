
<%@ page import="DB.MovieDB2"%>
<%@ page import="DB.MovieVO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
            MovieDB2 db = new MovieDB2();
            ArrayList<MovieVO> list = db.list();
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
		<%
			for (int i = 0; i < list.size(); i++) {
				MovieVO bag2 = list.get(i);
				Date now = new Date();
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // 여기를 DB에 있는 개봉날짜로 쓴다
				
				Date getDate = format.parse(bag2.getBirth());
				
				long calDate = now.getTime() - getDate.getTime();
				
				long calDateDays = calDate / (24*60*60*1000);
				
				calDateDays = Math.abs(calDateDays);
				
				if (calDateDays <= 30) {
		%>
					<dl class="lst_dsc">
					<dt class ="tit_t1">제목 | <%= bag2.getTitle()%></dt>
					<dt class ="tit_t1">평점 | <%= bag2.getRank()%></dt>	
					<dt class="tit_t2">개요 | <%= bag2.getGenre()%></dt>
					<dt class="tit_t3">금액 | <%= bag2.getFee()%></dt>
					<dt class="tit_t4">개봉일자 | <%= bag2.getBirth()%></dt>
					<dt class="tit_t5"><%= bag2.getVideo()%></dt>
					<dt class="tit_t6">줄거리 | <%= bag2.getStory()%></dt><br><br><br>
			<%} }%>
			</dl>
		</div>
	</div>
</body>
</html>