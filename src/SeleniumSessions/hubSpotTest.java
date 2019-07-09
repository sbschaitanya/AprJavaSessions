package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hubSpotTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		//Thread.sleep(6000);
		
		WebElement forgotPwdLink = driver.findElement(By.linkText("Forgot Password?"));
//		
//		JavaScriptUtil.clickElementByJS(forgotPwdLink, driver);
		
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//JavaScriptUtil.generateAlert(driver, "hi this is my javascript alert");
		
		//JavaScriptUtil.drawBorder(forgotPwdLink, driver);
		
		//JavaScriptUtil.sendKeysUsingJSWithId(driver, "username", "Naveen@gmail.com");
		
		//System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		//System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
		//JavaScriptUtil.flash(forgotPwdLink, driver);
		
		//JavaScriptUtil.scrollIntoView(forgotPwdLink, driver);
		
		//JavaScriptUtil.scrollPageDown(driver);
		
		
		
	}

}
