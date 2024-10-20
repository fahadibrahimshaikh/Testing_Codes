package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoFrontAccounting {
	
WebDriver w;
		public RepoFrontAccounting (WebDriver wd) {
			w = wd;
		}

By username = By.name("user_name_entry_field");
By password = By.name("password");
By loginbtn = By.name("SubmitUser");
By logoutbtn = By.linkText("Logout");


	public void OpenUrl() {
		w.get("https://demo.frontaccounting.eu/index.php");
	}
	public void login(String usern , String passw) {
		w.findElement(username).clear();
		w.findElement(username).sendKeys(usern);
		w.findElement(password).clear();
		w.findElement(password).sendKeys(passw);
		w.findElement(loginbtn).click();
	}
	public void logout () {
		w.findElement(logoutbtn).click();
	}
	
}
