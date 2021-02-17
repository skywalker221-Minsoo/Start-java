package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDB {
	// CRUD ���
	public void create(MemberVO bag) throws Exception {
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
		ps.setString(1, bag.getID());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL���� ����� ����. <br>");
		
		// 4. SQL���� mySQL ������ ������.
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}
	
	public MemberVO read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����� ����. <br>");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
		
		MemberVO bag = new MemberVO();
		if (rs.next()) { // true�̸� �ִٶ�� �̾߱�, ���� ����� �ִٸ� ���̺��� ���ϴ� �������׸��� �����ָ� �ȴ�.
		// �����ִ� ����� 2����) 1. �׸��, 2. �׸��� �ε���
			String id2 = rs.getString("id");
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			bag.setID(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
		return bag;
	}
	
	public void update(MemberVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");
		
		String sql = "update member set pw = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getTel());
		ps.setString(3, bag.getID()); // ����ǥ ������� ��ȣ �ο�
		System.out.println("3. SQL���� ����� ����. <br>");
		
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL���� ����� ����. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

}
