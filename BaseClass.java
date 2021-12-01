package org.test.booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

   public static WebDriver driver;
	
	public WebDriver laungBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void laungUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	public void input(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public void selectElement(WebElement loc, String value) {
		Select selLoc = new Select(loc);
		selLoc.selectByVisibleText(value);	
	}
	
	public String eleAttriValue(WebElement ele, String value) {
		String attribute = ele.getAttribute(value);
		return attribute;
	}
	
	public void laungClose() {
		driver.quit();
	}
	
}


