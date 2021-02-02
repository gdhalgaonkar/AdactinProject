package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private static WebElement BookConf_Title;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getBookConf_Title() {
		return BookConf_Title;
	}

	public static WebElement getBookConf_HotelName() {
		return bookConf_HotelName;
	}

	public static WebElement getBookConf_Location() {
		return bookConf_Location;
	}

	public static WebElement getBookConf_RoomType() {
		return bookConf_RoomType;
	}

	public static WebElement getBookConf_ArrivalDate() {
		return bookConf_ArrivalDate;
	}

	public static WebElement getBookConf_DepartDate() {
		return bookConf_DepartDate;
	}

	public static WebElement getBookConf_TotalRoom() {
		return bookConf_TotalRoom;
	}

	public static WebElement getBookConf_AdultPerRoom() {
		return bookConf_AdultPerRoom;
	}

	public static WebElement getBookConf_ChildPerRoom() {
		return bookConf_ChildPerRoom;
	}

	public static WebElement getBookConf_PricePerNight() {
		return bookConf_PricePerNight;
	}

	public static WebElement getBookConf_TotalPrice() {
		return bookConf_TotalPrice;
	}

	public static WebElement getBookConf_GST() {
		return bookConf_GST;
	}

	public static WebElement getBookConf_FinalPrice() {
		return bookConf_FinalPrice;
	}

	public static WebElement getBookConf_FirstName() {
		return bookConf_FirstName;
	}

	public static WebElement getBookConf_LastName() {
		return bookConf_LastName;
	}

	public static WebElement getBookConf_BillingAdd() {
		return bookConf_BillingAdd;
	}

	public static WebElement getBookConf_OrderNo() {
		return bookConf_OrderNo;
	}

	public static WebElement getBookConf_SearchHotel() {
		return bookConf_SearchHotel;
	}

	public static WebElement getBookConf_MyItinerary() {
		return bookConf_MyItinerary;
	}

	public static WebElement getBookConf_Logout() {
		return bookConf_Logout;
	}
	
	public BookingConfirmation(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//input[@id='hotel_name']")
	private static WebElement bookConf_HotelName;
	
	@FindBy(xpath = "//input[@id='location']")
	private static WebElement bookConf_Location;
	
	@FindBy(xpath = "//input[@id='room_type']")
	private static WebElement bookConf_RoomType;
	
	@FindBy(xpath = "//input[@id='arrival_date']")
	private static WebElement bookConf_ArrivalDate;
	
	@FindBy(xpath = "//input[@id='departure_text']")
	private static WebElement bookConf_DepartDate;
	
	@FindBy(xpath = "//input[@id='total_rooms']")
	private static WebElement bookConf_TotalRoom;
	
	@FindBy(xpath = "//input[@id='adults_room']")
	private static WebElement bookConf_AdultPerRoom;
	
	@FindBy(xpath = "//input[@id='children_room']")
	private static WebElement bookConf_ChildPerRoom;
	
	@FindBy(xpath = "//input[@id='price_night']")
	private static WebElement bookConf_PricePerNight;
	
	@FindBy(xpath = "//input[@id='total_price']")
	private static WebElement bookConf_TotalPrice;
	
	@FindBy(xpath = "//input[@id='gst']")
	private static WebElement bookConf_GST;
	
	@FindBy(xpath = "//input[@id='final_price']")
	private static WebElement bookConf_FinalPrice;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private static WebElement bookConf_FirstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private static WebElement bookConf_LastName;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private static WebElement bookConf_BillingAdd;
	
	@FindBy(xpath = "//input[@id='order_no']")
	private static WebElement bookConf_OrderNo;
	
	@FindBy(xpath = "//input[@id='search_hotel']")
	private static WebElement bookConf_SearchHotel;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private static WebElement bookConf_MyItinerary;
	
	@FindBy(xpath = "//input[@id='logout']")
	private static WebElement bookConf_Logout;
}
