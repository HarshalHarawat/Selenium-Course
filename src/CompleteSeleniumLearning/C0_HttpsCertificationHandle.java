package CompleteSeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C0_HttpsCertificationHandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf");
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		

	}

}
