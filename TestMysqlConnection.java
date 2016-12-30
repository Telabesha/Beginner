import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class TestMysqlConnection {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");			

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test1?useUnicode=true&" + "characterEncoding=utf-8&useSSL=false",
					"root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from dept");
			while (rs.next()) {
				System.out.println(rs.getString("deptno"));
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
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
