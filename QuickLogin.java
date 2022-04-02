package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickLogin {
	public static void main(String[] args) {

		// One Inspect Login
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	
		
		
		}
		
	}
