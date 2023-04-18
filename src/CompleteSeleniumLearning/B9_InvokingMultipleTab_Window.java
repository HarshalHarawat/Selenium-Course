package CompleteSeleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.unix.X11.Window;


public class B9_InvokingMultipleTab_Window {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//*****************************************************
		
	//driver.switchTo().new Window(WindowType.WINDOW); //switch to window and tab
		
		Set<String> handles=driver.getWindowHandles();

		Iterator<String> it1=handles.iterator();

		String parentWindowId = it1.next();
		String childWindow =it1.next();

		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
		
		driver.switchTo().window(parentWindowId);

		WebElement name=driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);
	
		WebElement textBox=driver.findElement(By.cssSelector("input[name='name']"));
		

	}

}
