package Academy;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseTest;
import utils.CommonMethods;

public class homePage extends BaseTest {
	//public static Logger log  = LogManager.getLogger(base.class.getName());
	CommonMethods commonMethods =new CommonMethods();
	@BeforeTest
	public void initilizedriver() throws IOException {
		initializeDriver();
		//log.error("driver initilized");
		//System.out.println("system.println is used");
	}
	
	@Test(dataProvider = "getData")
	public void basepagenavigation(String username, String password) throws IOException, InterruptedException {
		
		System.out.println("Home page test initiated");
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getlogin().click();
		LoginPage loginPage = new LoginPage(driver);
//		loginPage.getemail().sendKeys(username);
//		loginPage.getpassword().sendKeys(password);
//		loginPage.getlogin().click();
		commonMethods.sendKeys(loginPage.getpassword(), password);
		commonMethods.selectByVisibleText(loginPage.getemail(), password);
		commonMethods.selectByVisibleText(loginPage.getNewUser(), username);

	}

	@DataProvider

	public Object[][] getData() {

		Object[][] data = new Object[4][2];
		data[0][0] = "dlv.trinadh@gmail.com";
		data[0][1] = "XXXXXXXXXXXXXXXXXXX";
		data[1][0] = "";
		data[1][1] = "XXXXXXXXXXXXXXXXXXX";
		data[2][0] = "dlv.trinadh@gmail.com";
		data[2][1] = "invalidpassword";
		data[3][0] = "invalidmail@gmail.com";
		data[3][1] = "invalidpassword";
		return data;
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
		System.out.println("Home page test is completed");
	}
}
