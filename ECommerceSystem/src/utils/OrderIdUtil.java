package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Properties;

public class OrderIdUtil {
private static Properties p = null;
    
    private static String filepath;
    static{
		filepath = OrderIdUtil.class.getClassLoader().getResource("orderid.properties").getPath();
    }
	
	public static String getValue()  {
		
		try{
			File confile = new File(filepath);
		    FileInputStream fis = new FileInputStream(confile);
	
		    Properties p = new Properties();
	        p.load(fis);
	        
			String str =  p.getProperty("orderId");
	
			BigDecimal id = new BigDecimal(str);
			BigDecimal one = new BigDecimal("1");
			String nextId = id.add(one).toString();
			
		    p.setProperty("orderId",nextId);
	
		    FileOutputStream fos = new FileOutputStream(confile);
		    p.store(fos,"");
		    fos.close();
		    fis.close();
		    System.out.println(str);
		    return str;
		}catch(Exception e){
			
		}

		
		 return null;
	}
	

	
}
