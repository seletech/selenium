package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BoostrapDropdown {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();	
		driver.get("https://www.imdb.com/");
	}
	
	@Test
	public void testCase() {
		
		driver.findElement(By.id("iconContext-arrow-drop-down")).click();
		List<WebElement> options = driver.findElements(By.cssSelector("#navbar-search-category-select-contents>ul>li>span"));
		
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
		
	}

}
