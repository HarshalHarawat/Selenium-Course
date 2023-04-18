package CompleteSeleniumLearning;

import java.util.List;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_CalenderUI_SelectSpecificDate {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companion/");// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
	while(!driver.findElement(By.cssSelector("[class='flatpickr-calendar animate arrowTop open'] [class='flatpickr-current-month']")).getText().contains("May"));
	{
		driver.findElement(By.cssSelector("span[class='flatpickr-next-month']")).click();	
	}
	
		List<WebElement> date=driver.findElements(By.className("flatpickr-day"));
		int count=driver.findElements(By.className("flatpickr-day ")).size();
		for(int i=0;i<count;i++)
		{		
			String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			
			}
		}	
	}	
	
}


