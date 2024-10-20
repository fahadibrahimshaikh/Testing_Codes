package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver w;

	public static void main(String[] args) throws Exception {

			for(int i = 1;i<=2;i++) {
				w = new ChromeDriver();
				RepoAmazon f = new RepoAmazon(w);
				w.get("https://www.amazon.in/");
				f.search("Watch");
				if (i==1) {
					f.productselection1();
				} else if (i==2) {
					f.productselection2();
				}
				f.buynow();
			}
			
		}


	}


