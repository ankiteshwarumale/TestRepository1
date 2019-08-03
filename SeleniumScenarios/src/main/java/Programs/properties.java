package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("src\\main\\resources\\Property\\test.properties");
		
		Properties prop = new Properties();
		prop.load(file);
		String Name = prop.getProperty("NAME");
		System.out.println("Name: "+Name);
	}

}
