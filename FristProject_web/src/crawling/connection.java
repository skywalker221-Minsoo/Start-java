package crawling;

import java.sql.*;

public class connection {
	Connection conn;

	public connection() {

		try {
			// mysql ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/webtoon";

			// ������ ���̵�, ��й�ȣ ����
			conn = DriverManager.getConnection(url, "root", "1234");
			System.out.println("DB ���� ����");

		} catch (ClassNotFoundException e) {
			System.out.println("mysql Driver�� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("Database ������ ������ �߻� �߽��ϴ�1.");
		}
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}

	public boolean isClosed() throws SQLException {
		return conn.isClosed();
	}

	public void close() throws SQLException {
		conn.close();
	}
}