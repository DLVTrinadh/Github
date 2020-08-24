package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i want to call driverintilization
		
		
		
		
	}
	
	public void driverintilization()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\career\\Career softwares\\chrome version 83\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}

}
