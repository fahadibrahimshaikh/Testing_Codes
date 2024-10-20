package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG {

	public class Demo{
		@Test 		
		public void google() {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahad Shaikh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver w = new EdgeDriver();
			w.get("https://www.google.com/");
			w.findElement(By.id("APjFqb")).sendKeys("S24",Keys.ENTER);
		}
		@Test
		public void facebook () throws Exception {
			WebDriver w = new FirefoxDriver();
			w.get("https://www.facebook.com/");
			w.findElement(By.id("email")).sendKeys("xyz@gmail.com");
			TakesScreenshot tss = (TakesScreenshot) w;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File ("C:\\Users\\Fahad Shaikh\\eclipse-workspace\\AdvAutomation\\src\\test\\resources/src1.png"));
			
		}
	}
}
