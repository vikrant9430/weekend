package com.google.page.object.model.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GmailPagepf {
WebDriver driver;

	@FindBy(how = How.XPATH, using = "/html/body/nav/div/a[2]")
	WebElement signIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"identifierId\"]")
	WebElement email;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")
	WebElement nextForPass;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input")
	WebElement  password;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")
	WebElement  signInButtonforLogin;
	
	
	public GmailPagepf(WebDriver driver)
	{
		PageFactory.initElements(driver, driver);
	}
	
	public void clickSignIn()
	{
		signIn.click();		
	}
	
	public void enterEmail(String emailAddress)
	{
		email.sendKeys(emailAddress);
	}
	
	public void clickNextButton()
	{
		nextForPass.click();
	}
	
	public void enterPassword(String emailPassword)
	{
		password.sendKeys(emailPassword);
	}
	
	
	public void clickOnSignInButton()
	{
		signInButtonforLogin.click();
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
