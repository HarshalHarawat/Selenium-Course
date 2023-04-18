package CompleteSeleniumLearning;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3_Scrolling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); //Scroll the page 
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");//Scroll the table
		
		
		

	}

}
