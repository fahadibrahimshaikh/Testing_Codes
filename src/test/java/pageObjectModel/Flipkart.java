package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	static WebDriver w;
	public static void main(String[] args) throws Exception {
		for(int i = 1;i<=2;i++) {
			w = new ChromeDriver();
			RepoFlipkart f = new RepoFlipkart(w);
			w.manage().window().maximize();
			w.get("https://www.flipkart.com/");
			f.search("mobile");
			if (i==1) {
				f.productselection1();
			} else if (i==2) {
				f.productselection2();
			}
			f.buynow();
		}
		
	}

}
