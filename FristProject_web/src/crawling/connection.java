package crawling;

import java.sql.*;

public class connection {
	Connection conn;

	public connection() {

		try {
			// mysql 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/webtoon";

			// 접속할 아이디, 비밀번호 설정
			conn = DriverManager.getConnection(url, "root", "1234");
			System.out.println("DB 연결 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("mysql Driver를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다1.");
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