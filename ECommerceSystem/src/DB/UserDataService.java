package DB;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

/**
 * Servlet implementation class ValidateLogin
 */
public class UserDataService {

	  
    	public String getUserData(String userid) throws SQLException
    	{
    		String address= "  ";	
        
    			try{
        
    					Connection conn;
    					ResultSet res;
    					ResultSet resUserDetails;
        
    					String username, password;
        
        
    					String query;
    					
        
    					int flag;
    					DatabaseConnection dbconn;
        
                     
        
    					query =  "select * from users where name= '"+userid+"'";
      
    					dbconn = new DatabaseConnection();
    					conn = dbconn.setConnection();
    					res=dbconn.getResult(query,conn); 
        
    					System.out.println("usename entered "+userid);
    					
        
    					if(res.next()) // if valid user
    					{
    						    address = res.getString("fname")+"@@"+res.getString("lname")+"@@"+res.getString("address")+"@@"+res.getString("bankinfo");
    							System.out.println("User address sent");
    					}        
    					else // invalid user
    					{
    							System.out.println("Error");
        	
    					}
    					
    					System.out.println("pppppppppppp");
        } catch (SQLException e1) {
        	System.out.println("zzzzzzzzzmmmmmmmmmmm");
        // TODO Auto-generated catch block
        e1.printStackTrace();
        }
        finally{
        System.out.close();
        }
    	
    	return address;
    }
               
    
        
    
    public UserDataService() {
            super();
            // TODO Auto-generated constructor stub
    }

}
