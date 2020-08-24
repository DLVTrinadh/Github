package Academy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseTest;

public class FailureTest extends BaseTest {
	//public static Logger log  = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initilizedriver() throws IOException {
		initializeDriver();
		System.out.println("Failure test initiated");
		//log.error("driver initilized");
		//System.out.println("system.println is used");
	}

	@Test
	public void basepagenavigation() throws IOException, InterruptedException {
		 System.out.println("website Opened");
		driver.findElement(By.xpath("dummypath")).click();
		
		

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
}
