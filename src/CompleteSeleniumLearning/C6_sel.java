package CompleteSeleniumLearning;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C6_sel {
	
	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
			
		WebDriver driver =new ChromeDriver();
		/*
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
			
			
				driver.findElement(By.id("inputUsername")).sendKeys("harshaljain123@gmail.com");
				driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Harshal");
				
				driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
				driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
			    driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
   String error=driver.findElement(By.cssSelector("p[class='error']")).getText();
		
		System.out.println(error);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("rahulshettyacademy");
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement selection=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select sel =new Select(selection);
		
		sel.selectByIndex(2);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByValue("USD");
		sel.getFirstSelectedOption().getText();
		System.out.println(sel.getFirstSelectedOption().getText());	
		sel.selectByVisibleText("INR");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();  
	   for(int i=1;i<=3;i++)
	   {
		   
		   driver.findElement(By.id("hrefIncAdt")).click();
	   }
		
		driver.findElement(By.cssSelector("input[value*='Done']")).click();
		
		driver.findElement(By.cssSelector("input[class*='ui-autocomplete-input']")).click();
		driver.findElement(By.cssSelector("input[class*='ui-autocomplete-input']")).sendKeys("Ind");
		
	List<WebElement> options=	driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	for(WebElement opt:options)
	{
		if(opt.getText().equalsIgnoreCase("Ind"))
		{
			opt.click();
			break;	
		}
		
	}
		
	*/
		
		//Alert
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("harshal");
		driver.switchTo().alert().accept();
		
		WebDriverWait w=new WebDriverWait(driver,5);
	//	w.until(ExpectedConditions.visibilityOf(element));
		
		
		
		
		
	}
}
