
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
									<a href="/movie/bi/mi/basic.nhn?code=196361">
									<img src="https://movie-phinf.pstatic.net/20210201_280/16121642953139VXAE_JPEG/movie_image.jpg?type=m99_141_2"
										alt="더블패티"></a>
								</div>
								<dl class="lst_dsc">
									<dt class="tit">
										<span class="ico_rating_15">15세 관람가</span>
											<a href="/movie/bi/mi/basic.nhn?code=196361">더블패티</a>
									</dt>
									<dd>
										<dl class="info_txt1">
											<dt class="tit_t1">평점 | 
												<a href="/movie/bi/mi/point.nhn?code=196361#pointAfterTab">
												<span class="st_off"><span class="st_on" style="width: 75.4%"></span></span>
												<span class="num">7.54</span></a>
											</dt>
											<dt class="tit_t1">개요 | 
												<span class="link_txt">
												<a href="/movie/sdb/browsing/bmovie.nhn?genre=1">드라마</a><!-- N=a:nol.genre,r:1 -->
												</span> <span class="split">|</span> 107분 <span class="split">|</span> 2021.02.17 개봉
											</dt>
											<dt class="tit_t2">감독 | 
												<span class="link_txt">
												<a href="/movie/bi/pi/basic.nhn?code=164380">백승환</a><!-- N=a:nol.director,r:1 -->
												</span>
											</dt>
											<dt class="tit_t3">출연 | 
												<span class="link_txt">
													<a href="/movie/bi/pi/basic.nhn?code=441041">신승호</a><!-- N=a:nol.actor,r:1 -->,
													<a href="/movie/bi/pi/basic.nhn?code=393676">아이린</a><!-- N=a:nol.actor,r:2 -->,
													<a href="/movie/bi/pi/basic.nhn?code=154985">송지인</a><!-- N=a:nol.actor,r:3 -->
												</span>
											</dt>
										</dl>
									</dd>
									<dd class="info_t5">
										<div class="btn_area">
											<iframe width="560" height="315" src="https://www.youtube.com/embed/eil4cC-B54I" frameborder="0"
											allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
											allowfullscreen></iframe>
										</div>
									</dd>
									<dd class="info_t6">
										세상을 향한 이들의 뒤집기 한.판.승!<br>
										입 찢어지게 햄버거를 먹던 너  냉삼에 소맥을 찰지게 말던 너  보기만 해도 ‘힘’이 솟는 이들의  멋진 도전이 펼쳐진다!<br><br>
										“밥 먼저 먹고 시작할까요?”
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