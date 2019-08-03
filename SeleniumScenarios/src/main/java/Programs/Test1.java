package Programs;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Test1 {

	static WebDriver driver = null;
	ExtentReports extent=null;
	ExtentTest logger = null;
	
	public static void main(String[] args) throws IOException {
		//BasicConfigurator.configure();
		Test1 obj = new Test1();
		obj.reportGeneration();
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver.exe");
		obj.reportInfo("Chrome is opening");
		driver = new ChromeDriver();
		obj.reportInfo("Maximizing chrome");
		driver.manage().window().maximize();
		obj.reportInfo("Open Google");
		driver.get("https://www.google.com");
		obj.screenCapture();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@name='q']")));
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Test");
		driver.quit();
		obj.reportClose();
	}
	
	public void reportGeneration() {
		extent = new ExtentReports("src\\main\\java\\TestReport\\testReport.html", true);
		logger = extent.startTest("Test1.class");		
	}
	
	public void reportInfo(String info) {
		logger.log(LogStatus.INFO, info);
	
	}
	
	public void reportClose() {
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}
	
	public void screenCapture() throws IOException {
		long millis=System.currentTimeMillis();  
		String desti = null;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		desti = "src\\main\\java\\TestReport\\"+millis+".png";
		File finalDestination = new File(desti);
		FileUtils.copyFile(source, finalDestination);
	
		logger.log(LogStatus.INFO, "Screenshot"+logger.addScreenCapture(desti));
	}

}
