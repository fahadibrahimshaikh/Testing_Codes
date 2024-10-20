package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossBrowsingTesting {
		@Test
		public void OpenBrowser() {
			
			
			DesiredCapabilities	dc = new DesiredCapabilities ();
				dc.setPlatform(Platform.WINDOWS);
				dc.setBrowserName("firefox");
		RemoteWebDriver		w = new RemoteWebDriver(dc);
		
		w.get("https://www.flipkart.com/");
		w.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
			}
		
		

	}


