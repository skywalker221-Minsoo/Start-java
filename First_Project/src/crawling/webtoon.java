package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class webtoon {

	public static void main(String[] args) {
		select selectSql = new select();
		insert insertSql = new insert();
		
		Document doc = null;
		javax.lang.model.util.Elements elemList = new Elements();
		String URL = "http://comic.naver.com/webtoon/weekday.nhn";
		String[] dateArr = {"h4.mon", "h4.tue", "h4.wed", "h4.thu", "h4.fri", "h4.sat", "h4.sun"};
		
		try {
			Connection connection = Jsoup.connect(URL)
				.userAgent("여기에 PC 유저 에이전트 넣기")
				.header("Accept", "text/html")
			.header("Accept-Encoding", "gzip,deflate")
			.header("Accept-Language", "it-IT, en;q=0.8,en-US;q=0.6,de;q=0.4,it;q=0.2,es;q=0.2")
			.header("Connection", "keep-alive")
			.ignoreContentType(true)
			.timeout(30000);
			doc = connection.get();
			elemList = doc.select(".col_inner");
			
			if (elemList.size() > 0) {
				
				for (int i = 0; i < elemList.size(); i++) {
					Elements elems = elemList.getAllAnnotationMirrors(i).children();
					
					if (elems.size() > 0) {
						
						for (int j = 0; j < dateArr.length; j++) {
							Elements elemTitle = new Elements();
							javax.lang.model.util.Elements elemUI = new Elements();
							elemTitle = elems.select(dateArr[j]);
							
							if (elemTitle != null && !elemTitle.isEmpty()) {
								System.out.println("----------------");
								System.out.println(elemTitle.text());
								System.out.println("----------------");
								
								elemUI = elems.select("ul > li");
								
								if (elemUI.size() > 0 ) {
									
									for (int k = 0; k < elemUI.size(); k++) {
										Elements elemLi = elemUI.get(k).children();
										
										if (selectSql.selectQuery(elemLi.text()) < 1) {
											Elements elemHref = elemLi.select(".thumb > a");
											Elements elemImg = elemLi.select(".thumb > a > img");
											
											System.out.println(elemLi.text());
											System.out.println(elemImg.attr("src"));
											System.out.println("---------------");
											
											insertSql.insertQuery(j,  elemLi.text(),  elemHref.attr("href"), elemImg.attr("src"));
										}
									}
								}
							}
						}
					}
				}
			}
		}	catch (IOException e) {
			e.printStackTrace();
		}
	}
}
