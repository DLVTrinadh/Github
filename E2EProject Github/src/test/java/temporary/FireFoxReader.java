package temporary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxReader {

	
	
	@Test
	public void firefoxbrowser()
	{
	
		
		System.setProperty("webdriver.gecko.driver", "D:\\career\\Career softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.close();
		
		
	}
	
	
	
	
}
