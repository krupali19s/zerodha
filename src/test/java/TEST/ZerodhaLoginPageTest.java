package TEST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.chromeBrowser();
				}
	@Test
	public void loginTest() throws IOException {
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userId = Excel.getData("Sheet2", 0, 0);
		String pass = Excel.getData("Sheet2", 1, 0);
		String pin = Excel.getData("Sheet2", 2, 0);
		
		boolean status = zerodhaLoginPage.isImageDisplayed();
		Assert.assertFalse(status);      //hard assert
		zerodhaLoginPage.enterUserId(userId);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		
		
		zerodhaLoginPage.enterPin(pin,driver);
		
		zerodhaLoginPage.clickOnContinue();
		
	}

}
