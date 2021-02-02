Feature: Booking functionality of Adactin Hotel

@SmokeTest
  Scenario Outline: Verify user is able to login the application
    Given User launches the application
    When User enters the valid "<username>" in username field
    And User enters the valid "<password>" in the password field
    And User clicks on login button
    Then User verifies whether home page navigates to serch hotel page
	
		Examples:
		|username|password|
		|aaa|1233|
		|bbbb|34545test|
		|tertrt|fhfgh|
		|gdhalgaonkar|Test@123|
		
		
	Scenario Outline: Verify search hotel page-Search
    When User enters valid "<location>" in location field
    And User enters valid "<hotel>" in hotels field
    And User enters valid "<room_type>" in room type field
    And User enters valid "<no_of_rooms>" in no of rooms field
    And User enters valid "<checkin_date>" in checkin date field
    And User enters valid "<checkout_date>" in checkout date field
    And User enters valid "<adults_per_room>" in adults per room field
    And User enters valid "<children_per_room>" in children per room field
    And user clicks on Search button
    Then user verifies whether search page navigates to select hotel page
    
    Examples:
    |location|hotel|room_type|no_of_rooms|checkin_date|checkout_date|adults_per_room|children_per_room|
    |Sydney|Hotel Sunshine|Double|1 Room(s)|28/01/2021|30/01/2021|2 - Two|1 - One|
   

  Scenario: Verify select hotel - continue
    When user click on search button
    And user selects "select_radio_button" from select hotel grid
    And user click on continue button
    Then user verifies whether user is navigated to Book a Hotel page

  Scenario: Verify book a hotel page
    When User clicks on continue button from select hotel page
    And User enters valid "Gandhali" in first name field
    And User enters valid "Dhalgaonkar" in last name field
    And User enters valid "Chennai-202020" in Billing Address field
    And User enters valid "7675676787989880" in Credit Card no field
    And User enters valid "Credit_Card_Type" in Credit Card type field
    And User enters valid "Expiry_Date_Month" in Expiry Date month field
    And User enters valid "Expiry_Date_Year" in Expiry Date year field
    And User enters valid "5648" in cvv field
    And user clicks Book Now button
    Then user verifies whether user navigates to Booking confirmation page
    

  Scenario: Verify user is on Booking Confirmation page and able to logout of application
    When user clicks on Logout button from booking confirmation page
    Then user verifies whether user is logged off
