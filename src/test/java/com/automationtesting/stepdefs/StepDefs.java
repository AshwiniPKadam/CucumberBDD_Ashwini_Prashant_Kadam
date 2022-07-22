package com.automationtesting.stepdefs;



import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationtesting.core.WebDriverFactory;
import com.automationtesting.pageobjects.LandingPageObjects;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefs 
{
	private static final Logger logger=LogManager.getLogger(StepDefs.class);
	WebDriver driver;
	String Base_Url="http://automationpractice.com/";
	WebDriverWait wait;
	Scenario scn;
	LandingPageObjects landingPageObjects;
	
	@Before
	public void setup(Scenario scn) throws Exception
	{
		this.scn=scn;
		String BrowserName=WebDriverFactory.getBrowserName();
		driver=WebDriverFactory.getWebDriverForBrowser(BrowserName);
		logger.info("Browser invoked");
		wait=new WebDriverWait(driver,20);
		landingPageObjects=new LandingPageObjects(driver,scn);
	}
	
	 @After(order=1)
	    public void cleanUp()
	 {
	   WebDriverFactory.quitDriver();
	    logger.info("Browser closed");
	 }
	 @After(order=2)
	 public void takeScreenShot(Scenario s)
	 {
		 if (s.isFailed()) {
		        TakesScreenshot scrnShot = (TakesScreenshot)driver;
		        byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
		        scn.attach(data, "image/png","Failed Step Name: " + s.getName());
		    }else{
		        scn.log("Test case is passed, no screen shot captured");
		    }
		  }
	
@Deprecated
//@Given("User opened browser")
//public void user_opened_browser() 
//{
//	driver=new ChromeDriver();
//	driver.manage().deleteAllCookies();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	wait=new WebDriverWait(driver,20);
//  
//}

@When("User navigated to home application Url")
public void user_navigated_to_home_application_url() throws Exception 
{
   driver.get(Base_Url); 
   Thread.sleep(3000);
   scn.log("Browser navigated to URL :" + Base_Url);
   logger.info("Browser navigated to URL :" + Base_Url);
  
}
@Then("Landing page URL validated")
public void landing_page_url_validated() 
{
	
	landingPageObjects.URLvalidationTest();  
}

@Then("Landing page title validated")
public void landing_page_title_validated() 
{
	landingPageObjects.TitlevalidationTest();
}

@Then("All product catagories are displayed")
public void all_product_catagories_are_displayed() 
{
	landingPageObjects.Catagorydisplaytest();
}

@Then("Landing page logo is displayed")
public void landing_page_logo_is_displayed()
{
	landingPageObjects.logodisplaytest();
    	    
}


@Then("Landing page logo height validated")
public void landing_page_logo_height_validated() 
{
	
	landingPageObjects.logoheighttest();
}

@Then("Landing page logo width validated")
public void landing_page_logo_width_validated() 
{
	landingPageObjects.logowidthtest();
}

@When("Click On Sign in button")
public void click_on_sign_in_button() throws InterruptedException 
{
	landingPageObjects.signinclicktest();
	
    
}

@Then("Sign in page title validated")
public void sign_in_page_title_validated() 
{
	landingPageObjects.signinpagetitletest();
}

@When("Search for product {string}")
public void search_for_product(String productname)
{
	landingPageObjects.productsearchtest(productname); 
   
}

@Then("list for product is displayed")
public void list_for_product_is_displayed() 
{
	landingPageObjects.productlisttest();
    
}

@When("Click on twitter")
public void click_on_twitter() 
{
	landingPageObjects.twiterclicktest(); 
  
}

@Then("Twitter social media page displayed")
public void twitter_social_media_page_displayed()

{
	landingPageObjects.twiterpagedisplaytest();
}

@When("enter {string} in newsletter and click on proceed")
public void enter_in_newsletter_and_click_on_proceed(String email) 
{
	landingPageObjects.newslettervalidationtest(email);	 
}

@Then("Email subscription successful is validated")
public void email_subscription_successful_is_validated() 
{
	landingPageObjects.subscriptionsuccesstest(); 
}


}

