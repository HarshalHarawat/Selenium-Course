package CompleteSeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B2_FrameSwitch_Handle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		
		//driver.switchTo().frame(0);
		//driver.get("http://the-internet.herokuapp.com/nested_frames");
	//driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[name='frameset-middle']")));
	
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
	
	System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
	
	
		
		
		
		/*
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions act=new Actions(driver);
		
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		driver.manage().window().maximize();
		*/
		
		
	
		
		
	}

}
