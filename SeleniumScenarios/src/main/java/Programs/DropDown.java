package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//select[@id='tools']")));
		WebElement element = driver.findElement(By.xpath("//select[@id='tools']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//select[@id='tools']")).getText());
		driver.findElement(By.xpath("//select[@id='tools']")).click();
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='tools']/option"));
		for(WebElement we:dropdown) {
			if(we.getText().equals("Docker")) {
				we.click();
				break;
			}
		}
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,250)");
		
		
		
		
		
		
		
		/*
		
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(ele);
		month.selectByIndex(1);
		Thread.sleep(3000);
		month.selectByVisibleText("Feb");
		Thread.sleep(3000);
		month.selectByValue("3");
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select(ele1);
		date.selectByIndex(1);
		Thread.sleep(3000);
		date.selectByVisibleText("5");
		Thread.sleep(3000);
		date.selectByValue("9");
		Thread.sleep(2000);
		List<WebElement> options = date.getOptions();
		for(WebElement w:options) {
			System.out.print(w.getText()+" ");
		}
		WebElement firstSelectedOption = date.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
			*/
	}

}
