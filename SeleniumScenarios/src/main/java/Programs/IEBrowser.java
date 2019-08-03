package Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "src\\main\\resources\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@class='gb_0 gb_kd gb_ld' and @role='button']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
