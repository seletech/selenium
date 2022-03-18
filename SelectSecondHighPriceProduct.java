package selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSecondHighPriceProduct {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement serchBox = driver.findElement(By.id("twotabsearchtextbox"));
		serchBox.sendKeys("Mobile Phones");
		
		WebElement serchButton = driver.findElement(By.id("nav-search-submit-button"));
		serchButton.click();
		List<WebElement> prices = driver.findElements(By.cssSelector("[class='a-price-whole']"));
		
			Map<WebElement,Integer> map = new HashMap<WebElement, Integer>();
			for(int i=0;i<prices.size();i++){
				if(prices.get(i).getText() !="") {
					map.put(prices.get(i),Integer.parseInt(prices.get(i).getText().replaceAll("[^0-9]", "")));
					
				}
				
			}
			for(Entry m :map.entrySet()) {
				System.out.println(m.getKey()+ " "+m.getValue());
			}
		List<Entry<WebElement,Integer>> es = new ArrayList<Map.Entry<WebElement,Integer>>(map.entrySet());
		
		es.sort(Entry.comparingByValue());
		
		for(Entry m :es) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		es.get(es.size()-2).getKey().click();
	}

}
