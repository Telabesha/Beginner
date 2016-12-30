import java.sql.*;
import com.mysql.*;

public class TestCallableStatement {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
	//	CallableStatement cstmt = null;
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useSSL=false" , "root" , "root");
		CallableStatement cstmt = conn.prepareCall("(call p(? , ? , ? , ?))");
		cstmt.registerOutParameter( 3 , Types.INTEGER);
		cstmt.registerOutParameter( 4 , Types.INTEGER);
		cstmt.setInt(1 , 3);
		cstmt.setInt(2 , 4);
		cstmt.setInt(4 , 5);
		cstmt.execute();
		System.out.println(cstmt.getInt(3));
		System.out.println(cstmt.getInt(4));

	}

}
