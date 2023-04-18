package CompleteSeleniumLearning;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class C4_Stream {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementlist=driver.findElements(By.xpath("//tr/td[1]"));

	List<String> Original_List=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	
	List<String> Sorted_List=Original_List.stream().sorted().collect(Collectors.toList());
	
	Assert.assertTrue(Original_List.equals(Sorted_List));
		
	}

}
