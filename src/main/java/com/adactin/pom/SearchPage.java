package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//td[text()='Welcome to Adactin Group of Hotels']")
	private static WebElement welcomeText;

	@FindBy(xpath = "//input[@id='username_show']")
	private static WebElement usernameShow;
	
	@FindBy(xpath = "//a[text()='Search Hotel']")
	private static WebElement searchHotelLink;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private static WebElement bookItineraryLink;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	private static WebElement changePasswordLink;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private static WebElement logout;
	
	@FindBy(id = "location")
	private static WebElement location;
	
	@FindBy(id = "hotels")
	private static WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private static WebElement roomType;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private static WebElement roomNos;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private static WebElement datepickerInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private static WebElement datepickerInOut;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private static WebElement adultPerRoom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private static WebElement childPerRoom;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private static WebElement search;
	
	@FindBy(xpath = "//input[@id='Reset']")
	private static WebElement reset;
	
	
	public SearchPage(WebDriver ldriver) {
	this.driver = ldriver;
	PageFactory.initElements(driver, this);	
	}
	
	
	public static WebElement getWelcomeText() {
		return welcomeText;
	}

	public static WebElement getUsernameShow() {
		return usernameShow;
	}

	public static WebElement getSearchHotelLink() {
		return searchHotelLink;
	}

	public static WebElement getBookItineraryLink() {
		return bookItineraryLink;
	}

	public static WebElement getChangePasswordLink() {
		return changePasswordLink;
	}

	public static WebElement getLogout() {
		return logout;
	}

	public static WebElement getLocation() {
		return location;
	}

	public static WebElement getHotels() {
		return hotels;
	}

	public static WebElement getRoomType() {
		return roomType;
	}

	public static WebElement getRoomNos() {
		return roomNos;
	}

	public static WebElement getDatepickerInDate() {
		return datepickerInDate;
	}

	public static WebElement getDatepickerInOut() {
		return datepickerInOut;
	}

	public static WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public static WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public static WebElement getSearch() {
		return search;
	}

	public static WebElement getReset() {
		return reset;
	}
	
	
	
	
}
