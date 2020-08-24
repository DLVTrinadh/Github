package temporary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseTest;

public class Validatenavigationbar extends BaseTest {

	@BeforeTest 
	public void initilizedriver() throws IOException
	{
		initializeDriver();
		driver.get(prop.getProperty("url"));	
	}
	
	@Test

	public void basepagenavigation() throws IOException, InterruptedException {
		LandingPage l = new LandingPage(driver);
		   
		Assert.assertTrue(l.getnavigationbar().isDisplayed());
		System.out.println("navigationbar is displayed on webpage");
		

	}
	@AfterTest 
    public void teardown()
    {
		driver.close();
		driver=null;

    }
}




