package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BillPay {

	@Test
	public void payBill() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.findElementByName("username").sendKeys("archana");
		driver.findElementByName("password").sendKeys("Samu@22");
		driver.findElementByXPath("//input[@class='button']").click();
		
		driver.findElementByPartialLinkText("Bill Pay").click();
		driver.findElementByXPath("//input[@name='payee.name']").sendKeys("boopathi");
		driver.findElementByXPath("//input[@name='payee.address.street']").sendKeys("address");
		driver.findElementByXPath("//input[@name='payee.address.city']").sendKeys("chennai");
		driver.findElementByXPath("//input[@name='payee.address.state']").sendKeys("Tamil");
		driver.findElementByXPath("//input[@name='payee.address.zipCode']").sendKeys("600215");
		driver.findElementByXPath("//input[@name='payee.phoneNumber']").sendKeys("0987456123");
		driver.findElementByXPath("//input[@name='payee.accountNumber']").sendKeys("13677");
		driver.findElementByXPath("//input[@name='verifyAccount']").sendKeys("13677");
		driver.findElementByXPath("//input[@name='amount']").sendKeys("100");
	    WebElement eledrp = driver.findElementByXPath("//select[@name='fromAccountId']");
		Select drp = new Select(eledrp);
		
		List<WebElement> allOptions = drp.getOptions();
		
		for(WebElement option:allOptions)
		{
			if(option.getText().equals("13566"))
			{
				option.click();
				break;
			}
		}
				
		driver.findElementByXPath("//input[@type='submit']").click();
	}
}
