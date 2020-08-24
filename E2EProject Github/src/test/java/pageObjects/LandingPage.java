package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	
	public WebDriver driver;
	
	By signin = By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	By title = By.xpath("//*[@id='content']/div/div/h2");
	By navigationbar = By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul");


	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getlogin()
	
	{
		return driver.findElement(signin);
		
	}
public WebElement gettitle()
	
	{
		return driver.findElement(title);
		
	}
public WebElement getnavigationbar() {
	return driver.findElement(navigationbar);
}
	
	
}
