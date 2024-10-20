package pageObjectModel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoFlipkart { //Without page factory

	WebDriver w;
	RepoFlipkart(WebDriver wd) { // Constructor
		w = wd;		
	}
	// Homepage search
	By searchelement = By.name("q");
	By product2 = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]");
	By product1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]");
	
	//buy
	By buynowbtn = By.cssSelector("button[class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"]");
	
	public void search(String search) throws Exception{
	w.findElement(searchelement).sendKeys(search);
	Thread.sleep(2000);
	w.findElement(searchelement).submit();
	}
	public void productselection1() throws Exception{
	Thread.sleep(2000);
	w.findElement(product1).click();
	}
	public void productselection2() throws Exception{
		Thread.sleep(2000);
		w.findElement(product2).click();
		}
	
		public void buynow() throws Exception{
			Thread.sleep(2000);
			String parent = w.getWindowHandle();
			Set<String> child = w.getWindowHandles();
			 for (String ch :child) {
				 if (!ch.equals(parent)) {
					 w.switchTo().window(ch);
						Thread.sleep(2000);
						w.findElement(buynowbtn).click();
						Thread.sleep(3000);
						w.close();
				 }
			 }
		}
	
	
	
}
