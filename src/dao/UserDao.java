package dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import bean.User;

public class UserDao {
	public boolean insert(String phone, String password) {
		// TODO Auto-generated method stub
		 Connection conn = null;
	        boolean ok = true;
	        try {
	            String URL = "jdbc:mysql://120.76.77.27:3306/lang";
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = (Connection) DriverManager.getConnection(URL, "root", "123456");
	           String sql = "insert into user values (?, ?)";
	           PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
	           ps.setString(1, phone);
	           ps.setString(2, password);
	           ps.executeUpdate();
	        } catch (Exception e) {
	           e.printStackTrace();
	           ok = false;
	        } finally {
	           if (conn != null) {
	              try {
	                 conn.close();
	              } catch (Exception e) {
	              }
	           }
	        }
	        return ok;
	  }
	 public User query(String sqlKey, String sqlVal){
	        Connection conn = null;
	        User user = new User();
	        boolean flag = false;
	        try {
	            String URL = "jdbc:mysql://120.76.77.27:3306/lang";
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = (Connection) DriverManager.getConnection(URL, "root", "123456");
	            String sqlPrefix = "SELECT * FROM user WHERE ";
	            String sql = sqlPrefix + sqlKey + " = ?";

	            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
	            ps.setString(1, sqlVal);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	           	user.setphone(rs.getString("phone"));
	           	user.setPassword(rs.getString("password"));
	           	flag = true;
	            }
	         } catch (Exception e) {
	           e.printStackTrace();
	        } finally {
	           if (conn != null) {
	              try {
	                 conn.close();
	              } catch (Exception e) {
	              }
	           }
	        }
	        if(flag)
	      	  return user;
	        return null;
	  }
}

