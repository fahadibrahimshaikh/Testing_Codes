package logger4jDemo;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger();
		try {
//			WebDriver w = new ChromeDriver();
			WebDriver w = new FirefoxDriver();
			String user = "Admin";
			String pass = "admin123";
			log.info("Browser has been launch");
			w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			log.info("local browser has been redircted to OragneHRM site.");
			
		    w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(user);
			log.info(user+" value has been added in username field.");
			
			w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pass);
			log.info(pass+" value has been added in the password Field.");
			
			w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			log.info("user click on login button");
		    w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			w.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		    w.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

			w.findElement(By.linkText("Logout")).click();
			
			log.info("log out button has been click");
		} catch (Exception e) {
			log.error("user unable to login");
		}
	}

}
	


