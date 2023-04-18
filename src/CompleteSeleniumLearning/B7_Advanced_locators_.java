package CompleteSeleniumLearning;

import static org.openqa.selenium.support.locators.RelativeLocator.*; //static pacakge

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B7_Advanced_locators_ {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	
		
		WebElement above1=driver.findElement(By.xpath("(//input[@name='name']) [1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(above1)).getText());
		
		WebElement below1=driver.findElement(By.xpath("//label[text()='Email']"));
		
		driver.findElement(with(By.tagName("input")).below(below1)).sendKeys("harshaljain830");
		
		WebElement right1=driver.findElement(By.id("exampleCheck1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(right1)).getText());
		
		WebElement left1=driver.findElement(By.id("inlineRadio2"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).toLeftOf(left1)).getText());
		
		
	}
}
