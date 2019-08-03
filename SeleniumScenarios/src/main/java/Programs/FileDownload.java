package Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//https://www.seleniumeasy.com/selenium-tutorials/verify-file-after-downloading-using-webdriver-java
public class FileDownload {
static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		FileDownload obj = new FileDownload();
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Driver\\chromedriver1.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.seleniumhq.org/download/");
		String fileDownloadURL = "https://goo.gl/9Cqa4q";
		String fileDownloadPath = "D:\\SELENIUM ECLIPSE WORKSPACE\\JulySelenium22\\src\\main\\java\\DownloadFile\\IEDriver.zip";
		
		ProcessBuilder pb = new ProcessBuilder("D:\\SELENIUM ECLIPSE WORKSPACE\\JulySelenium22\\src\\main\\java\\DownloadFile\\DownloadFileAutoIT.exe",fileDownloadURL,fileDownloadPath);
		pb.start();
		boolean flag = false;
		flag = obj.isFileDownloaded("D:\\SELENIUM ECLIPSE WORKSPACE\\JulySelenium22\\src\\main\\java\\DownloadFile\\","IEDriver.zip");
		if(flag==true) {
			System.out.println("File downloaded successfully");
		}
	}
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_content = dir.listFiles();
		if(dir_content ==null || dir_content.length==0) {
			flag=false;
		}else {
		for(File filename: dir_content) {
			
			if(filename.getName().equals(fileName)) {
				long totalSpace = filename.getTotalSpace();
				if(totalSpace>0) {
					flag=true;
					break;
					}
				else {
					break;
				}
			}
		}}
		return flag;
	}

}
