package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSessionConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); //session will be created with session id

		driver.get("https://www.facebook.com/");

		WebElement fn = driver.findElement(By.id("u_0_j"));
		fn.sendKeys("Naveen");

		//driver.quit(); //session will be terminated -- there is no session id
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

		driver.close(); //to close the browser -- NoSuchSessionException: invalid session id
		System.out.println(driver.getTitle());

	}

}
