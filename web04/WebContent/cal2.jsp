<%@ page import="계산기.계산기"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- Ctrl + Shift + / : 자동 주석 -->
    <!-- n1, n2를 값을 받아주어야 함. -->
    <!-- n1, n2를 int로 바꾸어 주어야함. -->
    <!-- 계산기한테 두개를 더해달라고 해야한다. -->
    <!-- 더한 반환값을 받아와서 클라이언트에 전송(html만든 후 전송) -->
    
 <%
 	// HttpServletRequest request = new HttpServletRequest();
 	String n1 = request.getParameter("n1");
 	String n2 = request.getParameter("n2");
 	int s1 = Integer.parseInt(n1);
 	int s2 = Integer.parseInt(n2);
 	계산기 cal = new 계산기();
 	int result = cal.mul(s1, s2);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신의 두 수의 곱은 <%= result %>
</body>
</html>