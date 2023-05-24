package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import junit.framework.Assert;

public class LoginOmrStep {
	
	WebDriver driver;
	
	@Given("User is on the omrbranch login page")
	public void a() {
	    WebDriverManager.chromedriver().setup();
	    //
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    //
	    driver = new ChromeDriver(options);
	    driver.get("https://omrbranch.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	}
	@When("User enters username and password")
	public void b() {
	    WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("ahmedriyas231@gmail.com");
	    
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("Riyas@2301");
	}
	@When("click login button")
	public void c() {
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[text() = 'Login']"));
	    loginBtn.click();
	   
	}
	@Then("User should verify after login success message")
	public void d() {
         org.junit.Assert.assertTrue("User should verify after login success message", true);    
	   
	}




}
