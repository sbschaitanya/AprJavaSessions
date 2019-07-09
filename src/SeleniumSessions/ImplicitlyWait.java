package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = LaunchUtil.launchHubSpot();
		
		//global wait -- its applied on all the webelements
		//dynamic wait
		//if element is not found within the given limit -- no such element exception will be thrown
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		//can not customize the imp wait
		//can change the imp wait timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("test123");

		//how to nullify imp wait:
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.findElement(By.id("loginBtn")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
