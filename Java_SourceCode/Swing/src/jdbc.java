import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver") ;
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=student" ;    
		    Connection conn = DriverManager.getConnection(url , "zhangqiang", "123456" ) ;
		    Statement stmt = conn.createStatement();
		    //conn.prepareStatement()
		   // ResultSet rs = stmt.executeQuery("select * from student");
		    boolean a=stmt.execute("update student set sname='王五'  where sno='201215121'");
//		    while (rs.next()) {
//		    	System.out.println(rs.getString("sno"));
//		    	}
		    //一个connection执行一个sql
		    conn.close();
	}

}
