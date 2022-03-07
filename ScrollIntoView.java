package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("const fb = document.getElementById('iconContext-facebook');fb.scrollIntoView(true);");
		
		

	}

}
