<%@ page import="DB.MovieDB"%>
<%@ page import="DB.MovieVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<style>
select {
	margin: 0 20px 0 10px;
	font-size: 17px;
}

a {
	margin: 0 40px 20px 40px; /* 위 오른쪽 아래 왼쪽 */
	/* 	padding: 5px; */
	list-style: none;
	/* float: left; */
	font-size: 17px;
	/* background : pink; */
}
</style>

<ul>
	<!-- unordered list -->
	<li><select name="genre">
			<form action="movie_main_jsp">
				<option values="movie_main.jsp">영화</option>
			</form>
				<option values="animation.jsp">애니메이션</option>
				<option values="drama.jsp">드라마</option>
				<option values="adventure.jsp">모험</option>
				<option values="action.jsp">액션</option>
				<option values="romance.jsp">멜로/로맨스</option>
				<option values="comedy.jsp">코미디</option>
				<option values="drama.jsp">드라마</option>
				<option values="fantasy.jsp">판타지</option>

	</select></li>
</ul>
<ul>
	<li><a href="movie_main.jsp">홈</a></li>
	<li><a href="popular.jsp">인기작</a></li>
	<li><a href="new.jsp">신작</a></li>
</ul>