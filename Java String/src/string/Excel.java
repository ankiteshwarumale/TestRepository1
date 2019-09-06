package string;

import java.io.File;
import java.io.FileInputStream;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("Test.xlsx");
		
		FileInputStream file_in = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(file_in);
				

	}

}
