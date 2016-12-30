import java.sql.*;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class TestPrepStmt {

	public static void main(String[] args) {
		if(args.length != 3){
			System.out.println("Parameter Error!Please Input Again!");
			System.exit(-1);
		}
		
		int deptno = 0;
		String dname = args[1];
		String loc = args[2];		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			deptno = Integer.parseInt(args[0]);
		}catch(NumberFormatException ex){
			ex.printStackTrace();
			System.out.println("Parameter Error!Deptno should be number");
			System.exit(-1);
		}		
	
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					+ "test1?useSSL=false" , "root" , "root" );
			pstmt = conn.prepareStatement("Insert into dept values(? , ? , ? )");
			rs = pstmt.executeQuery("select * from dept");
			while (rs.next()) {
				System.out.println(rs.getString("deptno"));
			}
			
			pstmt.setInt( 1 , deptno);
			pstmt.setString( 2 , dname);
			pstmt.setString( 3 , loc);
			pstmt.executeUpdate();
			System.out.println(pstmt);
			
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try{				
				if(pstmt != null){
					pstmt.close();
					pstmt = null;
				}
				
				if(conn != null ){
					conn.close();
					conn = null;
				}

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
