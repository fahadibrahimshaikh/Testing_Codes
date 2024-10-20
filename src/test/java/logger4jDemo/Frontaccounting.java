package logger4jDemo;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frontaccounting {

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger();
		try {
//			WebDriver w = new ChromeDriver();
			WebDriver w = new FirefoxDriver();
			String user = "demouser";
			String pass = "password";
			log.info("Browser has been launch");
			w.get("https://demo.frontaccounting.eu/index.php");
			log.info("local browser has been redircted to frontaccounting site.");
			w.findElement(By.name("user_name_entry_field")).clear();
			log.info("Username field data has been clear.");
			w.findElement(By.name("user_name_entry_field")).sendKeys(user);
			log.info(user+" value has been added in username field.");
			w.findElement(By.name("password")).clear();
			log.info("password field data has been clear.");
			w.findElement(By.name("password")).sendKeys(pass);
			log.info(pass+" value has been added in the password Field.");
			w.findElement(By.name("SubmitUser")).click();
			log.info("user click on login button");
			w.findElement(By.linkText("Logout")).click();
			log.info("log out button has been click");
		} catch (Exception e) {
			log.error("user unable to login");
		}
	}

}
