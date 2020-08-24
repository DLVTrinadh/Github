package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.beust.jcommander.Parameters;

public class BaseTest {
	static int i=0;

	public static WebDriver driver;
	public  Properties prop;
	private String timeStamp;
	public static String destinationfile;
	public  void initializeDriver() throws IOException {

	
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\users\\nadh\\E2EProject\\src\\test\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",
					"D:\\career\\Career softwares\\chrome version 83\\chromedriver_win32\\chromedriver.exe");
			System.out.println(browsername);

		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\career\\Career softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
			System.out.println(browsername);

		} else if (browsername == "IE") {

		}
		String url=prop.getProperty("url");
		switch (url) {
		case "dev":
			url=prop.getProperty("dev");
			break;
		case "qa":
			url=prop.getProperty("qa");
			break;
		case "uat":
			url=prop.getProperty("uat");
			break;
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*public WebDriver getDriver() {
		return driver;
	}*/

	public  String getscreenshot(String classname) throws IOException {
		//getCurrentTime();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
			String destinationfile="D:\\screenshot2\\"+classname+"screnshots.png";
			FileUtils.copyFile(scrFile, new File(destinationfile));
			System.out.println("i took a screenshot and saved in D drive");
			System.out.println("and the number is"+ "  "  +i++   +"  ");
					
		return destinationfile;
	}
	

	/*public void getCurrentTime(){
		Date date=new Date();
//		String value=date.toLocaleString();
		SimpleDateFormat dateFormat=new SimpleDateFormat("MMddyyyyHH:mm:ss");
		timeStamp=dateFormat.format(date);
		System.out.println(timeStamp);
//		timeStamp=value;
*/	}
