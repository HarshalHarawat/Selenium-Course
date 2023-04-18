package CompleteSeleniumLearning;

import java.awt.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4_Checkbox_assignment {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	driver.findElement(By.id("checkBoxOption1")).click();
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	
	WebElement sel=driver.findElement(By.xpath("//Select[contains(@id,'dropdown-class-example')]"));
	Select dropdown=new Select(sel);
	dropdown.selectByIndex(2);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("option1");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("Option3");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	
	driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bra");
	Thread.sleep(3000);
	java.util.List<WebElement> lists=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
	
	for(WebElement pickoption:lists)
	{
		if(pickoption.getText().equalsIgnoreCase("Bra"))
		{
			pickoption.click();
			break;
		}
	}

	}

}
