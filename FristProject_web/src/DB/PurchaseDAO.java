package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PurchaseDAO {

	public void create(int perchaseNum, String clientId, int price, String movieId) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/project1";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "insert into perchase values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, perchaseNum);
		ps.setString(2, clientId);
		ps.setInt(3, price);
		ps.setString(4, movieId);

		ps.executeUpdate();
	}

	public PurchaseVO read(String clientId) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/project1";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from perchase where clientId = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, clientId);

		ResultSet rs = ps.executeQuery();

		PurchaseVO bag = new PurchaseVO();

		if (rs.next()) {

			int perchaseNum = rs.getInt("perchaseNum");
			String clientId2 = rs.getString(2);
			String cardCompany = rs.getString("cardCompany");
			String cardNum = rs.getString("cardNum");
			int price = rs.getInt("price");
			String movieId = rs.getString(6);

			bag.setPerchaseNum(perchaseNum);
			bag.setClientId(clientId2);
			bag.setCardCompany(cardCompany);
			bag.setCardNum(cardNum);
			bag.setPrice(price);
			bag.setMovieId(movieId);
		}
		return bag;
	}
}