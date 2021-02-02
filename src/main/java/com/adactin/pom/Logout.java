package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Click here to login again']")
	private static WebElement logout_loginAgainLink;
	
	public Logout(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getLogout_loginAgainLink() {
		return logout_loginAgainLink;
	}

}
