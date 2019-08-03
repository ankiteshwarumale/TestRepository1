package Programs;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("No. of cookies: "+allCookies.size());
		for(Cookie cookie : allCookies) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Domain: "+cookie.getDomain());
			System.out.println("Name: "+cookie.getName());
			System.out.println("Path: "+cookie.getPath());
			System.out.println("Value: "+cookie.getValue());
			System.out.println("Expiry Date: "+cookie.getExpiry());
			System.out.println("isSecure: "+cookie.isSecure());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		driver.manage().deleteCookieNamed("sb");
		Set<Cookie> allCookies1 = driver.manage().getCookies();
		System.out.println("After deleting 1 No. of cookies: "+allCookies1.size());
		
		driver.manage().deleteAllCookies();
		
		Set<Cookie> allCookies2 = driver.manage().getCookies();
		System.out.println("After deleting all, No. of cookies: "+allCookies2.size());
		
		driver.quit();
	}

}
