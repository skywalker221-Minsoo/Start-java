package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDB {
	
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

	
	public BoardVO read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "select * from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����� ����. <br>");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
		
		BoardVO bag = new BoardVO();
		if (rs.next()) { // true�̸� �ִٶ�� �̾߱�, ���� ����� �ִٸ� ���̺��� ���ϴ� �������׸��� �����ָ� �ȴ�.
						 // �����ִ� ����� 2����) 1. �׸��, 2. �׸��� �ε���
			String id2 = rs.getString("id"); // jsp���� id�� �Էº����� �޾������ϱ� ���ڿ��� ����� id�� �����ϴ�. 
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
		}
		return bag;
	}

	public void update(BoardVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");

		String sql = "update board set title = ?, content = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getWriter());
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
