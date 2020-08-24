package temporary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laasyawebsite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\jhansy\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.mathletics.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("lai10356");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("stall63");	
		driver.findElement(By.xpath("//html//body//div[1]//div//div//main//p[1]//button")).click();
		//driver.close();
		driver.findElement(By.xpath("//html//body//div[1]//main//div[3]//div//div//article//section//div[1]//section-panel//scale-nine-container//div//scale-nine-container//div//div//div[2]//topics-list//article//section//ul//li[1]//topic-list-item//list-item//button//div//div[2]")).click();
		
		
		
		

	}

}
