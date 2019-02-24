package com.google.page.object.model.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePagepf {
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")
	WebElement searchBox;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]")
	WebElement googleSearchButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[2]")
	WebElement feelingLuckyButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a")
	WebElement gmailLink;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[2]/a")
	WebElement imageLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gb_70\"]")
	WebElement signInButton;
	
	
		
	public GooglePagepf(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterTextIntoSearchBox(String searchKeyword)
	{
		searchBox.sendKeys(searchKeyword);		
	}
	
	public void clickSearchButton()
	{
		googleSearchButton.click();
	}
	
	public void clickFeelingLuckyButton()
	{
		feelingLuckyButton.click();
	}
	
	public void clickGmailLink()
	{
		gmailLink.click();
	}
	
	public void clickImageLink()
	{
		imageLink.click();
	}
	
	public void clickSignInButtonOnHomePage()
	{
		signInButton.click();
	}
	
	

}
