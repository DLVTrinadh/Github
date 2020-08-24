package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id='new_usejr']/div[4]/input")
	private WebElement newUser2;
	
	
	
	
	
	/**
	 * @return the newUser2
	 */
	public WebElement getNewUser2() {
		return newUser2;
	}





















	



	By email = By.xpath("//*[@id='user_email']");
	By password = By.xpath("//*[@id='user_password']");
	By login = By.xpath("//*[@id='new_user']/div[4]/input");
	
	@FindBy(xpath="//*[@id='new_user']/div[4]/input")
	private WebElement newUser;
	
	

	
	/**
	 * @return the newUser
	 */
	public WebElement getNewUser() {
		return newUser;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getemail()
	
	{
		return driver.findElement(email);
		
	}
public WebElement getpassword()
	
	{
		return driver.findElement(password);
		
	}
public WebElement getlogin()

{
	return driver.findElement(login);
	
}



	
	
}
