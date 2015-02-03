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
    					
    					//System.out.println("pppppppppppp");
        } catch (SQLException e1) {
        	//System.out.println("zzzzzzzzzmmmmmmmmmmm");
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
