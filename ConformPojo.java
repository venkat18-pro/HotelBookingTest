package org.test.booking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformPojo extends BaseClass{
	
	public ConformPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selRadio;
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getSelRadio() {
		return selRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
}
