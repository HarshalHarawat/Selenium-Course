package CompleteSeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_XY_location {
	
	public static void main(String [] args)
	{
	System.setProperty("webdriver.chrome.driver","/driver/chromedriver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://letcode.in/edit");
	Point pnt=driver.findElement(By.id("fullName")).getLocation();
	System.out.println(pnt.x);
	System.out.println(pnt.y);	
	
	}

}
