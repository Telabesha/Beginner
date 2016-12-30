import java.sql.*;

public class TestDML {
	public static void main(String[] args) throws Exception{
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test1?"
					+ "useSSL=false","root","root");
			stmt = conn.createStatement();
			String sql = "insert into dept values (92,'Game','Beijing')";
			stmt.executeUpdate(sql);
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
	}

}
