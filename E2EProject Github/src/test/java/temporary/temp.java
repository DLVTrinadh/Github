package temporary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class temp {

	public static void main(String[] args)

	{

		System.setProperty("webdriver.chrome.driver",
				"D:\\career\\Career softwares\\chrome version 83\\chromedriver_win32\\chromedriver.exe");

		// WebDriver driver =new ChromeDriver();

		// driver.get("http://qaclickacademy.com");
		System.out.println("before assetion sucesfully clicked");
		int i = 5;
		
		System.out.println("after assertion sucesfully clicked");

	}
}
