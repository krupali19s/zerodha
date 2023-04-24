package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewDTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SELCHROMEDR\\chromedriver_win32\\chromedriver.exe\\");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver(co);
		 driver.get("https://www.google.com");
		 System.out.println(driver.getTitle());
		 
		 //driver.quit();
	}
	

}
