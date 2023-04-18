package CompleteSeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A2_DropDowns {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement sel=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select(sel);
		
		
		
		
		/*
		 
		//*********************************Static dropdown*********************
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());  //USD
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());  //AED
		
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText()); //INR
		
		*/
		
		
		
		/*   Dropdown increment the adult count
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(200);
		for(int i=1;i<=5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		
		}
		driver.findElement(By.cssSelector("input[value*='Done']")).click();
		 
		//Source and Destination dropdown 
		 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  //indexes
		
*/
							//Auto Suggestive
		
		driver.findElement(By.id("autosuggest")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement pickoption:options)
		{
			if(pickoption.getText().equalsIgnoreCase("ind"))
			{
			pickoption.click();
			break;
			}
		}
		
	}

}
