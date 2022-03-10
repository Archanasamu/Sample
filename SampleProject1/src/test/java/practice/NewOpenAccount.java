package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewOpenAccount {
	
	@Test
	public void openNewAccount() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElementByName("username").sendKeys("archana");
		driver.findElementByName("password").sendKeys("Samu@22");
		driver.findElementByXPath("//input[@class='button']").click();
		
		driver.findElementByPartialLinkText("Open New Account").click();
		WebElement type = driver.findElementById("type");
		Select accType = new Select(type);
		accType.selectByValue("1");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@value='Open New Account']").click();
	}

}
