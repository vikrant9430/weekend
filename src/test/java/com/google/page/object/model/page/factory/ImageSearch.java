package com.google.page.object.model.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ImageSearch {
	
	WebDriver driver;

	@FindBy(how=How.XPATH,using = "/html/body/div/div[3]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")
	WebElement imageSearchBox;
	
	
	@FindBy(how=How.XPATH,using = "/html/body/div/div[3]/div[3]/form/div[2]/div/div[1]/button")
	WebElement imageSearchButton;	
	
	public ImageSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, driver);
	}
	
	public void enterTextIntoImageSearchBox(String searchKeyword)
	{
		imageSearchBox.sendKeys(searchKeyword);		
	}
	
	public void clickImageSearchButton()
	{
		imageSearchButton.click();
	}	
}
