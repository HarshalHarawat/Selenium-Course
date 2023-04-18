package CompleteSeleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
	
		
		
		
		/*							  // Prompt alert
		 * 
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("harshal");
		driver.switchTo().alert().accept();
		
		*/
		/*
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Harshal");
		
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).sendKeys("Harshal");
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		*/
		
		
		

	}
	

}
