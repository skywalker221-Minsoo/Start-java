package 크롤링;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://shop.danawa.com/shopmain/?logger_kw=shop_top_pcmain");
		// Jsoup.connect("http://naver.com").get(); .이 계속 있는 코드 : chain식 코드

		// 2. 연결한 사이트에 html문서를 받아오기.
		Document doc = con.get();
		// System.out.println(doc);
		Elements anav = doc.select("span.bg_prod_img p.desc_prod"); //태그가 다음 줄으면 한칸 스페이스바
																   //태그가 같은 꺽쇄 안에 있으면 .찍어줘야한다.
																   //바로 밑 태고 : >

		for (int i = 0; i < anav.size(); i++) {
			System.out.println(i + " : " + anav.get(i).text());
		}
			
		Elements imgs = doc.getElementsByTag("img"); //img 크롤링
		for (int j = 0; j < imgs.size(); j++) {
			String src = imgs.get(j).attr("src");
			System.out.println(src);
		}

	}

}
