package com.sampleProj.TestCase;

import org.testng.annotations.Test;

import com.sampleProj.BaseClass.ProjectSpecificMethods;
import com.sampleProj.PageObject.LoginPage;

public class Login_TC_01 extends ProjectSpecificMethods {
	
	@Test
	public void loginTest(){
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.clickLogin();
		
	}

}
