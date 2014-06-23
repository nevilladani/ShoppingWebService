package dbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.jws.WebService;

import dbService.ValidateLogin;

//import domain.Computer;


@WebService
public class DBService {
private static Map map = new LinkedHashMap();
static ArrayList<String[]> computerListAll = new ArrayList<String[]>();
ValidateLogin validateLogin;
static ArrayList<String> computerList = new ArrayList<String>();
//static String[][] computerArr;	
static String[] computerArr2;

	static{
		System.out.println("asasasa");
		Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String[] computerInfo = new String[5];
		try {
			System.out.println("asasasa1.1");
			conn = JdbcUtils.getConnection();
			System.out.println("asasasa1.2");
			String sql = "SELECT * FROM computers";
			ps = conn.prepareStatement(sql);
					
			rs = ps.executeQuery();
					
			
			while(rs.next()){
				
				
				String compString = rs.getString("id")+"@@"+ rs.getString("name")+"@@"+ rs.getString("brand")+"@@"+ rs.getString("price")+"@@"+ rs.getString("description");
				String[] computerInfo2 = {rs.getString("id"), rs.getString("name"), rs.getString("brand"), rs.getString("price"), rs.getString("description")};
				//computers.add(computerInfo2);
				computerListAll.add(computerInfo2);
				computerList.add(compString);
				
			}
			
			computerArr2 = new String[computerList.size()];
			for(int i=0;i<computerList.size();i++ )
			{
				//computerArr[i] = computers.get(i);
				computerArr2[i] = computerList.get(i);
				
			}
			
		}catch(Exception e){
			System.out.println("asasasa3");
			throw new RuntimeException(e);
		} finally{
			JdbcUtils.free(rs,ps,conn);
		}
	
	}
	
	public static String[] getAll(){
		//return map;
		System.out.println(computerArr2[1]);
		return computerArr2;
	}
	
	public String sayHelloWorld(String name)  
    {  
        return "Hello world from "+ name;  
    }  
	
	public static String[] getBrand(String brand) {
		 ArrayList<String> computerListBrand = new ArrayList<String>();
		String[] computerArrBrand=null;
		
		for(int i=0;i<computerListAll.size();i++ )
		{
			if(computerListAll.get(i)[2].equalsIgnoreCase(brand))
			{
				String compStringBrand = computerListAll.get(i)[0]+"@@"+computerListAll.get(i)[1]+"@@"+computerListAll.get(i)[2]+"@@"+computerListAll.get(i)[3]+"@@"+computerListAll.get(i)[4];
				computerListBrand.add(compStringBrand);
				
			}
		}
		if(computerListBrand.size()>0)
		{
			computerArrBrand = new String[computerListBrand.size()];
			for(int i=0;i<computerListBrand.size();i++ )
			{
				//computerArr[i] = computers.get(i);
				computerArrBrand[i] = computerListBrand.get(i);
			}
			
		}
		if(brand.equalsIgnoreCase("dell"))
		{
			
		}
		return computerArrBrand;
		
		
	}	


	public static String[] getName(String name) {
		 ArrayList<String> computerListName = new ArrayList<String>();
		String[] computerArrName=null;
		for(int i=0;i<computerListAll.size();i++ )
		{
			if((computerListAll.get(i)[1].toLowerCase()).contains(name.toLowerCase()))
			{
				String compStringName = computerListAll.get(i)[0]+"@@"+computerListAll.get(i)[1]+"@@"+computerListAll.get(i)[2]+"@@"+computerListAll.get(i)[3]+"@@"+computerListAll.get(i)[4];
				computerListName.add(compStringName);
				
			}
		}
		if(computerListName.size()>0)
		{
			computerArrName = new String[computerListName.size()];
			for(int i=0;i<computerListName.size();i++ )
			{
				//computerArr[i] = computers.get(i);
				computerArrName[i] = computerListName.get(i);
			}
			
		}
		
		return computerArrName;
		
		
	}
	
	public String login(String userid,String pass) throws SQLException{
		System.out.println("hereee");
		validateLogin = new ValidateLogin();
		return validateLogin.login(userid,pass);
	
	}
	
	public String userData(String userid)
	{
		String udata=null;
		UserDataService userdata= new UserDataService();
		try {
			udata = userdata.getUserData(userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return udata;
	}

	
}
