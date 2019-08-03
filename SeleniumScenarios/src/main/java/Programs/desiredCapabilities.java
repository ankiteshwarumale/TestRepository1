package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilities {
//Secure Certificate
//https://peter.sh/experiments/chromium-command-line-switches/
	public static void main(String[] args) {
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");*/
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		/*
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars"); 
		//options.setAcceptInsecureCerts(true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cacert.org/");
		driver.manage().window().maximize();*/
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		options.merge(cap);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
	}

}
