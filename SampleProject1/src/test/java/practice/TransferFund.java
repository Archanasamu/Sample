package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TransferFund {
	
	@Test
	public void fundTransfer() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElementByName("username").sendKeys("archana");
		driver.findElementByName("password").sendKeys("Samu@22");
		driver.findElementByXPath("//input[@class='button']").click();
		
		driver.findElementByPartialLinkText("Transfer Funds").click();
		Thread.sleep(2000);
		driver.findElementById("amount").sendKeys("100");
		WebElement fromAcc = driver.findElementById("fromAccountId");
		selectmethod(fromAcc, "13677");
		WebElement toAcc = driver.findElementById("toAccountId");
		selectmethod(toAcc, "14010");
		driver.findElementByXPath("//input[@type='submit']").click();
	}
	
	public static void selectmethod(WebElement ele, String value) {
		
		Select drop = new Select(ele);
		
		List<WebElement> alloption = drop.getOptions();
		
		for(WebElement option:alloption)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
		
	}

}
