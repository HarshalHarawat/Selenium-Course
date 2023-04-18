package CompleteSeleniumLearning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_Partial_ScreenShot {

	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement editbox=driver.findElement(By.id("twotabsearchtextbox"));
		
		File src=editbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("D:\\editboxSS.png"));
		
		
		

	}

}
