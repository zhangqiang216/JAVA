package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class newsdao {
	public int addnews(String t,String i,String d,String u) {
		Connection conn = database.getConnection();
		
		PreparedStatement pstmt = null;
		String sql ="insert into news(title,info,date,url)"
		 		+ "values(?,?,?,?)";
		int a=0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,t);
			pstmt.setString(2,i);
			pstmt.setString(3,d);
			pstmt.setString(4,u);
			
			a=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		System.out.println("¸Ä±ä"+a+"ÐÐ");
		return a;
		
		
	}

}
