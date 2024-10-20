package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingwithPagefactory {
	WebDriver w;
	public FrontAccountingwithPagefactory(WebDriver wd) {
		w = wd;
		PageFactory.initElements(w, this);

	}

	@FindBy(name  = "user_name_entry_field") WebElement username;
	@FindBy(name =  "password") WebElement password;
	@FindBy(name = "SubmitUser") WebElement loginbtn;
	@FindBy(linkText = "Logout") WebElement logoutbtn;
	
	public void OpenUrl() {
		w.get("https://demo.frontaccounting.eu/index.php");
	}
	
	public void login(String usern , String passw) {
		username.clear();
		username.sendKeys(usern);
		password.clear();
		password.sendKeys(passw);
		loginbtn.click();
	}
	public void logout () {
		logoutbtn.click();
	}
}
