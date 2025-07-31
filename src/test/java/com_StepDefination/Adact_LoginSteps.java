package com_StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import con_pageobjects01.Adact_LoginPage;
import io.cucumber.java.en.*;

public class Adact_LoginSteps {
	WebDriver driver;
	Adact_LoginPage ALP;
	@Given("User should open the Browser")
	public void user_should_open_the_browser() {
	    driver = new ChromeDriver();
	}

	@Given("User open the Application")
	public void user_open_the_application() {
		driver.get("https://adactinhotelapp.com/index.php");	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@When("^User enters the (.*) & (.*)$")
	public void user_enters_the_username_password(String username, String password) {
	//	driver.findElement(By.id("username")).sendKeys(username);
	//	driver.findElement(By.id("password")).sendKeys(Password);
		
		ALP = new Adact_LoginPage(driver);
		ALP.setusername(username);
		ALP.setpassword(password);
		ALP.clickloginbtn();
	    
	}

	@When("User click on the Sigin button")
	public void user_click_on_the_sigin_button() {
		driver.findElement(By.id("login")).click();
	    
	}

	@Then("User should successfully login")
	public void user_should_successfully_login() {
		System.out.println("Login is successfully done!");
	    
	}

	@Then("User should navigate to Search Hotel Functionality")
	public void user_should_navigate_to_search_hotel_functionality() {
		
		String Actual_Title = "Adactin.com - Search Hotel";
		String Exp_Title = driver.getTitle();
		
		if(Exp_Title.equals(Actual_Title)) {
			Assert.assertTrue(true);
			System.out.println("TestCases is Passed");
		}else {
			System.out.println("The TestCases is Failed");
			Assert.assertTrue(false);
			
		}
	    
	}

}
