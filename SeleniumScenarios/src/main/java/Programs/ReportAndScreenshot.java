package Programs;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportAndScreenshot {
 static WebDriver driver = null;
 ExtentReports extent = null;
 ExtentTest logger = null;
 
	public static void main(String[] args) throws IOException {
		
		ReportAndScreenshot obj = new ReportAndScreenshot();
		obj.reportGeneration();
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		obj.captureScreenshot();
		obj.reportInfo("Google page open");
		driver.quit();
		obj.reportClose();
	}
	public void reportGeneration() {
		extent = new ExtentReports("src\\main\\java\\TestReport\\report.html", true);
		logger = extent.startTest("Screenshot & Report");
	}
	
	public void captureScreenshot() throws IOException {
		long millis=System.currentTimeMillis(); 
		String Desti = null;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Desti = "src\\main\\java\\TestReport\\"+millis+".png";
		File finalDestination = new File(Desti);
		FileUtils.copyFile(src, finalDestination);
		logger.log(LogStatus.INFO, logger.addScreenCapture(Desti));
	
		//return Desti;
	}
	
	public String currentTimestamp() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);		
	}
	
	

	public void reportInfo(String info) {
		logger.log(LogStatus.INFO, info);
	}
	
	public void reportClose() {
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}
}
