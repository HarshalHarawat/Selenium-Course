package CompleteSeleniumLearning;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B4_LinksCount_SubDriver_NewTab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		System.out.println(driver.findElements(By.tagName("a")).size());//Counting all the links present on Window
		
//		Here we are limiting the scope of webdriver
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); //Counting footer links
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement subsection=footerdriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul [1]"));
		System.out.println(subsection.findElements(By.tagName("a")).size());//Counting the Footer section link
		
		for(int i=1;i<subsection.findElements(By.tagName("a")).size();i++)
			
		{
			String newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			subsection.findElements(By.tagName("a")).get(i).sendKeys(newtab);
			Thread.sleep(5000L);	
		}
		
	Set<String> win=	driver.getWindowHandles();
		Iterator<String> it=	win.iterator();
		
		while(it.hasNext())
		{
			String child=it.next();
			
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			
		}
	}

}
