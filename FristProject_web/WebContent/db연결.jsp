<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.PrintWriter"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String company = request.getParameter("company");
	String birth = request.getParameter("birth");
	
	
	String email = request.getParameter("email");
	
	String card = request.getParameter("card");
	String cardnum = request.getParameter("cardnum");
    // 1. 커넥터 사용하겠다고 설정해야함.
    Class.forName("com.mysql.jdbc.Driver");//company 제품 mysql.com거꾸로
    //PrintWriter out = new PrintWriter();
    out.write("1. 커넥터 사용 설정 성공. <br>");//브라우저에 찍는역할 out
    // 2. db연결해보자!-shop, root 1234(id, pw)
 	
    String url = "jdbc:mysql://localhost:3306/shop";//localhost에 포트3306을 입력하고 shop db로 연결!
   	//jsp에서의 자동 import: 클릭 후, 컨트롤+shift+m
    Connection con = DriverManager.getConnection(url, "root", "1234");//이걸로 3번
    out.write("2. db연결성공. <br>");//브라우저로 write
 
    // 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야 함.
    //String url = "http://www.naver.com";
    //URL url = new URL("http://www.naver.com") 이래야 인식
    //String sql = "insert into member values ('win', 'win', 'win', 'win', 'win', 'win', 'win', 'win')";
    String sql = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(sql);//java.sql로 !
   	ps.setString(1, id);
   	ps.setString(2, pw);
   	ps.setString(3, name);
   	ps.setString(4, tel);
   	ps.setString(5, birth);
   	ps.setString(6, email);
   	ps.setString(7, card);
   	ps.setString(8, cardnum);
    out.write("3. SQL문을 만들기 성공. <br>");
    //4. SQL문을 mySQL서버로 전송함.
	
	ps.executeUpdate();
    out.write("4. SQL문을 mySQL서버로 전송. <br>");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

       
       
     
</body>
</html>