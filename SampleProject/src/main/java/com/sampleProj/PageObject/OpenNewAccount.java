package com.sampleProj.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sampleProj.BaseClass.ProjectSpecificMethods;

public class OpenNewAccount extends ProjectSpecificMethods{
	
	public OpenNewAccount(ChromeDriver driver){
		
		this.driver = driver;
	}
	
	public void clickOnOpenNewAccount(){
		driver.findElementByPartialLinkText("Open New Account").click();
	}
	public void selectAccountType() throws InterruptedException{
		WebElement type = driver.findElementById("type");
		Select accType = new Select(type);
		accType.selectByValue("1");
		Thread.sleep(1000);
	}
	public void clickOnSubmit(){
		driver.findElementByXPath("//input[@value='Open New Account']").click();
	}

}
