<%@page import="DB.PurchaseVO"%>
<%@page import="DB.PurchaseDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//입력해서 전송된 데이터를 받아야 한다.
session.setAttribute("clientId", "root");
String clientId = session.getAttribute("clientId") + "";

//db전담하는 부품에서 db에 넣어달라고 할 예정.
PurchaseDAO db = new PurchaseDAO();
PurchaseVO bag = db.read(clientId); //
int money = 10000;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>:) 스마일</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript">
var IMP = window.IMP; // 생략가능
IMP.init('iamport'); 
function pay() {
	   IMP.request_pay({
	       pg : 'inicis', // version 1.1.0부터 지원.
	       pay_method : 'card',
	       merchant_uid : 'merchant_' + new Date().getTime(),
	       name : '주문명:결제테스트',
	       amount : <%= money %>,
	       buyer_email : 'admin@mega.co.kr' ,
	       buyer_name : '구매자이름',
	       buyer_tel : '010-1234-5678',
	       buyer_addr : '서울특별시 강남구 삼성동',
	       buyer_postcode : '123-456',
	       m_redirect_url : 'https://www.yourdomain.com/payments/complete'
	   }, function(rsp) {
	       if ( rsp.success ) {
	           var msg = '결제가 완료되었습니다.';
	           msg += '고유ID : ' + rsp.imp_uid;
	           msg += '상점 거래ID : ' + rsp.merchant_uid;
	           msg += '결제 금액 : ' + rsp.paid_amount;
	           msg += '카드 승인번호 : ' + rsp.apply_num;
	          location.href="http://www.naver.com"
	       } else {
	           var msg = '결제에 실패하였습니다.';
	           msg += '에러내용 : ' + rsp.error_msg;
	           location.href="http://www.daum.net"
	       }
	       alert(msg);
	   });
	}
	</script>
<style>
table, th {
  border: 1px solid black;
}

table {
  border-collapse: collapse;
  width: 100%;
}

td {
  text-align: center;
}
</style>

</head>
<body style="background-color: #DC1C78;">

	<p style="font-size: 50px;">구매하신 내역입니다</p>
	<!-- 표현식, expression -->
	<h2>구매하신 내역 정보요 여기요</h2>
	<p>당신은 아래 표를 보면 됩니다 제발로</p>
	<hr>
	
	<table border="1">
		<tr>
			<th>구매번호</th>
			<th>아이디</th>
			<th>카드사</th>
			<th>카드번호</th>
			<th>금액</th>
			<th>영화</th>
		</tr>
		<tr>
			<td><%=bag.getPerchaseNum()%></td>
			<td><%=bag.getClientId()%></td>
			<td><%=bag.getCardCompany()%></td>
			<td><%=bag.getCardNum()%></td>
			<td><%=bag.getPrice()%></td>
			<td><%=bag.getMovieId()%></td>
		</tr>
	</table>

	<p>
		<strong>Tip:</strong> 팁은 없습니다 왜냐하면 없으니까요
	</p>


		<button type="button" onclick="pay()">결제하기</button>



</body>
</html>