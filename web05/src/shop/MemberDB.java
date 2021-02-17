package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
	// CRUD ���
	public void create(String id, String pw, String name, String tel) throws Exception {
		// 1. Ŀ���� ����ϰڴٰ� �����ؾ���.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		// 2. db�����غ���!
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp������ �ڵ� import : Ŭ�� ��, Ctrl + Shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");
		// 3. SQL���� �����.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "insert into member values (?, ?, ?, ?)"; // �Էº����� ����ǥ ���� ��Ʈ���� ����� �� �������� ����� ���Ѵ�!!!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL���� ����� ����. <br>");
		// 4. SQL���� mySQL ������ ������.
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

	public void update(String id, String pw, String tel) throws Exception {
		// 1. Ŀ���� ����ϰڴٰ� �����ؾ���.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		// 2. db�����غ���!
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp������ �ڵ� import : Ŭ�� ��, Ctrl + Shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");
		// 3. SQL���� �����.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "update member set pw = ?, tel = ? where id = ?"; // �Էº����� ����ǥ ���� ��Ʈ���� ����� �� �������� ����� ���Ѵ�!!!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, tel);
		ps.setString(3, id); // ����ǥ ������� ��ȣ �ο�
		System.out.println("3. SQL���� ����� ����. <br>");
		// 4. SQL���� mySQL ������ ������.
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		// 2. db�����غ���!
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp������ �ڵ� import : Ŭ�� ��, Ctrl + Shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// 3. SQL���� �����.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "delete from member where id = ?"; // �Էº����� ����ǥ ���� ��Ʈ���� ����� �� �������� ����� ���Ѵ�!!!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL���� ����� ����. <br>");
		// 4. SQL���� mySQL ������ ������.
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

}
