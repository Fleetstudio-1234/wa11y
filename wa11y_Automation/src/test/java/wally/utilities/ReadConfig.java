package wally.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() {
		prop = new Properties();
		String path = System.getProperty("user.dir");
		//Or we can use 
		//File src = new File("./Configuration/config.properties");
		try {
		FileInputStream fis = new FileInputStream(
				path + "./Configuration/config.properties");
		prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String getappurl() {
		String url = prop.getProperty("url");
		return url;
	}
	public String getemail() {
		String emailid1 = prop.getProperty("emailid1");
		return emailid1;
	}
	public String getpasscode() {
		String password= prop.getProperty("password");
		return password;
	}
}
