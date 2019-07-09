package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(6000);
		
		//8 locators:
		
		//1. id: - I (unique locator)
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("naveen@gmail.com");
		
//		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("test@123");
//		
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		loginBtn.click();
		
		//2. name: -- II
		//driver.findElement(By.name("test")).sendKeys("test@gmail.com");
		
		//3. className: -- IV (not a unique locator) 
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		//driver.findElement(By.className("login-email")).sendKeys("test@123");
		
		//4. xpath: address of web element: -- III (if id and name are not available)
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//5. cssSelector: -- III (if id and name are not available)
		//driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		
		//6. linkText: only for links 
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText: only for links but not recommended
		//Sign up
		//Sign in
		//create an account for this application, we will give you some offers
		//create an user
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. tagName
		
	}

}
