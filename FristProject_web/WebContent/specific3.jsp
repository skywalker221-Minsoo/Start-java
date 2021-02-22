
<%@ page import="DB.MovieDB"%>
<%@ page import="DB.MovieVO"%>

<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="main_exterior.css">
<style></style>
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
		<div id="content">
			<div class="article">
				<div class="obj_section">
					<div class="lst_wrap">
						<ul class="lst_detail_t1">
							<li>
								<div class="thumb">
									<a href="/movie/bi/mi/basic.nhn?code=189124">
									<img src="https://movie-phinf.pstatic.net/20210217_241/1613552832867Ef7Rb_JPEG/movie_image.jpg?type=m99_141_2"
										alt="미션 파서블"></a><!-- N=a:nol.img,r:3,i:189124 -->
								</div>
								<dl class="lst_dsc">
									<dt class="tit">
										<span class="ico_rating_15">15세 관람가</span>
										<a href="/movie/bi/mi/basic.nhn?code=189124">미션 파서블</a><!-- N=a:nol.title,r:3,i:189124 -->
									</dt>
									<dd>
										<dl class="info_txt1">
											<dt class="tit_t1">평점 | 
												<a href="/movie/bi/mi/point.nhn?code=193328#pointAfterTab">
												<span class="st_off"><span class="st_on" style="width: 81.8%"></span></span>
												<span class="num">8.18</span></a>
											</dt>
											<dt class="tit_t2">개요 | 
												<span class="link_txt">
												<a href="/movie/sdb/browsing/bmovie.nhn?genre=11">코미디</a><!-- N=a:nol.genre,r:1 -->,
												<a href="/movie/sdb/browsing/bmovie.nhn?genre=19">액션</a><!-- N=a:nol.genre,r:2 -->
												</span> <span class="split">|</span> 105분 <span class="split">|</span> 2021.02.17 개봉
											</dt>
											<dt class="tit_t3">감독 | 
												<span class="link_txt">
												<a href="/movie/bi/pi/basic.nhn?code=432472">김형주</a><!-- N=a:nol.director,r:1 -->
												</span>
											</dt>
											<dt class="tit_t4">출연 | 
												<span class="link_txt"> <a
													href="/movie/bi/pi/basic.nhn?code=76474">김영광</a><!-- N=a:nol.actor,r:1 -->,
													<a href="/movie/bi/pi/basic.nhn?code=378097">이선빈</a><!-- N=a:nol.actor,r:2 -->
												</span>
											</dt>
										</dl>
									</dd>
									<dd class="info_t5">
										<iframe width="560" height="315" src="https://www.youtube.com/embed/WAcsM3M685E" frameborder="0"
										allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
										allowfullscreen></iframe>
									</dd>
									<dd class="info_t6">
										줄거리 “돈 되니까” VS “국가를 위해” 우린, 한다면 한다!<br><br>
										입금만 되면 뭐든 가능해지는 흥신소 사장 ‘우수한’ 앞에  어느 날 열정 충만 비밀 요원 ‘유다희’가 현금 천 만원과 함께 찾아 온다.<br>
										무기 밀매 사건을 해결하자며, 대놓고 공조를 요청해 온 것! 티격태격 하는 말마다 태클, 우당탕탕 하는 짓마다 사건! 혼자일 때보다 둘일 때 더 눈에 띄는 두 사람.<br>
										작전을 거듭해 갈수록 사건은 커져만 가고, 형사들이 오해할만한 단서를 여기저기 흘리고 다녀 수배 목록에 오르기도 하지만 우수한X유다희, 아찔한 이 공조를 멈출 수는 없다!
									</dd>
								</dl>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>