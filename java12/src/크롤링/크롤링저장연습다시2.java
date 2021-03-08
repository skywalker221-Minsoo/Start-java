package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링저장연습다시2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://shop.danawa.com/main/?controller=goods&methods=index&productRegisterAreaGroupSeq=20&serviceSectionSeq=594&cate=1#1");
		Document doc = con.get();

		Elements anav = doc.select("dl dd ul");
		
		for (int i = 0; i < anav.size(); i++) {
			System.out.println(anav.get(i).text());
		}	
	}
}
