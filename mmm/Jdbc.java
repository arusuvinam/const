package org.mmm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
	public static void main(String[] args) {
		Connection con=null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
	String query ="select *from course";
	PreparedStatement ps = con.prepareStatement(query);
	ResultSet rs= ps.executeQuery();
		while (rs.next()) {
			int cId = rs.getInt("cid");
			System.out.println(cId);
		String cName = rs.getString("cname");
		System.out.println(cName);
		}
			
		
	
		
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		finally {
		try {
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		}
	}
		
	}
	
			
