package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public static WebDriver driver;

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private static WebElement tableTitle;
	
	@FindBy(xpath = "//*[@id=\"select_form\"]/table/tbody/tr[2]/td/table/tbody")
	private static WebElement webTable;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private static WebElement radioButton;
	
	@FindBy(xpath = "//input[@id='continue']")
	private static WebElement continueButton;
	
	@FindBy(xpath = "//input[@id='cancel']")
	private static WebElement cancel;
	
	public SelectHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement getTableTitle() {
		return tableTitle;
	}

	public static WebElement getWebTable() {
		return webTable;
	}

	public static WebElement getRadioButton() {
		return radioButton;
	}

	public static WebElement getContinueButton() {
		return continueButton;
	}

	public static WebElement getCancel() {
		return cancel;
	}
}
