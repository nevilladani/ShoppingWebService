package DB;

import java.rmi.RemoteException;
import java.sql.SQLException;

import javax.jws.WebService;

import dbService.DBServiceProxy;
@WebService
public class UserInformation {

	//ValidateLogin validateLogin;
	
	//qqqq    static DBServiceProxy proxy = new DBServiceProxy();
	static DBServiceProxy proxy = new DBServiceProxy();
	
	public UserInformation(){
	//ppp	databaseConnection = new DatabaseConnection();
		//validateLogin = new ValidateLogin();
		
	}
	
	
	public String login(String userid,String pass) throws SQLException{
		System.out.println("zzzzzzzzzzzzzz");
		String ss=null;
		//ss = proxy.login(userid, pass);
		
		try {
			proxy.setEndpoint("http://localhost:8095/ECommerceSysService/services/DBService");
			ss = proxy.login(userid, pass);
		} catch (RemoteException e) {
			System.out.println("jjjjjjj");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ss;
		
		
	}	
	
	public static String userData(String userid)
	{
		System.out.println("getting user data");
		String data = null;
		try {
			proxy.setEndpoint("http://localhost:8095/ECommerceSysService/services/DBService");
			
			data = proxy.userData(userid);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		//return userid;
		
		
	}

	
}
