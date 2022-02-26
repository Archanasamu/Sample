package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLoginPage {
	
	@Test
	public void loginPage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElementByName("username").sendKeys("archana");
		driver.findElementByName("password").sendKeys("Samu@22");
		driver.findElementByXPath("//input[@class='button']").click();
		
	}
	
	

}
