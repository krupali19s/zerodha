package pojo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	@SuppressWarnings("deprecation")
	public static WebDriver chromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\SELCHROMEDR\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
	
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co
				);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		return driver;
		
}
}

