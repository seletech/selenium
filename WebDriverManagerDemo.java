
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static void main(String[] args) {
		
    
    	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
    WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
    
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
    
    WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver(); */
    
	}

}
