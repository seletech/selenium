package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleWindowHandling {
	public static void main(String[] args) {

		// How to handle multiple windows/Tabs using Selenium
		// Difference b/w getWindowHandle() and getWindowHandles() methods
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		String id = driver.getWindowHandle();
		System.out.println(id);
		driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows=  driver.getWindowHandles();
		
		for(String w :windows) {
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
		}
		
	}
}
