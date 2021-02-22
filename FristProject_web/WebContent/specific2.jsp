
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
								<a href="/movie/bi/mi/basic.nhn?code=196051">
								<img src="https://movie-phinf.pstatic.net/20210126_174/1611638248803840HH_JPEG/movie_image.jpg?type=m99_141_2"
									alt="극장판 귀멸의 칼날: 무한열차편"></a><!-- N=a:nol.img,r:2,i:196051 -->
								</div>
								<dl class="lst_dsc">
									<dt class="tit">
										<span class="ico_rating_15">15세 관람가</span>
										<a href="/movie/bi/mi/basic.nhn?code=196051">극장판 귀멸의 칼날 : 무한열차편</a><!-- N=a:nol.title,r:2,i:196051 -->
									</dt>
									<dd class="star">

									</dd>
									<dd>
										<dl class="info_txt1">
											<dt class="tit_t1">평점 | 
												<a href="/movie/bi/mi/point.nhn?code=193328#pointAfterTab">
												<span class="st_off"><span class="st_on" style="width: 92.2%"></span></span>
												<span class="num">9.22</span></a><!-- N=a:nol.urating -->
											</dt>
											<dt class="tit_t2">개요 | 
												<span class="link_txt">
												<a href="/movie/sdb/browsing/bmovie.nhn?genre=15">애니메이션</a><!-- N=a:nol.genre,r:1 -->
												</span> <span class="split">|</span> 117분 <span class="split">|</span> 2021.01.27 개봉
											</dt>
											<dt class="tit_t3">감독 | 
												<span class="link_txt">
												<a href="/movie/bi/pi/basic.nhn?code=440907">소토자키 하루오</a><!-- N=a:nol.director,r:1 -->
												</span>
											</dt>
											<dt class="tit_t4">출연 | 
												<span class="link_txt">
												<a href="/movie/bi/pi/basic.nhn?code=337130">하나에 나츠키</a><!-- N=a:nol.actor,r:1 -->,
												<a href="/movie/bi/pi/basic.nhn?code=443979">키토 아카리</a><!-- N=a:nol.actor,r:2 -->
												</span>
											</dt>
										</dl>
									</dd>
									<dd class="info_t5">
										<div class="btn_area">
											<iframe width="560" height="315" src="https://www.youtube.com/embed/R5sTnuMODDw" 
											frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
											allowfullscreen></iframe>
										</div>
									</dd>
									<dd class="info_t6">
										혈귀로 변해버린 여동생 ‘네즈코’를 인간으로 되돌릴 단서를 찾아 비밀조직 귀살대에 들어간 ‘탄지로.’<br>
										‘젠이츠’, ‘이노스케’와 새로운 임무 수행을 위해 무한열차에 탑승 후  귀살대 최강 검사 염주 ‘렌고쿠’와 합류한다.<br>
										달리는 무한열차에서 승객들이 하나 둘 흔적 없이 사라지자  숨어있는 식인 혈귀의 존재를 직감하는 ‘렌고쿠’.<br>
										귀살대 ‘탄지로’ 일행과 최강 검사 염주 ‘렌고쿠’는  어둠 속을 달리는 무한열차에서 모두의 목숨을 구하기 위해  예측불가능한 능력을 가진 혈귀와 목숨을 건 혈전을 시작하는데…
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