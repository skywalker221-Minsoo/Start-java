package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDB2 {

	public ArrayList<MovieVO> list() throws Exception {

		ArrayList<MovieVO> list = new ArrayList<>();
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from content";
		PreparedStatement ps = con.prepareStatement(sql);		
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� mySQL������ ���� ����. <br>");
		
		while (rs.next()) {
			
			String id = rs.getString(1);
			String title2 = rs.getString("title");
			String birth = rs.getString(3);
			String genre = rs.getString(4);
			String fee = rs.getString(5);
			String video = rs.getString(6);
			String story = rs.getString(7);
			String rank = rs.getString(8);
			
			MovieVO bag = new MovieVO();
			bag.setId(id);
			bag.setTitle(title2);
			bag.setBirth(birth);
			bag.setGenre(genre);
			bag.setFee(fee);
			bag.setVideo(video);
			bag.setStory(story);
			bag.setRank(rank);
			
			list.add(bag);
		}
		return list;
	}

}
