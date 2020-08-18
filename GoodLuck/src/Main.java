import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException
	{
		System.out.println("register");
		System.out.println("Login");
		int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		RegisterPojo registerpojo=new RegisterPojo();
		RegisterDAO registerdao=new RegisterDAO();
		LoginPojo loginpojo=new LoginPojo();
		LoginDAO logindao=new LoginDAO();
		
		switch(x)
		{
		case 1: 
			System.out.println("enter firstname");
			String firstname=br.readLine();
			System.out.println("enter lastname");
			String lastname=br.readLine();
			System.out.println("enter username");
			String username=br.readLine();
			System.out.println("enter password");
			String password=br.readLine();
			System.out.println("enter email");
			String email=br.readLine();
			registerpojo.setFirstname(firstname);
			registerpojo.setLastname(lastname);
			registerpojo.setUsername(username);
			registerpojo.setPassword(password);
			registerpojo.setEmail(email);
			registerdao.addUser(registerpojo);
			break;
		case 2:
			System.out.println("enter Email");
			String name=br.readLine();
			System.out.println("enter Password");
			String pass=br.readLine();
			loginpojo.setUsername(name);
			loginpojo.setPassword(pass);
			if(logindao.validate(loginpojo)==true)
			{
				Luck luck=new Luck();
				luck.display();
			}
			else
			{
				System.out.println("INCORRECT USERNAME AND PASSWORD");
			}
				
			break;
		}
		
	}

}
