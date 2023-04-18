package CompleteSeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A3_Checkboxes_Assertion 
{
	public static void main(String[]args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver",  "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
		Thread.sleep(4000);
		System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox'])")).size());
		
		
		Assert.assertEquals(driver.findElements(By.xpath("(//input[@type='checkbox'])")).size(), 6);
		
	
		
	}
	

}
