import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateDropDown {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		String arr[] = { "Select", "Option1", "Option2", "Option3" };
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropDown);
		List<WebElement> options=  s.getOptions();
		boolean match  = false;
		for (int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText()+" == "+ arr[i]);
			if(options.get(i).getText().equals(arr[i])) {
				
				match = true;
			}
			
			Assert.assertTrue(match);
		}
		
	}
}
