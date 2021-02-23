-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: movie
-- ------------------------------------------------------
-- Server version	5.5.62

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `board` (
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES ('010','kim@abc.com','문의','Ask','Question'),('011','lee@abc.com','불만','Annoying','Upset'),('012','park@abc.com','칭찬','Praise','Thank you.'),('013','choi@abc.com','제안','Suggestion','Add movies.'),('014','jung@abc.com','문의','궁금합니다.','안녕하세요, 문의드릴게 있어 게시글 남겨요!\r\n감사합니다!'),('015','jang@abc.com','칭찬','칭찬합니다.','안녕하세요, 칭찬글 남깁니다. 수고하세요!'),('016','nam@abc.com','불만','불만입니다.','불만이 아주 많습니다. 조심하세요.'),('017','bang@abc.com','문의','문의드립니다.','가까운 식당은 어디에 있나요?'),('019','bing@abc.com','제안','드라마, 영화 업데이트.','새로운게 좋아요.'),('018','yeo@abc.com','칭찬','칭찬합니다.','이건 특급칭찬이야'),('111','1111','불만','111','111111');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `content` (
  `id` varchar(100) NOT NULL DEFAULT '',
  `title` varchar(100) DEFAULT NULL,
  `birth` varchar(100) DEFAULT NULL,
  `genre` varchar(20) DEFAULT NULL,
  `fee` varchar(10) DEFAULT NULL,
  `video` varchar(500) DEFAULT NULL,
  `story` varchar(2000) DEFAULT NULL,
  `rank` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
INSERT INTO `content` VALUES ('1','소울','2021-01-20','애니메이션','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Q0zFPlArth0\" frameborder=\"0\" ','나는 어떻게 ‘나’로 태어나게 되었을까?<br><br>지구에 오기 전 영혼들이 머무는 ‘태어나기 전 세상’이 있다면?<br><br>뉴욕에서 음악 선생님으로 일하던 ‘조’는  꿈에 그리던 최고의 밴드와 재즈 클럽에서 연주하게 된 그 날,<br>예기치 못한 사고로 영혼이 되어 ‘태어나기 전 세상’에 떨어진다.<br>탄생 전 영혼들이 멘토와 함께 자신의 관심사를 발견하면 지구 통행증을 발급하는 ‘태어나기 전 세상’<br>‘조’는 그 곳에서 유일하게 지구에 가고 싶어하지 않는 시니컬한 영혼 ‘22’의 멘토가 된다.<br>링컨, 간디, 테레사 수녀도 멘토되길 포기한 영혼 ‘22’<br><br>꿈의 무대에 서려면 ‘22’의 지구 통행증이 필요한 ‘조’<br>그는 다시 지구로 돌아가 꿈의 무대에 설 수 있을까?','9.33'),('10','드림빌더','2021-02-10','애니메이션, 모험, 가족, 판타지','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/e89AAWYpGS8\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','내 꿈을 만드는 누군가가 있다?<br><br>자상한 아빠, 귀여운 햄스터 \'비고\'와 행복한 나날을 보내던 소녀 \'미나\'는 새로운 가족 ‘제니’의 등장으로  평온하던 일상에 변화가 찾아오고 급기야 ‘비고’를 잃을 위기에 처한다.<br>그러던 어느 날 밤, 우연히 꿈속 세상을 발견한 ‘미나’는 그곳에서 마치 영화처럼 꿈을 만드는 드림빌더를 만나게 되고,<br>소중한 반려 햄스터 ‘비고’와 평온한 일상을 되찾기 위해 깜찍한 계획을 세우는데…<br>모두가 잠든 밤, 상상하는 모든 것이 이루어지는 꿈의 세계가 펼쳐진다!','8.67'),('2','극장판 귀멸의칼날 : 무한열차편','2021-01-27','애니메이션','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/R5sTnuMODDw\" ','혈귀로 변해버린 여동생 ‘네즈코’를 인간으로 되돌릴 단서를 찾아 비밀조직 귀살대에 들어간 ‘탄지로.’<br>‘젠이츠’, ‘이노스케’와 새로운 임무 수행을 위해 무한열차에 탑승 후  귀살대 최강 검사 염주 ‘렌고쿠’와 합류한다.<br>달리는 무한열차에서 승객들이 하나 둘 흔적 없이 사라지자  숨어있는 식인 혈귀의 존재를 직감하는 ‘렌고쿠’.<br>귀살대 ‘탄지로’ 일행과 최강 검사 염주 ‘렌고쿠’는  어둠 속을 달리는 무한열차에서 모두의 목숨을 구하기 위해  예측불가능한 능력을 가진 혈귀와 목숨을 건 혈전을 시작하는데…','9.22'),('3','미션 파서블','2021-02-17','코미디, 액션','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/WAcsM3M685E\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','줄거리 “돈 되니까” VS “국가를 위해” 우린, 한다면 한다!<br><br>입금만 되면 뭐든 가능해지는 흥신소 사장 ‘우수한’ 앞에  어느 날 열정 충만 비밀 요원 ‘유다희’가 현금 천 만원과 함께 찾아 온다.<br>무기 밀매 사건을 해결하자며, 대놓고 공조를 요청해 온 것! 티격태격 하는 말마다 태클, 우당탕탕 하는 짓마다 사건! 혼자일 때보다 둘일 때 더 눈에 띄는 두 사람.<br>작전을 거듭해 갈수록 사건은 커져만 가고, 형사들이 오해할만한 단서를 여기저기 흘리고 다녀 수배 목록에 오르기도 하지만 우수한X유다희, 아찔한 이 공조를 멈출 수는 없다!','8.18'),('4','새해전야','2021-02-10','멜로, 로맨스','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/LOqAhPIS3Ms\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','이제까진 현.망.진.창! 앞으로는 괜.찮.겠.죠?<br><br>강력반에서 좌천되어 신변보호 업무를 떠 맡게 된 이혼 4년 차 자.만.추 형사 ‘지호’(김강우)와<br>이혼 소송 중 신변보호를 요청한 완벽주의 재활 트레이너 ‘효영’(유인나)<br>현타와 함께 찾아온 번아웃에 아르헨티나로 도망친 현지 와인 배달원 ‘재헌’(유연석)과<br>일방적인 남친의 이별통보에 무작정 아르헨티나로 떠난 스키장 비정규직 ‘진아’(이연희)<br>사기를 당해 결혼 자금 탈탈 털린 여행사 대표 ‘용찬’(이동휘)과<br>결혼을 앞두고 한국지사로 발령받아 온 대륙의 예비 신부 ‘야오린’(천두링)<br>그리고 하나뿐인 남동생 국제결혼에 심란한 동생 바라기 예비 시누이 ‘용미’(염혜란)<br>세상의 편견에 부딪혀 오랜 연인에게 미안한 패럴림픽 국가대표 ‘래환’(유태오)<br>사랑 앞에 어떤 장애도 없다고 믿는 씩씩한 긍정퀸 원예사 ‘오월’(최수영)<br>새해까지 남은 시간 일주일  한 뼘 더 행복해지고 싶은 네 커플의 두렵지만 설렘 가득한 이야기가 시작된다!','7.17'),('5','세자매','2021-01-27','드라마','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Pdu2f5Xr3Qk\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','“언니가 늘 기도하는거 알지?” 완벽한 척하는 가식덩어리 둘째 ‘미연’(문소리)<br>“내가 미안하다” 괜찮은 척하는 소심덩어리 첫째 ‘희숙’(김선영)<br>“나는 쓰레기야” 안 취한 척하는 골칫덩어리 셋째 ‘미옥’(장윤주)<br>각자 아무렇지 않은 척 살아가던 세 자매는 아버지 생일을 맞아 오랜만에 한 자리에 모이는데...<br><br>내 부모에게 진정한 사과를 받고 싶었던, 문제적 자매들이 폭발한다!','8.46'),('6','더블패티','2021-02-17','드라마','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/eil4cC-B54I\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','세상을 향한 이들의 뒤집기 한.판.승!<br>입 찢어지게 햄버거를 먹던 너  냉삼에 소맥을 찰지게 말던 너  보기만 해도 ‘힘’이 솟는 이들의  멋진 도전이 펼쳐진다!<br><br>“밥 먼저 먹고 시작할까요?”','7.54'),('7','해리 포터와 불의 잔','2005-12-01','판타지, 가족, 모험, 액션','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/uzZ_y3wShe0\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','최강의 챔피언을 찾아라!트리위저드 마법경연대회!<br>그러나 올해는 예년과 상황이 좀 다르다.<br>덤블도어 교장은 유럽의 세 개 명문 마법학교의 결속을 다지기 위해 그간 중단됐던 호그와트에서 \'트리위저드 대회\'를 개최한다고 발표한다.<br>트리위저드 대회는 마법의 최고 명문 3개 학교에서 선발된 챔피언 한 명씩 출전해 트리위저드 컵을 놓고 목숨을 건 경합을 벌이는 마법사들 세계에서 가장 흥미진진하고 위험한 마법경연대회.<br>마법의 \'불의 잔\'이 각 학교 출전자를 선발하는 의식이 열리고 현란한 불꽃의 축제 속에 불의 잔은 마침내 세 학생의 이름을 호명한다.<br>강인한 불가리아 덤스트랭 학교의 퀴디치 경기 슈퍼스타인 빅터 크룸(스타니슬라브 이아네브스키)과 우아한 보바통 마법아카데미의 플뢰르 델라쿠르(클레멘스 포에시),<br>그리고 호그와트의 최고 인기남 케드릭 디고리(로버트 패틴슨). 그러나 세 명의 이름이 다 호명된 후, 뜻밖에도 불의 잔은 또 한 명의 이름을 내뱉는다.<br>바로 \'해리포터\'!<br><br>불의 잔을 향한 최강의 스펙터클이 펼쳐진다!<br>그러던 중 호그와트 교정에서 누군가 살해되면서 상황은 급변한다.<br>볼드모트의 악몽으로 두려움에 휩싸인 해리는 덤블도어를 찾아가지만 그 역시도 뚜렷한 해답을 제시하지 못한다.<br>경기가 진행되고 해리와 다른 출전자들이 마지막 과제를 풀기 위해 안간힘을 쓰고 있을 때 무언가가 계속 이들을 주시한다.<br>승리가 목전에 다가온 그 순간, 이제까지의 모든 진실이 밝혀지고 해리포터에게는 진정한 악과의 피할 수 없는 대결이 기다리고 있는데….','8.01'),('8','해피 투게더','1998-08-22','드라마','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/TKIat7D872c\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','“우리 다시 시작하자”<br><br>그가 다시 시작하자고 하면 난 늘 그와 함께했다 홍콩을 떠나 지구 반대편 부에노스아이레스에 온 ‘보영’과 ‘아휘’<br>이과수 폭포를 찾아가던 중 두 사람은  사소한 다툼 끝에 이별하고 각자의 길을 떠난다.<br>얼마 후 상처투성이로 ‘아휘’의 앞에 다시 나타난 ‘보영’은  무작정 “다시 시작하자”고 말한다.<br>서로를 위로하며 점차 행복한 시간을 보내는 두 사람.<br>하지만 ‘보영’의 변심이 두려운 ‘아휘’와  ‘아휘’의 구속이 견디기 힘든 ‘보영’은  또다시 서로의 마음에 상처 내는 말을 내뱉은 뒤 헤어지는데...','9.18'),('9','해변의 에트랑제','2021-02-18','애니메이션, 멜로, 로맨스','10000','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/EVibfarEMyU\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>','다르지 않아, 우린 그저 사랑하고 있을 뿐.<br><br>그 바다, 네가 파도처럼 밀려왔다 오키나와 외딴섬, 해변 벤치에 혼자 멈춰있는 소년 ‘미오’.<br>그런 미오가 몹시 신경 쓰이는 소설가 지망생 ‘슌’. 우연한 계기로 가까워졌다 생각한 순간, 미오가 돌연 섬을 떠난다.<br>그리고 3년 후, 그토록 그리워하던 서로를 다시 만난 둘은 이제 마음을 알아가며 서툴지만 따뜻한 사랑을 시작하는데…','9.41');
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `id` varchar(100) DEFAULT NULL,
  `pw` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `birth` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `card` varchar(100) DEFAULT NULL,
  `cardnum` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('root','1234','park','SKT','010','999999','cqq','hana','032102310');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perchase`
--

DROP TABLE IF EXISTS `perchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perchase` (
  `perchaseNum` int(11) DEFAULT NULL,
  `clientId` varchar(100) DEFAULT NULL,
  `cardCompany` varchar(100) DEFAULT NULL,
  `cardNum` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `movieId` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perchase`
--

LOCK TABLES `perchase` WRITE;
/*!40000 ALTER TABLE `perchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `perchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qna`
--

DROP TABLE IF EXISTS `qna`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qna` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) NOT NULL,
  `title` varchar(50) NOT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `views` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qna`
--

LOCK TABLES `qna` WRITE;
/*!40000 ALTER TABLE `qna` DISABLE KEYS */;
INSERT INTO `qna` VALUES (6,'[멤버십]','멤버십 할인은 어떻게 받나요?','포인트는 1,000포인트 이상 적립시 현금과 동일하게 사용 가능합니다.',5),(7,'[할인혜택]','할인되는 카드는 어떤게 있나요?','자세한 안내는 홈페이지\'OOO 페이지\'에서 확인 가능합니다.',4),(8,'[결제관련]','환불 정책은 어떻게 되나요?','상품권 표준약관에 의거 상품권은 현금으로 반환하지 않습니다.',4);
/*!40000 ALTER TABLE `qna` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'movie'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-23 23:42:33
