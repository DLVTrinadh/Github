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

public class Subtittlevalidation extends BaseTest {


	@BeforeTest 
	public void initilizedriver() throws IOException
	{
		initializeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("Brower opend and the" +prop.getProperty("url") + "website is opened");
	}
	
	@Test

	public void basepagenavigation() throws IOException, InterruptedException {
		LandingPage l = new LandingPage(driver);
		   
		Assert.assertEquals(l.gettitle().getText(),"FEATURED COURSES");
		

	}
	@AfterTest 
    public void teardown()
    {
		driver.close();
		System.out.println("the chrome brower is closed");
		driver=null;

    }
	}




