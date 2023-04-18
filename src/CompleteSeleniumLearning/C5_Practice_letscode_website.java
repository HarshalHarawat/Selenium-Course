package CompleteSeleniumLearning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C5_Practice_letscode_website {

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://letcode.in/waits");
		
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.findElement(By.id("accept")).click();
	//	WebDriverWait w =new WebDriverWait(driver,500);
	//  w.until(ExpectedConditions.alertIsPresent());
		
	
		
		
		
	
		driver.switchTo().alert().accept();
		
		
		
		/*
		 * Actions act=new Actions(driver);
	WebElement click=	driver.findElement(By.id("container"));
	act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).build().perform();
	
	*/
	
	//	act.moveToElement(click).sendKeys(Keys.chord(Keys.CONTROL,keys.a)).key
		
		
		/*
		driver.get("https://letcode.in/dropable");
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0, 200)");
		
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		
WebElement src=		driver.findElement(By.xpath("//div[contains(@class,'ui-draggable ')]"));
WebElement dst=				driver.findElement(By.id("droppable"));

act.dragAndDrop(src, dst).build().perform();
		*/
		/*
		driver.get("https://letcode.in/draggable");
		Actions act=new Actions(driver);
		
	WebElement source=	driver.findElement(By.xpath("//div[@id='sample-box']"));
	act.dragAndDropBy(source,33, 135).build().perform();
		*/
		/*
		driver.get("https://letcode.in/windows");
		
		driver.findElement(By.id("home")).click();
		
	    Set<String> win=	driver.getWindowHandles();
	    Iterator<String> it=	win.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		driver.findElement(By.id("multi")).click();
		
		*/
		
		
//--------------------------------------------------------------------------------------	
		/*
		WebElement fr=driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(fr);
		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("Harshal");
		driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("Harawat");


	WebElement ch=driver.findElement(By.cssSelector("iframe[class='has-background-white']"));
		driver.switchTo().frame(ch);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter email']")).sendKeys("Harshaljain830@gmail.com");
	
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input[name='lname']")).clear();
		driver.findElement(By.cssSelector("input[name='lname']")).sendKeys("jain");
		
	*/
		
		
		/*
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
		
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("button[id='prompt']")).click();
	
		driver.switchTo().alert().sendKeys("harshal");
		driver.switchTo().alert().accept();
	
		*/
		
//		-------------------------------------------------------------------------------------------------
		
		/*
		driver.get("https://letcode.in/dropdowns");
		
	WebElement pick=	driver.findElement(By.id("fruits"));

		Select sel=new Select(pick);
		sel.selectByVisibleText("Orange");
		
		
		WebElement picked=driver.findElement(By.id("lang"));
		Select sel1=new Select(picked);
		
	sel1.selectByIndex(4);
	System.out.println(sel1.getFirstSelectedOption().getText());
		
		
		sel.selectByIndex(4);
		System.out.println(sel.getFirstSelectedOption().getText());

*/	
		
		
//-------------------------------------------------------------------------------------------------------		
		/*
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
	System.out.println(	driver.findElement(By.xpath("//label[contains(text(),'Goto Home and come back here using driver command')]")).getText());
	
	System.out.println(driver.findElement(By.id("position")).getRect().getX());
	System.out.println(	driver.findElement(By.id("position")).getRect().getY());
	
	System.out.println(driver.findElement(By.cssSelector("button[class='button is-success']")).getRect().getHeight());
	System.out.println(driver.findElement(By.cssSelector("button[class='button is-success']")).getRect().getWidth());
	System.out.println(driver.findElement(By.xpath("//button[text()='Disabled']")).isEnabled());
	
	Actions act=new Actions(driver);
	WebElement hold=driver.findElement(By.xpath("//*[text()='Button Hold!']"));
	
	act.moveToElement(hold).sendKeys(Keys.DOWN).build().perform();
	
	*/
	
	
	
	}

}
