
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
select {
	margin: 0 20px 0 20px;
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
			<option values="movie">영화</option>
			<option values="science">공상과학/판타지</option>
			<option values="horror">공포</option>
			<option values="documentary">다큐멘터리</option>
			<option values="drama">드라마</option>
			<option values="mystery">미스테리/서스펜스</option>
			<option values="animation">애니메이션</option>
			<option values="action">액션/어드벤쳐</option>
			<option values="indo">인도 영화</option>
			<option values="comedy">코미디</option>
			<option values="kids">키즈</option>
	</select></li>
</ul>
<ul>
	<li><a href="movie_main.jsp">홈</a></li>
	<li><a href="popular.jsp">인기차트</a></li>
	<li><a href="new.jsp">신작</a></li>
</ul>