package com.adactin.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/adactin/feature/adactin.feature",//path of feature file
		glue = "com\\adactin\\stepdefinition", //path of step definition
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html"},
		//tags = {"@SmokeTest"},//to execute any particular scenario (use ~ to omit the scenario)
		monochrome = true ,//to display the output in readable format (to remove the special characters in console which we get because of feature file colour of keywords)
		dryRun = false,//to check whether all the steps in feature are present in step definition
		strict = true//if any miss match between feature file and step definition, it stops the execution immediately
		)
public class Runner {
	
	public static WebDriver driver;
	@BeforeClass 
	public static void setup() throws FileNotFoundException, IOException {
		//only browser open and closed should be present in runner class, rest everything is step def
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName); //chrome
	}
	
	@AfterClass
	public static void clearup() {
		driver.quit();
	}
	/*public static void main(String[] args) throws FileNotFoundException, IOException {
		ConfigurationReader cr = new ConfigurationReader();
		String browserName = cr.getBrowserName();
		System.out.println(browserName);
	}*/

}
