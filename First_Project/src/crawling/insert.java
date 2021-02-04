package crawling;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {

	public void insertQuery(int day, String title, String url, String thumb) {
		connection conn = new connection();
		PreparedStatement pstmt = null;
		
		try {
			// Insert�� ? �κ��� �Ʒ��� �Է°��� �ڵ����� ��ȯ�� �˴ϴ�.
			String sql = " INSERT INTO webtoon (no, day, title, url, thumb) VALUES (0, ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);
			
			int index = 1;
			pstmt.setInt(index++, day);
			pstmt.setString(index++, title);
			pstmt.setString(index++, url);
			pstmt.setString(index++, thumb);
			
			// SQL ����
			int count = pstmt.executeUpdate();
			
			if (count == 0) {
				System.out.println("�����Ͱ��� �̻��� �ֽ��ϴ�.");
			} else {
				System.out.println("������ Insert ����!");
			}
		} catch (SQLException e) {
			System.out.println("Database ������ ������ �߻� �߽��ϴ�.");
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
