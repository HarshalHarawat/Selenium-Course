package CompleteSeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A6_Practice_assignment_ToFillForm {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Implicitly Wait
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Top']"))).contextClick().build().perform();
		
	
		
		
		/*
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,' ng-pristine ng-invalid ng-touched')]")).sendKeys("Harshal");
		driver.findElement(By.name("email")).sendKeys("Harawat");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jain");
		driver.findElement(By.className("form-check-input")).click();
		
		WebElement ele=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown =new Select(ele);
		
		dropdown.selectByValue("Female");
		System.out.println(dropdown.getFirstSelectedOption());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //IMPLICIT WAIT

		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("28-12-1997");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		*/
	}

}
