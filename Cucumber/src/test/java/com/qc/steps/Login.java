package com.qc.steps;


import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	
	WebDriver driver;
	
@Before
public void setUp() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrijaa\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///E:/Queue%20Codes%20material/Offline%20Website/Offline%20Website/index.html");
}
		@Given("to enter valid userName {string}")
		public void to_enter_valid_user_name(String uName) {
			driver.findElement(By.id("email")).sendKeys(uName);
		}


	

		@Given("to enter valid password {string}")
		public void to_enter_valid_password(String uPass) {
		   driver.findElement(By.id("password")).sendKeys(uPass);
		}
		@When("to click on sign in button")
		public void to_click_on_sign_in_button() {
			driver.findElement(By.id("submit")).click();
		   
		}
		@Then("to validate the dashboard page title {string}")
		public void to_validate_the_dashboard_page_title(String expResult) {
		   String actResult =driver.getTitle();
		   Assert.assertEquals(actResult, expResult);
		}

      @After 
      public void tearDown() {
    	  driver.close();
      }

}
