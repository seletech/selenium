package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("pass"));
		driver.findElement(emailLocator).sendKeys("test@fb.com");
		
		By passLocator = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
		driver.findElement(passLocator).sendKeys("password");
		
		
		By lastname = RelativeLocator.with(By.tagName("input")).toLeftOf(By.cssSelector("[name='lastname']"));
		driver.findElement(lastname).sendKeys("fname");
		
		By firstname = RelativeLocator.with(By.tagName("input")).toRightOf(By.cssSelector("[name='firstname']"));
		driver.findElement(firstname).sendKeys("lname");
	}

}
