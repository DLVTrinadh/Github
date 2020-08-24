package Academy;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.BaseTest;


public class FailureTest2 extends BaseTest{
	//public static Logger log  = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilizedriver() throws IOException {
		initializeDriver();
	}
	
	@Test
	public void dummy()
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\career\\Career softwares\\chrome version 83\\chromedriver_win32\\chromedriver.exe");

		System.out.println("Failure test2 is  initiated");
		driver.get("https:\\www.google.com");
		driver.findElement(By.xpath("dummy")).click();
		
	}
	
	
}

