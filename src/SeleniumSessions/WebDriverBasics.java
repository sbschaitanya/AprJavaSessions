package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// 1. launch the browser:
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//2. enter the url:
		driver.get("http://www.google.com");
		
		//3. get the title of the page:
		String title = driver.getTitle();
		System.out.println("the page title is: "+ title);
		
		//4. validate the title: validation point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}else{
			System.out.println("in correct title");
		}
		
		//5. quit the browser:
		driver.quit();

	}

}
