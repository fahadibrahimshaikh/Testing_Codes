package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FlipkartPriceValidation {
	
	@Test
	public void price () {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahad Shaikh\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		WebDriver w = new ChromeDriver();
		WebDriver w = new FirefoxDriver ();
		w.get("https://www.flipkart.com/");
		w.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
		
		String actprice = w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[2]/div[1]/div[1]/div")).getText();
		String expPrice = "₹60,500";
		
		Assert.assertEquals(actprice, expPrice);
		
		
	}
	

}
