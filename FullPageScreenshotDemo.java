package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenshotDemo {
	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//casting
		HasFullPageScreenshot fps = (HasFullPageScreenshot) driver;
		
		File src = fps.getFullPageScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("fps.png"));
	}
}
