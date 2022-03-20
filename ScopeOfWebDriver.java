package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeOfWebDriver {
	public static void main(String[] args) {

		// Limiting Web driver scope
		// Counting number of links on any web page

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		int totalLinksCount = driver.findElements(By.tagName("a")).size();

		System.out.println("Total links:" + totalLinksCount);

		WebElement footer = driver.findElement(By.tagName("footer"));

		int footerLinksCount = footer.findElements(By.tagName("a")).size();


		System.out.println("Footer links:" + footerLinksCount);
		

	}
}
