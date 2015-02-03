package DB;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import dbService.DBServiceProxy;
import domain.Computer;

//ppp import DB.JdbcUtils;

//ppp import domain.Computer;

public class DB {
private static Map map = new LinkedHashMap();
//static List<String[]> computersMap = new ArrayList<String[]>();	
static String[] computersMap;
static DBServiceProxy proxy = new DBServiceProxy();

	static{
		proxy.setEndpoint("http://localhost:8095/ECommerceSysService/services/DBService"); // Valid URL
		
		//System.out.println("blahblah........................llllll");
		String[] compList2=null;
		
		
		
		try {
			
			compList2 = proxy.getAll();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
			System.out.println(7);
		for(int i=0;i<7;i++)
		{
			String[] comMap = compList2[i].split("@@");
			//String[] comMap = computersMap[i];
			String id = comMap[0];
			System.out.println(comMap[1]);
			map.put(id, new Computer(id, comMap[1],comMap[2],Double.parseDouble(comMap[3]),comMap[4]));
		
		}
		
	}
	
	public static Map getAll(){
		return map;
	}
	
	public static Map getBrand(String brand) {
		Map map2 = new LinkedHashMap();
		
		String[] compListBrand =null;
		
		
		try {
			compListBrand = proxy.getBrand(brand);
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//compListBrand = DBService.getBrand(brand);
		
		if(compListBrand!=null)
		{
		for(int i=0;i<compListBrand.length;i++)
		{
			String[] comMapBrand = compListBrand[i].split("@@");
			//String[] comMap = computersMap[i];
			String id = comMapBrand[0];
			System.out.println(comMapBrand[1]);
			map2.put(id, new Computer(id, comMapBrand[1],comMapBrand[2],Double.parseDouble(comMapBrand[3]),comMapBrand[4]));
		
		}
		}
		return map2;
	}
	
	
	
	public static Map getName(String name) {
		Map map3 = new LinkedHashMap();
		
		String[] compListName =null;
		
		
		try {
			compListName = proxy.getName(name);
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//compListName = DBService.getName(name);
		
		if(compListName!=null)
		{
		for(int i=0;i<compListName.length;i++)
		{
			String[] comMapName = compListName[i].split("@@");
			//String[] comMap = computersMap[i];
			String id = comMapName[0];
			System.out.println(comMapName[1]);
			map3.put(id, new Computer(id, comMapName[1],comMapName[2],Double.parseDouble(comMapName[3]),comMapName[4]));
		
		}
		}
		return map3;
	}
	
	
}
