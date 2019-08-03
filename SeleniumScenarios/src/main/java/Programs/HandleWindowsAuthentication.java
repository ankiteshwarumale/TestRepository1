package Programs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandleWindowsAuthentication {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.ie.driver", "src\\main\\resources\\Driver\\IEDriverServer1.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		String userName = "Ankiteshwar";
		String password = "Umale";
		String exePath = "src\\main\\java\\HandleWindowAuth\\handlewindowauth.exe";
		driver.get("https://www.engprod-charter.net/");
		Runtime.getRuntime().exec("src\\main\\java\\HandleWindowAuth\\handlewindowauth.exe");
		//ProcessBuilder pb  = new ProcessBuilder(exePath, userName, password);
		//pb.start();
		//driver.get("https://www.engprod-charter.net/");
		
		
		//Thread.sleep(10000);
		
	}

}
