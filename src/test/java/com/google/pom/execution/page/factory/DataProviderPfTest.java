package com.google.pom.execution.page.factory;

import org.testng.annotations.Test;

import com.google.page.object.model.GooglePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderPfTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void search(String s) {
	  GooglePage search = new GooglePage(driver);
	  search.enterTextIntoSearchBox(s);
	  search.clickSearchButton();
  }
  @BeforeMethod
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\"
		  		+ "rishabh\\Desktop\\Selenium Class\\Browser Driver\\"
		  		+ "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.google.com");
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"India Gate"},
      new Object[] {"Buland Sahar"},
      new Object[] {"Jammu"},
      new Object[] {"US"},
      
    };
  }
}
