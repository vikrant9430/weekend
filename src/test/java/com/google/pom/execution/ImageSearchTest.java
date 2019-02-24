package com.google.pom.execution;

import org.testng.annotations.Test;

import com.google.page.object.model.GooglePage;
import com.google.page.object.model.ImageSearch;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ImageSearchTest {
	WebDriver driver;
  @Test
  public void serchImage() 
  {
	  GooglePage image = new GooglePage(driver);
	  image.clickImageLink();
	  ImageSearch searchImage = new ImageSearch(driver);
	  searchImage.enterTextIntoImageSearchBox("Best Toilet Paper in the World");
	  searchImage.clickImageSearchButton();
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
  public void tearDown() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
