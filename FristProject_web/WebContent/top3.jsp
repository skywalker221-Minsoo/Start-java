<%@ page import="DB.MemberVO"%>
<%@ page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
session.getAttribute("id");
String id = (String)session.getAttribute("id");
%>
<style>
li {
	margin: 5px 10px 0 -30px; /* 위 오른쪽 아래 왼쪽 */
	padding: 5px;
	list-style: none;
	float: left; 
	font-size: 17px;
}

#li {
	font-size: 25px;
	margin-right: 10px;
}
</style>
</head>
<ul><!-- unordered list -->
	<li><%= id %>님<br>
		환영합니다.</li>    
</ul>
<ul><!-- unordered list -->
	<li><a href="logout.jsp">로그아웃</a></li> 
	<li><a href="update.jsp">개인정보수정</a></li>
	<li><a href="delete.jsp">회원탈퇴</a></li>
	<li>고객센터</li>
	<li><a href="QnAmain.jsp">자주묻는 질문</a></li>
	<li><a href="emailcreate.jsp">문의 게시판</a></li>
</ul>