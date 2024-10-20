package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SauceDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		RepoOfSauceDemoUsingPageFactory sd = new RepoOfSauceDemoUsingPageFactory(w);
		sd.openUrl();
		sd.login("standard_user","secret_sauce");
		sd.logout();

	}

}
