package CompleteSeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_Add_To_Cart_App {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver",  "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> product=driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0;i<=product.size();i++)
		{
			String name=product.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //add to cart
				break;
			}
		}
		
		

	}

}
