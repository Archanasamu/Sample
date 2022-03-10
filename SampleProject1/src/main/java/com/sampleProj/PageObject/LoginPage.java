package com.sampleProj.PageObject;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sampleProj.BaseClass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver){
		
		this.driver = driver;
	}
	
	public LoginPage enterUserName() {
		
		driver.findElementByName("username").sendKeys("archana");	
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementByName("password").sendKeys("Samu@22");
		return this;
	}

	public LoginPage clickLogin() {
		driver.findElementByXPath("//input[@class='button']").click();
		return this;
	}
}
