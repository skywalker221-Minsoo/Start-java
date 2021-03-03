package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	}
	
	public MovieVO read(String id) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		 	
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");

	    String sql = "select * from content where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	   	ps.setString(1, id);
			
		ResultSet rs = ps.executeQuery();

		MovieVO bag = new MovieVO();
		if (rs.next()) {
			
			String id2 = rs.getString("id");
			String title = rs.getString(2);
			String birth = rs.getString(3);
			String genre = rs.getString(4);
			String fee = rs.getString(5);
			String video = rs.getString(6);
			String story = rs.getString(7);
			String rank = rs.getString(8);
			
			bag.setId(id2);
			bag.setTitle(title);
			bag.setBirth(birth);
			bag.setGenre(genre);
			bag.setFee(fee);
			bag.setVideo(video);
			bag.setStory(story);
			bag.setRank(rank);
			
		}
		return bag;
	}
	
	public ArrayList<MovieVO> list() throws Exception {

		ArrayList<MovieVO> list = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "select * from content"; // ������ �����ϴ� �ش� ��ȭ�� ��� ������ �˻��� ����
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) { // ����� DB�� ��� ������ �˻�. �� ������� ���������� �ݺ��Ͽ� �˻�
							// �����Ǵ� ������ ������ �ش� ���� ��� ���� ����
			String id = rs.getString(1);
			String title = rs.getString(2);
			String birth = rs.getString(3);
			String genre = rs.getString(4);
			String fee = rs.getString(5);
			String video = rs.getString(6);
			String story = rs.getString(7);
			String rank = rs.getString(8);
			
			MovieVO bag = new MovieVO();
			bag.setId(id);
			bag.setTitle(title);
			bag.setBirth(birth);
			bag.setGenre(genre);
			bag.setFee(fee);
			bag.setVideo(video);
			bag.setStory(story);
			bag.setRank(rank);
			list.add(bag); // DB�� ��� ������ �� �迭 �ȿ� �Է�
		}
		return list; // DB �������� �Էµ� �迭 ��ȯ
	}
	
	public ArrayList<MovieVO> Movielist(String title) throws Exception {

		ArrayList<MovieVO> list = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/movie";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "select * from content where title like '%" + title + "%'";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) { // ����� DB�� ��� ������ �˻�. �� ������� ���������� �ݺ��Ͽ� �˻�
							// �����Ǵ� ������ ������ �ش� ���� ��� ���� ����
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
			list.add(bag); // DB�� ��� ������ �� �迭 �ȿ� �Է�
		}
		return list; // DB �������� �Էµ� �迭 ��ȯ
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
