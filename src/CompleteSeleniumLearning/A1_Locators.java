package CompleteSeleniumLearning;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A1_Locators {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).click();    
		driver.findElement(By.id("inputUsername")).sendKeys("harshal");
		driver.findElement(By.name("inputPassword")).sendKeys("Harshal1!");
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click(); // tag name = a
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("	");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9823495052");
		Thread.sleep(300);
		driver.findElement(By.xpath("//div/button[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
		driver.findElement(By.cssSelector("button[class*='login']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@id,'input')]")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Thread.sleep(1000);	

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		driver.close();
		
		/*
		 * Xpath:-
		 *  1)//Tagname[@attribute='value']
		 *  2)//TagName[contains(@attribute,'value')] 
		 *  3)//*[text(),'value']
		 * 
		 * 
		 *CSS:-
		 * 1)Tagname[attribute='value']
		 * 2)Tagname[attribute*='value']
		 * 
		 */
		
		
		
		
		
		
		
	
		
		

	}

}
