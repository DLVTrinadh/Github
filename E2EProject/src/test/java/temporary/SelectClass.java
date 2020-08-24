package temporary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\career\\Career softwares\\chrome version 83\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[4]/button")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[4]/button")).isDisplayed());
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[4]/a")).click();
		
	
	}
}
		
		
		
		
		
		
		
		
	/*	Select select = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")).click();
		System.out.println("hi i am at line 30");
		
		for(int i =1;i<7;i++)
		{
			System.out.println("i am in the for loop");
			select.selectByIndex(i);
		}
		}
		
		
		
		
		*/
		
		
		
		

