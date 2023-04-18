package CompleteSeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class A9_Waits_in_Selenium {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicitly wait
	
driver.get("https://rahulshettyacademy.com/loginpagePractise/");

driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");

driver.findElement(By.xpath("(//span[@class='checkmark']) [2]")).click();


WebDriverWait w=new WebDriverWait(driver,5);                      //Explicitly Wait
w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

driver.findElement(By.id("okayBtn")).click();
//driver.switchTo().alert().dismiss();

WebElement sel=driver.findElement(By.cssSelector("select[class=form-control]"));

Select pick=new Select(sel);
pick.selectByValue("consult");
driver.findElement(By.id("terms")).click();


driver.findElement(By.cssSelector("input[class*='btn-md']")).click();
w.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("navbar-brand")));









/*

//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);






String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);

driver.findElement(By.cssSelector("img[alt='Cart']")).click();

driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

WebDriverWait w =new WebDriverWait(driver,5); //explicit wait
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

driver.findElement(By.cssSelector("button.promoBtn")).click();



w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

}

public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

for(int i=0;i<products.size();i++)

{

//Brocolli - 1 Kg

//Brocolli,    1 kg

String[] name=products.get(i).getText().split("-");

String formattedName=name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

List itemsNeededList = Arrays.asList(itemsNeeded);

if(itemsNeededList.contains(formattedName))

{

j++;

//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

if(j==itemsNeeded.length)

{

break;

}

}

}

*/
}



}


