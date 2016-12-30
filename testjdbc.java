import java.nio.channels.SelectableChannel;
import java.sql.*;

public class testjdbc {
	public static void main(String[] args)  {
		ResultSet rs = null;
		Statement stmt = null;
		Connection conn = null;
		try{		
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?"
					+ "useSSL=false","root","root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from dept");
			while(rs.next()){
				System.out.println(rs.getInt("DEPTno"));			
				System.out.println(rs.getString("deptno"));
			}
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}catch(SQLException e){
		e.printStackTrace();
		}finally{
			try{				
				if(rs != null){
					rs.close();
					rs = null;
				}
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
				if(conn != null){
					conn.close();
					conn = null;
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}