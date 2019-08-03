package Programs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//https://www.youtube.com/watch?v=_u52S2DYNSg
public class fileUpload {
static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException, IOException {
		fileUpload obj = new fileUpload();
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\SELENIUM ECLIPSE WORKSPACE\\JulySelenium22\\src\\main\\java\\FileUpload\\fileUploadHTML.html");
		driver.findElement(By.xpath("//input[@type='file' and @id='1']")).click();
		Thread.sleep(3000);
		String fileToUploadPath = "D:\\SELENIUM ECLIPSE WORKSPACE\\JulySelenium22\\src\\main\\java\\FileUpload\\fileUploadHTML.html";
		String UploadFileExe = "D:\\SELENIUM ECLIPSE WORKSPACE\\JulySelenium22\\src\\main\\java\\FileUpload\\Uploadfile.exe";
		
		ProcessBuilder pb = new ProcessBuilder(UploadFileExe, fileToUploadPath);
		pb.start();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//input[@type='file' and @id='1']")).getText();
		System.out.println(text);
	}

}
