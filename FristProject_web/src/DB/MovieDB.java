package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MovieDB {

	public void create(MovieVO bag) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "insert into content values (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getBirth());
		ps.setString(4, bag.getGenre());
		ps.setString(5, bag.getFee());
		ps.setString(6, bag.getVideo());
		ps.setString(7, bag.getStory());
		ps.setString(8, bag.getRank());
		
		ps.executeUpdate();
		System.out.println(" mySQL서버로 전송 완료. <br>");
	}

	public MovieVO read(String title) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "select * from content where title = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
		
		MovieVO bag = new MovieVO();
		if (rs.next()) {
			
			String id = rs.getString(1);
			String title2 = rs.getString("title");
			String birth = rs.getString(3);
			String genre = rs.getString(4);
			String fee = rs.getString(5);
			String video = rs.getString(6);
			String story = rs.getString(7);
			String rank = rs.getString(8);
			
			bag.setId(id);
			bag.setTitle(title2);
			bag.setBirth(birth);
			bag.setGenre(genre);
			bag.setFee(fee);
			bag.setVideo(video);
			bag.setStory(story);
			bag.setRank(rank);
			
		}
		return bag;
	}
	
	public void update(MovieVO bag) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";
		
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "update content set title = ?, birth = ?, genre = ?, fee = ?,"
				+ "video = ?, story = ?, rank = ? where id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getBirth());
		ps.setString(3, bag.getGenre());
		ps.setString(4, bag.getFee());
		ps.setString(5, bag.getVideo());
		ps.setString(6, bag.getStory());
		ps.setString(7, bag.getRank());
		ps.setString(8, bag.getId());
		
		
		ps.executeUpdate();
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/movie";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from content where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		ps.executeUpdate();
	}


}
