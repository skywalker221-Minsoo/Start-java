
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
									<a href="/movie/bi/mi/basic.nhn?code=190382">
									<img src="https://movie-phinf.pstatic.net/20210217_105/1613522931191Xy0ke_JPEG/movie_image.jpg?type=m99_141_2"
										alt="새해전야"></a>
								</div>
								<dl class="lst_dsc">
									<dt class="tit">
										<span class="ico_rating_12">12세 관람가</span>
										<a href="/movie/bi/mi/basic.nhn?code=190382">새해전야</a>
									</dt>
									<dd>
										<dl class="info_txt1">
											<dt class="tit_t1">평점 | 
												<a href="/movie/bi/mi/point.nhn?code=193328#pointAfterTab">
												<span class="st_off"><span class="st_on" style="width: 71.7%"></span></span>
												<span class="num">7.17</span></a>
											</dt>
											<dt class="tit_t1">개요 | 
												<span class="link_txt">
												<a href="/movie/sdb/browsing/bmovie.nhn?genre=5">멜로/로맨스</a></span>
												<span class="split">|</span> 114분 <span class="split">|</span> 2021.02.10 개봉
											</dt>
											<dt class="tit_t2">감독 | 
												<span class="link_txt">
												<a href="/movie/bi/pi/basic.nhn?code=3937">홍지영</a><!-- N=a:nol.director,r:1 -->
												</span>
											</dt>
											<dt class="tit_t3">출연 | 
												<span class="link_txt">
													<a href="/movie/bi/pi/basic.nhn?code=30763">김강우</a><!-- N=a:nol.actor,r:1 -->,
													<a href="/movie/bi/pi/basic.nhn?code=107804">유인나</a><!-- N=a:nol.actor,r:2 -->,
													<a href="/movie/bi/pi/basic.nhn?code=157303">유연석</a><!-- N=a:nol.actor,r:3 -->,
													<a href="/movie/bi/pi/basic.nhn?code=53812">이연희</a><!-- N=a:nol.actor,r:4 -->,
													<a href="/movie/bi/pi/basic.nhn?code=338646">이동휘</a><!-- N=a:nol.actor,r:5 -->,
													<a href="/movie/bi/pi/basic.nhn?code=369307">천두링</a><!-- N=a:nol.actor,r:6 -->,
													<a href="/movie/bi/pi/basic.nhn?code=43815">염혜란</a><!-- N=a:nol.actor,r:7 -->,
													<a href="/movie/bi/pi/basic.nhn?code=139633">수영</a><!-- N=a:nol.actor,r:8 -->,
													<a href="/movie/bi/pi/basic.nhn?code=175928">유태오</a><!-- N=a:nol.actor,r:9 -->
												</span>
											</dt>
										</dl>
									</dd>
								<dd class="info_t5">
									<div class="btn_area">
										<iframe width="560" height="315" src="https://www.youtube.com/embed/LOqAhPIS3Ms" frameborder="0"
										allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
										allowfullscreen></iframe>
									</div>
								</dd>
								<dd class="info_t6">
									이제까진 현.망.진.창! 앞으로는 괜.찮.겠.죠?<br><br>
									강력반에서 좌천되어 신변보호 업무를 떠 맡게 된 이혼 4년 차 자.만.추 형사 ‘지호’(김강우)와<br>
									이혼 소송 중 신변보호를 요청한 완벽주의 재활 트레이너 ‘효영’(유인나)<br>
									현타와 함께 찾아온 번아웃에 아르헨티나로 도망친 현지 와인 배달원 ‘재헌’(유연석)과<br>
									일방적인 남친의 이별통보에 무작정 아르헨티나로 떠난 스키장 비정규직 ‘진아’(이연희)<br>
									사기를 당해 결혼 자금 탈탈 털린 여행사 대표 ‘용찬’(이동휘)과<br>
									결혼을 앞두고 한국지사로 발령받아 온 대륙의 예비 신부 ‘야오린’(천두링)<br>
									그리고 하나뿐인 남동생 국제결혼에 심란한 동생 바라기 예비 시누이 ‘용미’(염혜란)<br>
									세상의 편견에 부딪혀 오랜 연인에게 미안한 패럴림픽 국가대표 ‘래환’(유태오)<br>
									사랑 앞에 어떤 장애도 없다고 믿는 씩씩한 긍정퀸 원예사 ‘오월’(최수영)<br>
									새해까지 남은 시간 일주일  한 뼘 더 행복해지고 싶은 네 커플의 두렵지만 설렘 가득한 이야기가 시작된다!
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