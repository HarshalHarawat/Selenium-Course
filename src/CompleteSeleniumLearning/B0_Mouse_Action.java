package CompleteSeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B0_Mouse_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']"))).build().perform();
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("harshal").doubleClick().build().perform();
		act.moveToElement(driver.findElement(By.id("nav-hamburger-menu"))).contextClick().build().perform();//right click
	
		
		
	}

}
