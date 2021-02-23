<%@page import="DB.MemberVO"%>
<%@page import="DB.MemberDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
     
    session.getAttribute("id");
    String id = (String)session.getAttribute("id");
	 //db전담하는 부품에서 db에 넣어달라고 할 예정.
	 MemberDB db = new MemberDB();
	 MemberVO bag = db.read(id); // 
    
    
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원정보 수정 화면입니다.</h2>
		<hr color="red">
		 <!--form태그는 값을 입력하고 싶을 때 사용  -->
		 <!-- 입력값들은 모두 form들어가야 한다.  -->
		 <!--action: 입력값을 받아서 처리하는 다음페이지를 지정 -->
		 <form action="수정db.jsp"><!--자바로 서버를 만드는곳  -->
		 아이디: <input name="id" value="<%=bag.getId() %>" readonly="readonly"><br><!-- jsp = java server page -->
		 새 비밀번호: <input name="pw1"><br>
		 새 비밀번호 확인: <input name="pw2"><br> 
		 휴대폰 번호: <select name="company" >
		 	<option value="SKT"<% if(bag.getCompany().equals("SKT")) { %> selected<% } %> >SKT</option>  
		 	<option value="LG"<% if(bag.getCompany().equals("LG")) { %> selected<% } %> >LG</option>
		 	<option value="KT"<% if(bag.getCompany().equals("KT")) { %> selected<% } %> >KT</option>
		 </select>
		 <input name="tel" value="<%=bag.getTel()%>"><br>
		 이메일: <input name="email" value="<%=bag.getEmail()%>"><br>
		 
		 카드: <select name="card">
		 	<option value="hana"<% if(bag.getCard().equals("hana")) { %> selected<% } %>>하나</option>
		 	<option value="kb"<% if(bag.getCard().equals("kb")) { %> selected<% } %>>KB국민</option>
		 	<option value="sinhan"<% if(bag.getCard().equals("sinhan")) { %> selected<% } %>>신한</option>
		 	<option value="lotte"<% if(bag.getCard().equals("lotte")) { %> selected<% } %>>롯데</option> <!-- 이거 왜 이렇게 나오지?----------
		 	 -->
		 	<option value="bc"<% if(bag.getCard().equals("bc")) { %> selected<% } %>>BC</option>
		 	<option value="nh<% if(bag.getCard().equals("nh")) { %> selected<% } %>">NH농협</option>
		 	<option value="sam<% if(bag.getCard().equals("sam")) { %> selected<% } %>">삼성</option>
		 	<option value="hyun<% if(bag.getCard().equals("hyun")) { %> selected<% } %>">현대</option>
		 </select>
		 카드번호: <input name="cardnum" value="<%=bag.getCardnum() %>"><br>
		 <button type="submit">수정 완료</button>
		 <!--네트워크를 위한 것: 랜선, ip, 포트   -->
		 </form>
       <!-- DB전담, 데이터전달묶는 가방 .java필요, 가방이 많으면 그것보다 큰 묶음-->
       
       
       
</body>
</html>