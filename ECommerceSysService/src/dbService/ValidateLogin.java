package dbService;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

/**
 * Servlet implementation class ValidateLogin
 */
public class ValidateLogin {

	  
    	public String login(String userid,String pass) throws SQLException
    	{
    		String result= "false";	
        
    			try{
        
    					Connection conn;
    					ResultSet res;
    					ResultSet resUserDetails;
        
    					String username, password;
        
        
    					String query;
    					
        
    					int flag;
    					DatabaseConnection dbconn;
        
                     
        
    					query =  "select * from users where name= '"+userid+"'and password='"+pass+"'";
      
    					dbconn = new DatabaseConnection();
    					conn = dbconn.setConnection();
    					res=dbconn.getResult(query,conn); 
        
    					System.out.println("usename entered "+userid);
    					System.out.println("pass entered "+pass);
        
    					if(res.next()) // if valid user
    					{
    						    result = "true";
    							System.out.println("User authenticated");
    					}        
    					else // invalid user
    					{
    							System.out.println("Error");
        	
    					}
    					
    	} catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        finally{
        System.out.close();
        }
    	
    	return result;
    }
               
    
        
    
    public ValidateLogin() {
            super();
            // TODO Auto-generated constructor stub
    }

}
