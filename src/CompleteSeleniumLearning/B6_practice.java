package CompleteSeleniumLearning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		List<WebElement> date=driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));
		int sizes=driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).size();
		
		for(int i=0;i<sizes;i++)
		{
			if(date.get(i).getText().equalsIgnoreCase("23"));
			driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).click();
		}
		
		
		
		
		
		
	/*	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		
		int count =driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		int count1=footerdriver.findElements(By.tagName("a")).size();
		System.out.println(count1);
		
		WebElement LinkSection=driver.findElement(By.xpath("//div/table/tbody/tr/td/ul[1]"));
		int count3=LinkSection.findElements(By.tagName("a")).size();
		System.out.println(count3);
		
		
		for(int i=1;i<LinkSection.findElements(By.tagName("a")).size();i++)
		{
			String newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			LinkSection.findElements(By.tagName("a")).get(i).sendKeys(newtab);
			Thread.sleep(3000L);
		}
		
	Set<String> str=	driver.getWindowHandles();
	Iterator<String> it=str.iterator();
	
	while(it.hasNext())
			{
			String child=it.next();	
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			}
*/
		

	}

}
