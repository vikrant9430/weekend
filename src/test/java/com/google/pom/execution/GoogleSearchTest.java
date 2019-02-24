package com.google.pom.execution;

import org.testng.annotations.Test;

import com.google.page.object.model.GooglePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleSearchTest {
	WebDriver driver;
  @Test
  public void Search() 
  {
	  GooglePage search = new GooglePage(driver);
	  search.enterTextIntoSearchBox("India Gate");
	  search.clickSearchButton();
	  
  }
  @BeforeMethod
  public void openBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\"
		  		+ "rishabh\\Desktop\\Selenium Class\\Browser Driver\\"
		  		+ "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.google.com");
  }

  @AfterMethod
  public void TearDown() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
