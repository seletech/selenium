package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
	public static void main(String[] args) throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile= ts.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("ss.png");
		FileUtils.copyFile(srcFile, dstFile);
	}
}
