package org.headerstepdef;

import java.time.Duration;
import java.util.List;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OneDStepDefHeader   {
	WebDriver driver;
	@Given("User is on the Amazon page")
	public void user_is_on_the_amazon_page() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverManager.chromedriver().setup();
		//***
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		//***
		 driver = new ChromeDriver(o);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();   
	}
	
	
	@When("User search for any product")
	public void user_search_for_any_product(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> asList = dataTable.asList();
		String string = asList.get(2);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string,Keys.ENTER);
		
	    
	}
	
	

	@Then("user should verify all the product listed")
	public void user_should_verify_all_the_product_listed() {
	     System.out.println("Success");
	}










}
