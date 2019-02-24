package com.google.page.object.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPage {
WebDriver driver;
	
	By signIn = By.xpath("/html/body/nav/div/a[2]");
	By email = By.xpath("//*[@id=\"identifierId\"]");
	By nextForPass = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span");
	By password= By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input");
	By signInButtonforLogin= By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span");
	
	
	public GmailPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickSignIn()
	{
		driver.findElement(signIn).click();		
	}
	
	public void enterEmail(String emailAddress)
	{
		driver.findElement(email).sendKeys(emailAddress);
	}
	
	public void clickNextButton()
	{
		driver.findElement(nextForPass).click();
	}
	
	public void enterPassword(String emailPassword)
	{
		driver.findElement(password).sendKeys(emailPassword);
	}
	
	
	public void clickOnSignInButton()
	{
		driver.findElement(signInButtonforLogin).click();
	}
	
	public void signInOperation(String emailAddress, String emailPassword) throws InterruptedException
	{
		this.clickSignIn();
		this.enterEmail(emailAddress);
		this.clickNextButton();
		Thread.sleep(5000);
		this.enterPassword(emailPassword);
		this.clickOnSignInButton();
	}
}
