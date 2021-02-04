package crawling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class connection {
	Connection conn;
	
	public connection() {
		
		try {
			// mariaDB ����̹� ����
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mysql://�����ͺ��̽�URL/DB��";
			
			// ������ ���̵�, ��й�ȣ ����
			conn = DriverManager.getConnection(url, "���̵�", "��й�ȣ");
			System.out.println("DB ���� ����");
			
		} catch (ClassNotFoundException e) {
			System.out.println("mariaDB Driver�� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("Database ������ ������ �߻� �߽��ϴ�.");
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