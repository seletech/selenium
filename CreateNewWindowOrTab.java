package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewWindowOrTab {
	private WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
	}
	
	@Test
	public void testcase()
	{
	driver.get("https://seletech.in/practice/");
	String url=	driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[5]")).getText();
	
	//driver.switchTo().newWindow(WindowType.WINDOW);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to(url);
		
	}

}
