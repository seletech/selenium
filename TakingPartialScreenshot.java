import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingPartialScreenshot {

	public static void main(String[] args) throws IOException{

		// Taking partial screenshot of web page using Selenium Webdriver

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement element = driver.findElement(By.xpath("//h2[text()='Beauty picks']/parent::div/parent::div"));
		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("ss.png"));
		
	}

}
