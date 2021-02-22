
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
									<a href="/movie/bi/mi/basic.nhn?code=19335">
									<img src="https://movie-phinf.pstatic.net/20210111_41/1610333478672K6ihS_JPEG/movie_image.jpg?type=m99_141_2"
										alt="해피 투게더"></a>
								</div>
								<dl class="lst_dsc">
									<dt class="tit">
										<span class="ico_rating_15">15세 관람가</span>
										<a href="/movie/bi/mi/basic.nhn?code=19335">해피 투게더</a>
									</dt>
									<dd>
										<dl class="info_txt1">
											<dt class="tit_t1">평점 | 
												<a href="/movie/bi/mi/point.nhn?code=19335#pointAfterTab">
												<span class="st_off"><span class="st_on" style="width: 91.8%"></span></span>
												<span class="num">9.18</span></a>
											</dt>
											<dt class="tit_t2">개요 | 
												<span class="link_txt">
												<a href="/movie/sdb/browsing/bmovie.nhn?genre=1">드라마</a><!-- N=a:nol.genre,r:1 -->
												</span> <span class="split">|</span> 97분 <span class="split">|</span> 2021.02.04 개봉
											</dt>
											<dt class="tit_t3">감독 | 
												<span class="link_txt">
												<a href="/movie/bi/pi/basic.nhn?code=1866">왕가위</a><!-- N=a:nol.director,r:1 -->
												</span>
											</dt>
											<dt class="tit_t4">출연 | 
												<span class="link_txt">
													<a href="/movie/bi/pi/basic.nhn?code=1945">장국영</a><!-- N=a:nol.actor,r:1 -->,
													<a href="/movie/bi/pi/basic.nhn?code=1850">양조위</a><!-- N=a:nol.actor,r:2 -->,
													<a href="/movie/bi/pi/basic.nhn?code=3552">장첸</a><!-- N=a:nol.actor,r:3 -->
												</span>
											</dt>
										</dl>
									</dd>
								<dd class="info_t5">
									<div class="btn_area">
										<iframe width="560" height="315" src="https://www.youtube.com/embed/TKIat7D872c" frameborder="0"
										allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
										allowfullscreen></iframe>
									</div>
								</dd>
								<dd class="info_t6">
									“우리 다시 시작하자”<br><br>
									그가 다시 시작하자고 하면 난 늘 그와 함께했다 홍콩을 떠나 지구 반대편 부에노스아이레스에 온 ‘보영’과 ‘아휘’<br>
									이과수 폭포를 찾아가던 중 두 사람은  사소한 다툼 끝에 이별하고 각자의 길을 떠난다.<br>
									얼마 후 상처투성이로 ‘아휘’의 앞에 다시 나타난 ‘보영’은  무작정 “다시 시작하자”고 말한다.<br>
									서로를 위로하며 점차 행복한 시간을 보내는 두 사람.<br>
									하지만 ‘보영’의 변심이 두려운 ‘아휘’와  ‘아휘’의 구속이 견디기 힘든 ‘보영’은  또다시 서로의 마음에 상처 내는 말을 내뱉은 뒤 헤어지는데...
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