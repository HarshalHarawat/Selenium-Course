package CompleteSeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*; //static pacakge



public class B8_Height_Width_TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement textbox=driver.findElement(By.cssSelector("input[name='name']"));
		
		System.out.println(textbox.getRect().getDimension().getHeight());
		System.out.println(textbox.getRect().getDimension().getWidth());
		
		
	}

}
