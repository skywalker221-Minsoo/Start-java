package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class EmailDB {
	
	public ArrayList<EmailVO> list() throws Exception { 
		ArrayList<EmailVO> list = new ArrayList<>();
		
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";

	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    String sql = "select * from board";
	    PreparedStatement ps = con.prepareStatement(sql);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    while (rs.next()) {

	    	String tel = rs.getString(1); 
	    	String email = rs.getString(2); 
	    	String type = rs.getString(3); 
	    	String title = rs.getString(4); 
	    	String content = rs.getString(5); 
	    	
	    	EmailVO bag = new EmailVO();
			bag.setTel(tel);
			bag.setEmail(email);
			bag.setType(type);;
			bag.setTitle(title);
			bag.setContent(content);
			
			list.add(bag);
		}
	    return list;
	}
	
	public void create(EmailVO bag) throws Exception {

	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    String sql = "insert into board values(?, ?, ?, ?, ?)";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getTel());
	    ps.setString(2, bag.getEmail());
	    ps.setString(3, bag.getType());
	    ps.setString(4, bag.getTitle());
	    ps.setString(5, bag.getContent());
	    
	    ps.executeUpdate();
	}
	
	public void delete(String tel) throws Exception {
		
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    String sql = "delete from board where tel = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, tel);
	    
	    ps.executeUpdate();
	}
	
	public void update(EmailVO bag) throws Exception {

	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    String sql = "update board set type = ?, email = ?, title = ?, content = ? where tel = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getTel());
	    ps.setString(2, bag.getEmail());
	    ps.setString(3, bag.getType());
	    ps.setString(4, bag.getTitle());
	    ps.setString(5, bag.getContent());
	    
	    ps.executeUpdate();
	}
	
	public EmailVO read(String tel) throws Exception {

	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    String sql = "select * from board where tel = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, tel);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    EmailVO bag = new EmailVO();
	    if (rs.next()) {

	    	String tel1 = rs.getString(1); 
	    	String email = rs.getString(2); 
	    	String type = rs.getString(3); 
	    	String title = rs.getString(4); 
	    	String content = rs.getString(5); 
			bag.setTel(tel1);
			bag.setEmail(email);
			bag.setType(type);
			bag.setTitle(title);
			bag.setContent(content);
		}
	    return bag;
	}

}
