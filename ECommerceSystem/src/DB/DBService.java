package DB;

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

//import domain.Computer;

public class DBService {
private static Map map = new LinkedHashMap();
static ArrayList<String[]> computerListAll = new ArrayList<String[]>();

static ArrayList<String> computerList = new ArrayList<String>();
//static String[][] computerArr;	
static String[] computerArr2;
static Connection conn = null;
	static{
		//System.out.println("asasasa");
		
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String[] computerInfo = new String[5];
		try {
			conn = JdbcUtils.getConnection();
			String sql = "SELECT * FROM computers";
			ps = conn.prepareStatement(sql);
					
			rs = ps.executeQuery();
					
			
			while(rs.next()){
				
				
				String compString = rs.getString("id")+"@@"+ rs.getString("name")+"@@"+ rs.getString("brand")+"@@"+ rs.getString("price")+"@@"+ rs.getString("description");
				String[] computerInfo2 = {rs.getString("id"), rs.getString("name"), rs.getString("brand"), rs.getString("price"), rs.getString("description")};
				//computers.add(computerInfo2);
				computerListAll.add(computerInfo2);
				computerList.add(compString);
				//ppp String id = rs.getString("id");
				//ppp map.put(id, new Computer(id, rs.getString("name"),rs.getString("brand"),rs.getDouble("price"),rs.getString("description")));
			}
			
			computerArr2 = new String[computerList.size()];
			for(int i=0;i<computerList.size();i++ )
			{
				//computerArr[i] = computers.get(i);
				computerArr2[i] = computerList.get(i);
				
			}
			
		}catch(Exception e){
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
		//System.out.println("zzzzzzzzzzzzzz");
		for(int i=0;i<computerListAll.size();i++ )
		{
			if(computerListAll.get(i)[2].equalsIgnoreCase(brand))
			{
				String compStringBrand = computerListAll.get(i)[0]+"@@"+computerListAll.get(i)[1]+"@@"+computerListAll.get(i)[2]+"@@"+computerListAll.get(i)[3]+"@@"+computerListAll.get(i)[4];
				computerListBrand.add(compStringBrand);
				//System.out.println("zzzzzzaaaaaaaaaaaa");
			}
		}
		//System.out.println("sdddddddddd"+computerListBrand.size());
		if(computerListBrand.size()>0)
		{
			computerArrBrand = new String[computerListBrand.size()];
			for(int i=0;i<computerListBrand.size();i++ )
			{
				//computerArr[i] = computers.get(i);
				computerArrBrand[i] = computerListBrand.get(i);
			}
			//System.out.println("bbbbbbb"+computerArrBrand[1]);
			
		}
		if(brand.equalsIgnoreCase("dell"))
		{
			
		}
		return computerArrBrand;
		
		
	}	
	
	
	public static String[] getName(String name) {
		 ArrayList<String> computerListName = new ArrayList<String>();
		String[] computerArrName=null;
		//System.out.println("lololololololololololol");
		for(int i=0;i<computerListAll.size();i++ )
		{
			if((computerListAll.get(i)[1].toLowerCase()).contains(name.toLowerCase()))
			{
				String compStringName = computerListAll.get(i)[0]+"@@"+computerListAll.get(i)[1]+"@@"+computerListAll.get(i)[2]+"@@"+computerListAll.get(i)[3]+"@@"+computerListAll.get(i)[4];
				computerListName.add(compStringName);
				//System.out.println("zzzzzzaaaaaaaaaaaa");
			}
		}
		//System.out.println("sdddddddddd"+computerListBrand.size());
		if(computerListName.size()>0)
		{
			computerArrName = new String[computerListName.size()];
			for(int i=0;i<computerListName.size();i++ )
			{
				//computerArr[i] = computers.get(i);
				computerArrName[i] = computerListName.get(i);
			}
			//System.out.println("bbbbbbb"+computerArrBrand[1]);
			
		}
		
		return computerArrName;
		
		
	}
	
	public String login(String userid,String pass) throws SQLException{
		
		ValidateLogin validateLogin = new ValidateLogin();
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
