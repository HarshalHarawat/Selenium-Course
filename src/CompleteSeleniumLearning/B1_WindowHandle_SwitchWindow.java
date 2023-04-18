package CompleteSeleniumLearning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_WindowHandle_SwitchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String>  win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String parent=it.next();
		String child=it.next();
		
		
		driver.switchTo().window(child);
		String output1=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(output1);
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		
		
		
		
		
		
		
		/*
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/documents-request']")).click();
		

//******** window handle *********
	Set<String> win= driver.getWindowHandles();
	Iterator<String> it=win.iterator();
	String parentid= it.next();
	String childid=  it.next();

// *********************************************	
	
	
	driver.switchTo().window(childid);
	String email=driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
	System.out.println(email);
	String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

	driver.switchTo().window(parentid);

	driver.findElement(By.id("username")).sendKeys(emailId);
	
	
	*/
	
	
	
	
	
	}

}
