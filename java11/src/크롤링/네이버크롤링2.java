package ũ�Ѹ�;

import org.jsoup.Connection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�2 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("http://shop.danawa.com/shopmain/?logger_kw=shop_top_pcmain");
		// Jsoup.connect("http://naver.com").get(); .�� ��� �ִ� �ڵ� : chain�� �ڵ�

		// 2. ������ ����Ʈ�� html������ �޾ƿ���.
		Document doc = con.get();
		// System.out.println(doc);
		Elements anav = doc.select("span.bg_prod_img p.desc_prod"); //�±װ� ���� ������ ��ĭ �����̽���
																   //�±װ� ���� ���� �ȿ� ������ .�������Ѵ�.
																   //�ٷ� �� �°� : >

		for (int i = 0; i < anav.size(); i++) {
			System.out.println(i + " : " + anav.get(i).text());
		}
			
		Elements imgs = doc.getElementsByTag("img"); //img ũ�Ѹ�
		for (int j = 0; j < imgs.size(); j++) {
			String src = imgs.get(j).attr("src");
			System.out.println(src);
		}

	}

}
