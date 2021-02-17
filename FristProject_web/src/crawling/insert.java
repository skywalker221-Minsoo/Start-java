package crawling;

import java.sql.*;

public class insert {

	public void insertQuery(int day, String title, String url, String thumb) {
		connection conn = new connection();
		PreparedStatement ps = null;

		try {
			// Insert�� ? �κ��� �Ʒ��� �Է°��� �ڵ����� ��ȯ�� �˴ϴ�.
			String sql = "insert into name (no, day, title, url, thumb) values (0, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			
			int index = 1;
			ps.setInt(index++, day);
			ps.setString(index++, title);
			ps.setString(index++, url);
			ps.setString(index++, thumb);

			// SQL ����
			int count = ps.executeUpdate();

			if (count == 0) {
				System.out.println("�����Ͱ��� �̻��� �ֽ��ϴ�.");
			} else {
				System.out.println("������ Insert ����!");
			}
		} catch (SQLException e) {
			System.out.println("Database ������ ������ �߻� �߽��ϴ�2.");
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