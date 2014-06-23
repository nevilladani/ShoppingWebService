package dbService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public Statement stmt;
    public Connection conn;
    public ResultSet res;
    
    final String DB_URL="jdbc:mysql://localhost:3306/ecommerce";

          //  Database credentials
    final String USER = "root";
    final String PASS = "pass123";
    public DatabaseConnection(){
        
    }
    @SuppressWarnings("CallToThreadDumpStack")
    public Connection setConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             // Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public ResultSet getResult(String query, Connection conn){
        this.conn = conn;
        try{
            stmt = conn.createStatement();
            res = stmt.executeQuery(query);
        }catch(Exception e){
            
        }
        return res;
    }
    
}
