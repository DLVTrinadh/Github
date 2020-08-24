package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.BaseTest;
import resources.ExtentreporterNG;

public class CommonMethods extends BaseTest {
	ExtentreporterNG extentreporter=new ExtentreporterNG();
	public void sendKeys(WebElement element, String value) {
		try {
			if (value != null) {
				element.clear();
				element.sendKeys(value);
				
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectByVisibleText(WebElement element, String value) {
		try {
			if (value != null) {
				Select select = new Select(element);
				select.selectByVisibleText(value);
			}

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void click(WebElement element) {
		element.click();
	}
}
