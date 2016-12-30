import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestArgs {

	public static void main(String[] args){
		int deptno = 0;
		Connection conn = null;
		Statement stmt = null;
		String dname = args[1];
		String loc = args[2];
		
		if(args.length !=3 ){
			System.out.println("Pramemter Error , please Input Again!");
			System.exit(-1);
		}
		
		try{
			deptno = Integer.parseInt(args[0]);
		}catch(NumberFormatException ex){
			ex.printStackTrace();
			System.out.println("Prameter Error! Deptno shoule be Number Format");
			System.exit(-1);
		}		

		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306?test1&useSSL=false","root","root");
			stmt = conn.createStatement();
			String sql = "Insert into dept values(" + deptno + ",'" + dname + "','" + loc + "')";
			
			stmt.executeUpdate(sql);
			System.out.println(sql);
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
			System.out.println("Class Not Found!");			
		}catch(SQLException ex){
			ex.printStackTrace();
			System.out.println("SQL Exception!");
		}finally{
			try{
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
				if(conn != null){
					conn.close();
					conn = null;
				}
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
	}

}
