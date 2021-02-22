<%@ page import="DB.MovieDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//HttpServletRequest request2 = new HttpServletRequest();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String genre = request.getParameter("genre");
	
%>

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
		<div id="center">
			<div id="content">
				<div class="article">
					<div class="obj_section">
						<div class="lst_wrap">
							<ul class="lst_detail_t1">
							
								<li>
									<div class="thumb">
										<a href="specific1.jsp">
										<img src="https://movie-phinf.pstatic.net/20210107_160/1609984702837oNdmw_JPEG/movie_image.jpg?type=m99_141_2"
											alt="소울"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_all">소울 </span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class = ico_rating_all>15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 93.3%"></span></span>
													<span class="num">9.33</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">애니메이션</span>
													<span class="split">|</span>107분 <span class="split">|</span> 2021.01.20 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">피트 닥터</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">제이미 폭스, 티나 페이, 다비드 딕스</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=184517" class="btn_rsv">결재하기</a><!-- 결재페이지 소환!! --><!-- N=a:nol.ticket,r:1,i:184517 -->
											</div>
											<div class="btn_t1">    
												<a href="specific1.jsp" class="item2">예고편</a> <!-- N=a:nol.trailer,r:1,i:184517 -->
											</div>
										</dd>
									</dl>
								</li>
	
								<li>
									<div class="thumb">
										<a href="specific2.jsp">
										<img src="https://movie-phinf.pstatic.net/20210126_174/1611638248803840HH_JPEG/movie_image.jpg?type=m99_141_2"
											alt="극장판 귀멸의 칼날: 무한열차편"></a><!-- N=a:nol.img,r:2,i:196051 -->
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_all">극장판 귀멸의 칼날 : 무한열차편 </span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class = ico_rating_all>15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 92.2%"></span></span>
													<span class="num">9.22</span><!-- N=a:nol.urating -->
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">애니메이션</span>
													<span class="split">|</span> 117분 <span class="split">|</span> 2021.01.27 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">소토자키 하루오</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">하나에 나츠키, 키토 아카리</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=196051" class="btn_rsv">결재하기</a><!-- N=a:nol.ticket,r:2,i:196051 -->
											</div>
											<div class="btn_t1">
												<a href="specific2.jsp" class="item2">예고편</a> <!-- N=a:nol.trailer,r:2,i:196051 -->
											</div>
											
										</dd>
									</dl>
								</li>
								
								<li>
									<div class="thumb">
										<a href="specific3.jsp">
										<img src="https://movie-phinf.pstatic.net/20210217_241/1613552832867Ef7Rb_JPEG/movie_image.jpg?type=m99_141_2"
											alt="미션 파서블"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_15">미션 파서블</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_15">15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 81.8%"></span></span>
													<span class="num">8.18</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">코미디, 액션</span>
													<span class="split">|</span> 105분 <span class="split">|</span> 2021.02.17 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">김형주</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">김영광, 이선빈</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=189124" class="btn_rsv">결재하기</a><!-- N=a:nol.ticket,r:3,i:189124 -->
											</div>
											<div class="btn_t1">
												<a href="specific3.jsp" class="item2">예고편</a><!-- N=a:nol.trailer,r:3,i:189124 -->
											</div>
										</dd>
									</dl>
								</li>
		
								<li>
									<div class="thumb">
										<a href="specific4.jsp">
										<img src="https://movie-phinf.pstatic.net/20210217_105/1613522931191Xy0ke_JPEG/movie_image.jpg?type=m99_141_2"
											alt="새해전야"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_12">새해전야</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_12">12세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 71.7%"></span></span>
													<span class="num">7.17</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">멜로, 로맨스</span>
													<span class="split">|</span> 114분 <span class="split">|</span> 2021.02.10 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">홍지영</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">김강우, 유인나, 유연석, 이연희, 이동휘, 천두링, 염혜란, 수영, 유태오</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=190382" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
													<a href="specific4.jsp" class="item2">예고편</a>
											</div>
										</dd>
									</dl>
								</li>
		
								<li>
									<div class="thumb">
										<a href="specific5.jsp">
										<img src="https://movie-phinf.pstatic.net/20210114_78/1610588407942CoL2I_JPEG/movie_image.jpg?type=m99_141_2"
											alt="세자매"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_15">세자매</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_15">15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 84.6%"></span></span>
													<span class="num">8.46</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">드라마</span>
													<span class="split">|</span> 115분 <span class="split">|</span> 2021.01.27 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">이승원</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">문소리, 김선영, 장윤주</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=193328" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
												<a href="specific5.jsp" class="item2">예고편</a><!-- N=a:nol.trailer,r:5,i:193328 -->
											</div>
										</dd>
									</dl>
								</li>
								
								<li>
									<div class="thumb">
										<a href="specific6.jsp">
										<img src="https://movie-phinf.pstatic.net/20210201_280/16121642953139VXAE_JPEG/movie_image.jpg?type=m99_141_2"
											alt="더블패티"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_15">더블패티</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_15">15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 75.4%"></span></span>
													<span class="num">7.54</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">드라마</span>
													<span class="split">|</span> 107분 <span class="split">|</span> 2021.02.17 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">백승환</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">신승호, 아이린, 송지인</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=196361" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
												<a href="specific6.jsp" class="item2">예고편</a> <!-- N=a:nol.trailer,r:6,i:196361 -->
											</div>
										</dd>
									</dl>
								</li>
		
								<li>
									<div class="thumb">
										<a href="specific7.jsp">
										<img src="https://movie-phinf.pstatic.net/20210129_146/1611912316783y8rDf_JPEG/movie_image.jpg?type=m99_141_2"
											alt="해리 포터와 불의 잔"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_12">해리 포터와 불의 잔</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_12">12세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 80.1%"></span></span>
													<span class="num">8.01</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">판타지, 가족, 모험, 액션</span>
													<span class="split">|</span> 156분 <span class="split">|</span> 2021.02.10 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">마이크 뉴웰</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">다니엘 래드클리프, 엠마 왓슨, 루퍼트 그린트</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=37883" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
												<a href="specific7.jsp" class="item2">예고편</a> <!-- N=a:nol.trailer,r:7,i:37883 -->
											</div>
										</dd>
									</dl>
								</li>
		
								<li>
									<div class="thumb">
										<a href="specific8.jsp">
										<img src="https://movie-phinf.pstatic.net/20210111_41/1610333478672K6ihS_JPEG/movie_image.jpg?type=m99_141_2"
											alt="해피 투게더"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_15">해피 투게더</span>
										</dt>
										<dd>
											<dl class="info_txt1">
											<span class="ico_rating_15">15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 91.8%"></span></span>
													<span class="num">9.18</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">드라마</span>
													<span class="split">|</span> 97분 <span class="split">|</span> 2021.02.04 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">왕가위</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">장국영, 양조위, 장첸</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=19335" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
												<a href="specific8.jsp" class="item2">예고편</a>
											</div>
										</dd>
									</dl>
								</li>
		
								<li>
									<div class="thumb">
										<a href="specific9.jsp">
										<img src="https://movie-phinf.pstatic.net/20210125_20/1611551696077lGGQ8_JPEG/movie_image.jpg?type=m99_141_2"
											alt="해변의 에트랑제"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_15">해변의 에트랑제</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_15">15세 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 94.1%"></span></span>
													<span class="num">9.41</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">애니메이션, 멜로, 로맨스
													<span class="split">|</span> 59분 <span class="split">|</span> 2021.02.18 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">오오하시 아키요</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">무라타 타이시, 마츠오카 요시츠구, 시마무라 유우, 이토 카나에</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=196375" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
												<a href="specific9.jsp" class="item2">예고편</a><!-- N=a:nol.trailer,r:9,i:196375 -->
											</div>
										</dd>
									</dl>
								</li>
		
								<li>
									<div class="thumb">
										<a href="specific10.jsp">
										<img src="https://movie-phinf.pstatic.net/20210107_98/1610010371111nd2e9_JPEG/movie_image.jpg?type=m99_141_2"
											alt="드림빌더"></a>
									</div>
									<dl class="lst_dsc">
										<dt class="tit">
											<span class="ico_rating_all">드림빌더</span>
										</dt>
										<dd>
											<dl class="info_txt1">
												<span class="ico_rating_all">전체 관람가</span>
												<dt class="tit_t1">평점 | 
													<span class="st_off"><span class="st_on" style="width: 86.7%"></span></span>
													<span class="num">8.67</span>
												</dt>
												<dt class="tit_t2">개요 | 
													<span class="link_txt">애니메이션, 모험, 가족, 판타지</span>
													<span class="split">|</span> 80분 <span class="split">|</span> 2021.02.10 개봉
												</dt>
												<dt class="tit_t3">감독 | 
													<span class="link_txt">킴 하겐 젠슨</span>
												</dt>
												<dt class="tit_t4">출연 | 
													<span class="link_txt">
													</span>
												</dt>
											</dl>
										</dd>
										<dd class="info_t1">
											<div class="btn_area">
												<a href="/movie/bi/mi/reserve.nhn?code=196375" class="btn_rsv">결재하기</a>
											</div>
											<div class="btn_t1">
												<a href="specific10.jsp" class="item2">예고편</a><!-- N=a:nol.trailer,r:9,i:196375 -->
											</div>
										</dd>
									</dl>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>