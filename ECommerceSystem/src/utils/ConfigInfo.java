package utils;

import java.util.ResourceBundle;


public class ConfigInfo {
private static ResourceBundle cache = null;
	
	static{
		try {
			cache=ResourceBundle.getBundle("merchantInfo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key){
		String str =  cache.getString(key);
		return str;
	}
}
