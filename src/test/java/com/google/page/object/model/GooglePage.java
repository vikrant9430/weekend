package com.google.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	
	WebDriver driver;
	
	By searchBox = By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input");
	By googleSearchButton = By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]");
	By feelingLuckyButton = By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[2]");
	By gmailLink= By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a");
	By imageLink = By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[2]/a");
	By signInButton = By.xpath("//*[@id=\"gb_70\"]");
	
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterTextIntoSearchBox(String searchKeyword)
	{
		driver.findElement(searchBox).sendKeys(searchKeyword);		
	}
	
	public void clickSearchButton()
	{
		driver.findElement(googleSearchButton).click();
	}
	
	public void clickFeelingLuckyButton()
	{
		driver.findElement(feelingLuckyButton).click();
	}
	
	public void clickGmailLink()
	{
		driver.findElement(gmailLink).click();
	}
	
	public void clickImageLink()
	{
		driver.findElement(imageLink).click();
	}
	
	public void clickSignInButtonOnHomePage()
	{
		driver.findElement(signInButton).click();
	}
	
	

}
