package Programs;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderAndTable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		Thread.sleep(10000);
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/tbody//td"));
		int size = dates.size();
		for(int i=0; i<size; i++) {
			if(dates.get(i).getText().equalsIgnoreCase("31")) {
				dates.get(i).click();
				break;
			}
		}
		/*
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//tbody/tr/td[@class='monthTitle' and text()='Aug 2019']//ancestor::tr//following-sibling::tr/td[text()='30']")).click();
		*/
	}

}
