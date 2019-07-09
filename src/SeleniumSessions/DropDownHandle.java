package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectValueFromDropDown(day, "10", driver);
		selectValueFromDropDown(month, "May", driver);
		selectValueFromDropDown(year, "2009", driver);

//		getAllOptions(day);
//		getAllOptions(month);
//		getAllOptions(year);
		
		//selectValueFromDropDownWithOptions(year, "1995");
		
	}
	
	public static void selectValueFromDropDown(WebElement element, String value, WebDriver driver){
		JavaScriptUtil.flash(element, driver);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void selectValueFromDropDown(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void getAllOptions(WebElement element){
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++){
			String value = options.get(i).getText();
			System.out.println(value);
		}
	}
	
	/**
	 * This method will select the value programmatically without any default method of selection
	 * @param element
	 * @param selectValue
	 */
	public static void selectValueFromDropDownWithOptions(WebElement element, String selectValue){
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++){
			String value = options.get(i).getText();
			System.out.println(value);
			
			if(value.equals(selectValue)){
				options.get(i).click();
				break;
			}
		}

	}
	
	
	
}
