package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement desti = driver.findElement(By.xpath("//div[@id='droppable']//p"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, desti).build().perform();
	}

}
