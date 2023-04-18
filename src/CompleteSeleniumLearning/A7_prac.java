package CompleteSeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A7_prac {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		
		//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			
			driver.findElement(By.id("userEmail")).sendKeys("harshaljain830@gmail.com");
			driver.findElement(By.id("userPassword")).sendKeys("Password1!");
			driver.findElement(By.id("login")).click();
			
			List<WebElement> pick=driver.findElements(By.cssSelector("div[class*='col-lg-4 col-md-6 ']"));
			
			for(WebElement find:pick)
			{
			String str=find.getText();
			
			if (str.equalsIgnoreCase("adidas original"))
			{
				driver.findElement(By.xpath("(//*[text()=' Add To Cart']) [2]")).click();
			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement sel1=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel=new Select(sel1);
		sel.selectByIndex(2);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByVisibleText("USD");
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByValue("INR");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(300);
		for(int i=0;i<=5;i++)
		{		
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
			break;
		}
		driver.findElement(By.id("hrefIncAdt")).click();
		
		driver.findElement(By.className("red-arrow-btn")).click();
		
		driver.findElement(By.xpath("//*[text()=' Bengaluru (BLR)']")).click();
		Thread.sleep(2000);;
		
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		driver.findElement(By.id("autosuggest")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		
		List<WebElement> lists=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement list:lists)
		{
			if(list.getText().equalsIgnoreCase("IND"))
			{
				list.click();
				break;
			}
		}
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.xpath("(//input[@type='checkbox']) [4]")).isSelected();
		driver.findElement(By.xpath("(//input[@type='checkbox']) [4]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox']) [4]")).isSelected();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(3000);
		
		
		*/
			}}
}
