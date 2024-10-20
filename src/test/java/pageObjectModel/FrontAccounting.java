package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrontAccounting {

	public static void main(String[] args) {
		WebDriver w = new FirefoxDriver();
		RepoFrontAccounting fa = new RepoFrontAccounting(w);
		fa.OpenUrl();
		fa.login("demouser", "password");
		fa.logout();
	}

}
