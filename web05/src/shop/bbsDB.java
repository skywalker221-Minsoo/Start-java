package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class bbsDB {
	// CRUD ���
	public void create(String id, String title, String content, String writer) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");
		
		String sql = "insert into board values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.println("3. SQL���� ����� ����. <br>");
		
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

	public void update(String id, String title, String content) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "update board set title = ?, content = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, content);
		ps.setString(3, id);
		System.out.println("3. SQL���� ����� ����. <br>");
		
		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL���� ����� ����. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
	}

}
