package ũ�Ѹ�;


import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ� {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://www.naver.com");
		//Jsoup.connect("http://naver.com").get(); .�� ��� �ִ� �ڵ� : chain�� �ڵ�
		
		//2. ������ ����Ʈ�� html������ �޾ƿ���.
		Document doc = con.get();
		//System.out.println(doc);
		Elements anav = doc.select("a.nav");
		System.out.println(anav.size());
		
		for (Element e : anav) {
			System.out.println(e.text());
		}
	}

}
