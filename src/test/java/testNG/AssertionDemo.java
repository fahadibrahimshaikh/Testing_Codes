package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionDemo {

	WebDriver w;
	
	public void Flipkart() {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
	}
	
	

}
