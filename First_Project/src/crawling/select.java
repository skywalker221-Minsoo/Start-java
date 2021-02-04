package crawling;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {
	
	public int selectQuery(String title) {
	int result = 0;
	
		connection conn = new connection();
		PreparedStatement pstmt = null;
	ResultSet rs = null;
	
		try {
			// Select ������
			String sql = " SELECT count(*) as cnt FROM webtoon where title = ? ";
			pstmt = conn.prepareStatement(sql);
			
			int pstmtIndex = 1;
			pstmt.setString(pstmtIndex++,  title);
			
			// SQL ����
			rs = pstmt.executeQuery();
			
			// ����� ���
			while (rs.next()) {
				result = rs.getInt(1);
				break;
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
		
		return result;
	}
}
