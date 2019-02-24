package com.google.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImageSearch {
	
	WebDriver driver;

	
	By imageSearchBox = By.xpath("/html/body/div/div[3]/div[3]/form/div[2]/div/div[1]/div/div[1]/input");
	
	By imageSearchButton = By.xpath("/html/body/div/div[3]/div[3]/form/div[2]/div/div[1]/button");
		
	
	public ImageSearch(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void enterTextIntoImageSearchBox(String searchKeyword)
	{
		driver.findElement(imageSearchBox).sendKeys(searchKeyword);		
	}
	
	public void clickImageSearchButton()
	{
		driver.findElement(imageSearchButton).click();
	}	
}
