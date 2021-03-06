package crawling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class connection {
	Connection conn;
	
	public connection() {
		
		try {
			// mariaDB 드라이버 설정
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mysql://데이터베이스URL/DB명";
			
			// 접속할 아이디, 비밀번호 설정
			conn = DriverManager.getConnection(url, "아이디", "비밀번호");
			System.out.println("DB 연결 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("mariaDB Driver를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다.");
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