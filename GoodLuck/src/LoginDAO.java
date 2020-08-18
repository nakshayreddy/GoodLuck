import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {

	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException {
		String username=loginpojo.getUsername();
		String password=loginpojo.getPassword();
		
		ConnectionManager con=new ConnectionManager();
		Statement st=  con.getConnection().createStatement();
		ResultSet rs= st.executeQuery("SELECT * from USERDETAILS");
		while(rs.next())
		{
			String password1 =rs.getString(4);
			String userid=rs.getString(5);
			if(username.equals(userid) && password.equals(password1))
			{
				con.getConnection().close();
				return true;
			}

		}
		
		return false;

	
		
	}

}
