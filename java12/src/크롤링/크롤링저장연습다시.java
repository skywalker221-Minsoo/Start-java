package ũ�Ѹ�;

import java.io.FileWriter;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ũ�Ѹ����忬���ٽ� {

	public static void crawling() throws Exception {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/weekdayList.nhn?week=fri");

		Document doc = con.get();

		Elements anav = doc.select("dl dt a");
		Elements anav2 = doc.select("div.rating_type");
		Elements anav3 = doc.select("dd.desc");
		
		//String sum = "";
		FileWriter f = new FileWriter("c:/data/����.txt");
		for (int i = 0; i < anav2.size(); i++) {
			f.write(anav.get(i+3).text() + "  �۰� " + 
					anav3.get(i+3).text() + " "
					+ anav2.get(i).text() + "\n");
		}	
		f.close();	 
	}

}
