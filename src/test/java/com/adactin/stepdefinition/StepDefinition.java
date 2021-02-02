package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.LoginPage;
import com.adactin.pom.Logout;
import com.adactin.pom.SearchPage;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{
	
	public static WebDriver driver = Runner.driver;//assign driver from runner class
	
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		//driver = getBrowser("chrome");
		//driver = new ChromeDriver();
		//getURL("https://adactinhotelapp.com/index.php");
		String url = FileReaderManager.getInstance().getCrInstance().getURL();
		getURL(url);
	}

	/*
	 * @When("^User enters the valid username in username field$") public void
	 * user_enters_the_valid_username_in_username_field() throws Throwable {
	 * LoginPage lp = new LoginPage(driver); inputToElement(lp.getUsername(),
	 * "gdhalgaonkar"); }
	 * 
	 * @When("^User enters the valid password in the password field$") public void
	 * user_enters_the_valid_password_in_the_password_field() throws Throwable {
	 * LoginPage lp = new LoginPage(driver); inputToElement(lp.getPassword(),
	 * "Test@123");
	 * 
	 }*/
	 
	@When("^User enters the valid \"([^\"]*)\" in username field$")
	public void user_enters_the_valid_in_username_field(String username) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		inputToElement(lp.getUsername(), username);
	}

	@When("^User enters the valid \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_in_the_password_field(String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		inputToElement(lp.getPassword(), password);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		clickOnElement(lp.getLogin());
	}

	@Then("^User verifies whether home page navigates to serch hotel page$")
	public void user_verifies_whether_home_page_navigates_to_serch_hotel_page() throws Throwable {
	    
	 
	}

	/*
	 * @When("^User enters valid location in location field$") public void
	 * user_enters_valid_location_in_location_field() throws Throwable { SearchPage
	 * sp = new SearchPage(driver); selectDropDown(sp.getLocation(), "id", "2"); }
	 * 
	 * @When("^User enters valid hotels in hotels field$") public void
	 * user_enters_valid_hotels_in_hotels_field() throws Throwable { SearchPage sp =
	 * new SearchPage(driver); selectDropDown(sp.getHotels(), "id", "2");
	 * 
	 * }
	 * 
	 * @When("^User enters valid room type in room type field$") public void
	 * user_enters_valid_room_type_in_room_type_field() throws Throwable {
	 * SearchPage sp = new SearchPage(driver); selectDropDown(sp.getRoomType(),
	 * "id", "2"); }
	 * 
	 * @When("^User enters valid no of rooms in no of rooms field$") public void
	 * user_enters_valid_no_of_rooms_in_no_of_rooms_field() throws Throwable {
	 * SearchPage sp = new SearchPage(driver); selectDropDown(sp.getRoomNos(), "id",
	 * "1");
	 * 
	 * }
	 * 
	 * @When("^User enters valid checkin date in checkin date field$") public void
	 * user_enters_valid_checkin_date_in_checkin_date_field() throws Throwable {
	 * SearchPage sp = new SearchPage(driver);
	 * inputToElement(sp.getDatepickerInDate(), "25/12/2020"); }
	 * 
	 * @When("^User enters valid checkout date in checkout date field$") public void
	 * user_enters_valid_checkout_date_in_checkout_date_field() throws Throwable {
	 * SearchPage sp = new SearchPage(driver);
	 * inputToElement(sp.getDatepickerInOut(), "29/12/2020");
	 * 
	 * }
	 * 
	 * @When("^User enters valid adults per room in adults per room field$") public
	 * void user_enters_valid_adults_per_room_in_adults_per_room_field() throws
	 * Throwable { SearchPage sp = new SearchPage(driver);
	 * selectDropDown(sp.getAdultPerRoom(), "id", "2"); }
	 * 
	 * @When("^User enters valid children per room in children per room field$")
	 * public void user_enters_valid_children_per_room_in_children_per_room_field()
	 * throws Throwable { SearchPage sp = new SearchPage(driver);
	 * selectDropDown(sp.getChildPerRoom(), "id", "1");
	 * 
	 * }
	 */
	
	@When("^User enters valid \"([^\"]*)\" in location field$")
	public void user_enters_valid_in_location_field(String location) throws Throwable {
		SearchPage sp = new SearchPage(driver);
	    selectDropDown(sp.getLocation(), "id", "2");
	}

	@When("^User enters valid \"([^\"]*)\" in hotels field$")
	public void user_enters_valid_in_hotels_field(String hotel) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		 selectDropDown(sp.getHotels(), "id", "2");
	}

	@When("^User enters valid \"([^\"]*)\" in room type field$")
	public void user_enters_valid_in_room_type_field(String room_type) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		selectDropDown(sp.getRoomType(), "id", "2");
	}

	@When("^User enters valid \"([^\"]*)\" in no of rooms field$")
	public void user_enters_valid_in_no_of_rooms_field(String no_of_rooms) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		selectDropDown(sp.getRoomNos(), "id", "2");
	}

	@When("^User enters valid \"([^\"]*)\" in checkin date field$")
	public void user_enters_valid_in_checkin_date_field(String checkin_date) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		inputToElement(sp.getDatepickerInDate(), "08/01/2021");	    
	}

	@When("^User enters valid \"([^\"]*)\" in checkout date field$")
	public void user_enters_valid_in_checkout_date_field(String checkout_date) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		inputToElement(sp.getDatepickerInOut(), "10/01/2021");
	}

	@When("^User enters valid \"([^\"]*)\" in adults per room field$")
	public void user_enters_valid_in_adults_per_room_field(String adults_per_room) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		selectDropDown(sp.getAdultPerRoom(), "id", "2");
	}

	@When("^User enters valid \"([^\"]*)\" in children per room field$")
	public void user_enters_valid_in_children_per_room_field(String children_per_room) throws Throwable {
		SearchPage sp = new SearchPage(driver);
		selectDropDown(sp.getChildPerRoom(), "id", "2");
	}

	@When("^user clicks on Search button$")
	public void user_clicks_on_Search_button() throws Throwable {
		SearchPage sp = new SearchPage(driver);
		clickOnElement(sp.getSearch());
	}

	@Then("^user verifies whether search page navigates to select hotel page$")
	public void user_verifies_whether_search_page_navigates_to_select_hotel_page() throws Throwable {
	    
	 
	}

	@When("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	 
	}

	/*
	 * @When("^user selects select radio button from select hotel grid$") public
	 * void user_selects_select_radio_button_from_select_hotel_grid() throws
	 * Throwable { SelectHotel sh = new SelectHotel(driver);
	 * clickOnElement(sh.getRadioButton()); }
	 */
	
	@When("^user selects \"([^\"]*)\" from select hotel grid$")
	public void user_selects_from_select_hotel_grid(String select_radio_button) throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickOnElement(sh.getRadioButton());
	}
	
	@When("^user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickOnElement(sh.getContinueButton());
	 
	}

	@Then("^user verifies whether user is navigated to Book a Hotel page$")
	public void user_verifies_whether_user_is_navigated_to_Book_a_Hotel_page() throws Throwable {
	    
	 
	}

	@When("^User clicks on continue button from select hotel page$")
	public void user_clicks_on_continue_button_from_select_hotel_page() throws Throwable {
	    
	 
	}

	/*
	 * @When("^User enters valid first name in first name field$") public void
	 * user_enters_valid_first_name_in_first_name_field() throws Throwable {
	 * BookAHotel bah = new BookAHotel(driver);
	 * inputToElement(bah.getBookAHotel_FirstName(), "Gandhali");
	 * 
	 * }
	 * 
	 * @When("^User enters valid last name in last name field$") public void
	 * user_enters_valid_last_name_in_last_name_field() throws Throwable {
	 * BookAHotel bah = new BookAHotel(driver);
	 * inputToElement(bah.getBookAHotel_LastName(), "Dhalgaonkar");
	 * 
	 * }
	 * 
	 * @When("^User enters valid Billing Address in Billing Address field$") public
	 * void user_enters_valid_Billing_Address_in_Billing_Address_field() throws
	 * Throwable { BookAHotel bah = new BookAHotel(driver);
	 * inputToElement(bah.getBookAHotel_BillingAdd(), "Dhalgaonkar");
	 * 
	 * }
	 * 
	 * @When("^User enters valid Credit Card no in Credit Card no field$") public
	 * void user_enters_valid_Credit_Card_no_in_Credit_Card_no_field() throws
	 * Throwable { BookAHotel bah = new BookAHotel(driver);
	 * inputToElement(bah.getBookAHotel_CreaditCardNo(), "7675676787989880");
	 * 
	 * }
	 * 
	 * @When("^User enters valid Credit Card Type in Credit Card type field$")
	 * public void user_enters_valid_Credit_Card_Type_in_Credit_Card_type_field()
	 * throws Throwable { BookAHotel bah = new BookAHotel(driver);
	 * selectDropDown(bah.getBookAHotel_CreaditCardType(), "id", "1"); }
	 * 
	 * @When("^User enters valid Expiry Date in Expiry Date field$") public void
	 * user_enters_valid_Expiry_Date_in_Expiry_Date_field() throws Throwable {
	 * BookAHotel bah = new BookAHotel(driver);
	 * selectDropDown(bah.getBookAHotel_ExpMonth(), "id", "6");
	 * selectDropDown(bah.getBookAHotel_ExpYear(), "id", "10"); }
	 * 
	 * @When("^User enters valid cvv in cvv field$") public void
	 * user_enters_valid_cvv_in_cvv_field() throws Throwable { BookAHotel bah = new
	 * BookAHotel(driver); inputToElement(bah.getBookAHotel_CVVNo(), "5648"); }
	 */


	@When("^User enters valid \"([^\"]*)\" in first name field$")
	public void user_enters_valid_in_first_name_field(String first_name) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		inputToElement(bah.getBookAHotel_FirstName(), first_name);
		
	}

	@When("^User enters valid \"([^\"]*)\" in last name field$")
	public void user_enters_valid_in_last_name_field(String last_name) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		inputToElement(bah.getBookAHotel_LastName(), last_name);
		
	}

	@When("^User enters valid \"([^\"]*)\" in Billing Address field$")
	public void user_enters_valid_in_Billing_Address_field(String Billing_Address) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		inputToElement(bah.getBookAHotel_BillingAdd(), Billing_Address);
		
	}

	@When("^User enters valid \"([^\"]*)\" in Credit Card no field$")
	public void user_enters_valid_in_Credit_Card_no_field(String Credit_Card_no) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		inputToElement(bah.getBookAHotel_CreaditCardNo(), Credit_Card_no);
		
	}

	@When("^User enters valid \"([^\"]*)\" in Credit Card type field$")
	public void user_enters_valid_in_Credit_Card_type_field(String Credit_Card_type) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		selectDropDown(bah.getBookAHotel_CreaditCardType(), "id", "2");
		
	}

	@When("^User enters valid \"([^\"]*)\" in Expiry Date month field$")
	public void user_enters_valid_in_Expiry_Date_Month_field(String Expiry_Date_Month) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		selectDropDown(bah.getBookAHotel_ExpMonth(), "id", "2");
	}
	
	@When("^User enters valid \"([^\"]*)\" in Expiry Date year field$")
	public void user_enters_valid_in_Expiry_Date_Year_field(String Expiry_Date_Year) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		selectDropDown(bah.getBookAHotel_ExpYear(), "id", "2");
	}
	

	@When("^User enters valid \"([^\"]*)\" in cvv field$")
	public void user_enters_valid_in_cvv_field(String cvv) throws Throwable {
		BookAHotel bah = new BookAHotel(driver); 
		inputToElement(bah.getBookAHotel_CVVNo(), cvv);
		
	}

	@When("^user clicks Book Now button$")
	public void user_clicks_Book_Now_button() throws Throwable {
		BookAHotel bah = new BookAHotel(driver);
		clickOnElement(bah.getBookAHotel_Book());
	}

	@Then("^user verifies whether user navigates to Booking confirmation page$")
	public void user_verifies_whether_user_navigates_to_Booking_confirmation_page() throws Throwable {
	    
	 
	}

	@When("^user clicks on Logout button from booking confirmation page$")
	public void user_clicks_on_Logout_button_from_booking_confirmation_page() throws Throwable {
	 BookingConfirmation bc = new BookingConfirmation(driver);
	 clickOnElement(bc.getBookConf_Logout());
	 
	}

	@Then("^user verifies whether user is logged off$")
	public void user_verifies_whether_user_is_logged_off() throws Throwable {
	// driver.quit();
	 
	}
	
}
