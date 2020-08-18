import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		//register the driver class
		Class.forName("oracle.jdbc.OracleDriver");
		//create the connection object
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","9908771890");
		if(con!=null)
			System.out.println("Estabilished");
		return con;
		
	}

}
