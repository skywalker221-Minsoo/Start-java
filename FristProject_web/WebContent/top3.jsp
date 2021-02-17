
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
li {
	margin: 5px 10px 0 -30px; /* 위 오른쪽 아래 왼쪽 */
	padding: 5px;
	list-style: none;
	float: left; 
	font-size: 20px;
	/* background : pink; */
}

a {
	font-size: 16px;
	padding: 3px;
	margin: 0 0 0 0;
}
</style>
</head>
<ul><!-- unordered list -->
	<li>ㅇㅇㅇ님<br> <!-- a href 안붙어 있으면 li가 관여  -->
		환영합니다.</li>    
</ul>
<ul><!-- unordered list -->
	<li><a href="login.jsp">로그아웃</a></li>  <!-- 여긴 스타일 a 가 관여  -->
	<li><a href="modify.jsp">개인정보수정</a></li>
	<li><a href="pay.jsp">결재수단</a></li>
	<li><a href="pay.jsp">개인함</a></li>
	<li><a href="pay.jsp">회원탈퇴</a></li>
	<li>고객센터</li>
	<li><a href="QandA.jsp">자주묻는 질문</a></li>
	<li><a href="question.jsp">문의 게시판</a></li>
	<li><a href="news.jsp">공지/뉴스</a></li>
</ul>