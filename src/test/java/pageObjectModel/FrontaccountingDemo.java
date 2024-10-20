package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrontaccountingDemo {

	public static void main(String[] args) {

		WebDriver w = new FirefoxDriver();
		FrontAccountingwithPagefactory fa = new FrontAccountingwithPagefactory(w);
		fa.OpenUrl();
		fa.login("demouser", "password");
		fa.logout();
	}
}
