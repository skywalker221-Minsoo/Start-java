package crawling;

import java.sql.*;

public class select {

	public int selectQuery(String title) {
		int result = 0;

		connection conn = new connection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Select ������
			String sql = "select count(*) from name where title = ?";
			ps = conn.prepareStatement(sql);
			
			int psIndex = 1;
			ps.setString(psIndex++, title);

			// SQL ����
			rs = ps.executeQuery();

			// ����� ���
			while (rs.next()) {
				result = rs.getInt(1);
				break;
			}
		} catch (SQLException e) {
			System.out.println("Database ������ ������ �߻� �߽��ϴ�3.");
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