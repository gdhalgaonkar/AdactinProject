package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Back']")
	private static WebElement back;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getBack() {
		return back;
	}

	public static WebElement getBookAHotel_Title() {
		return bookAHotel_Title;
	}

	public static WebElement getBookAHotel_HotelName() {
		return bookAHotel_HotelName;
	}

	public static WebElement getBookAHotel_Location() {
		return bookAHotel_Location;
	}

	public static WebElement getBookAHotel_RoomType() {
		return bookAHotel_RoomType;
	}

	public static WebElement getBookAHotel_NoOfRooms() {
		return bookAHotel_NoOfRooms;
	}

	public static WebElement getBookAHotel_TotalDays() {
		return bookAHotel_TotalDays;
	}

	public static WebElement getBookAHotel_PricePerNight() {
		return bookAHotel_PricePerNight;
	}

	public static WebElement getBookAHotel_TotalPri() {
		return bookAHotel_TotalPri;
	}

	public static WebElement getBookAHotel_GST() {
		return bookAHotel_GST;
	}

	public static WebElement getBookAHotel_FinalBilledPrice() {
		return bookAHotel_FinalBilledPrice;
	}

	public static WebElement getBookAHotel_FirstName() {
		return bookAHotel_FirstName;
	}

	public static WebElement getBookAHotel_LastName() {
		return bookAHotel_LastName;
	}

	public static WebElement getBookAHotel_BillingAdd() {
		return bookAHotel_BillingAdd;
	}

	public static WebElement getBookAHotel_CreaditCardNo() {
		return bookAHotel_CreaditCardNo;
	}

	public static WebElement getBookAHotel_CreaditCardType() {
		return bookAHotel_CreaditCardType;
	}

	public static WebElement getBookAHotel_ExpMonth() {
		return bookAHotel_ExpMonth;
	}

	public static WebElement getBookAHotel_ExpYear() {
		return bookAHotel_ExpYear;
	}

	public static WebElement getBookAHotel_CVVNo() {
		return bookAHotel_CVVNo;
	}

	public static WebElement getBookAHotel_Book() {
		return bookAHotel_Book;
	}

	public static WebElement getBookAHotel_Cancel() {
		return bookAHotel_Cancel;
	}
	
	public BookAHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private static WebElement bookAHotel_Title;
	
	@FindBy(xpath = "//input[@id='hotel_name_dis']")
	private static WebElement bookAHotel_HotelName;
	
	@FindBy(xpath = "//input[@id='location_dis']")
	private static WebElement bookAHotel_Location;
	
	@FindBy(xpath = "//input[@id='room_type_dis']")
	private static WebElement bookAHotel_RoomType;
	
	@FindBy(xpath = "//input[@id='room_num_dis']")
	private static WebElement bookAHotel_NoOfRooms;
	
	@FindBy(xpath = "//input[@id='total_days_dis']")
	private static WebElement bookAHotel_TotalDays;
	
	@FindBy(xpath = "//input[@id='price_night_dis']")
	private static WebElement bookAHotel_PricePerNight;
	
	@FindBy(xpath = "//input[@id='total_price_dis']")
	private static WebElement bookAHotel_TotalPri;
	
	@FindBy(xpath = "//input[@id='gst_dis']")
	private static WebElement bookAHotel_GST;
	
	@FindBy(xpath = "//input[@id='final_price_dis']")
	private static WebElement bookAHotel_FinalBilledPrice;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private static WebElement bookAHotel_FirstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private static WebElement bookAHotel_LastName;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private static WebElement bookAHotel_BillingAdd;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private static WebElement bookAHotel_CreaditCardNo;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private static WebElement bookAHotel_CreaditCardType;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private static WebElement bookAHotel_ExpMonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private static WebElement bookAHotel_ExpYear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private static WebElement bookAHotel_CVVNo;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private static WebElement bookAHotel_Book;
	
	@FindBy(xpath = "//input[@id='cancel']")
	private static WebElement bookAHotel_Cancel;
	
}
