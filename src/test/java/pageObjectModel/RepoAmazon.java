package pageObjectModel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoAmazon {
	 //Without page factory

		WebDriver w;
		RepoAmazon(WebDriver wd) { // Constructor
			w = wd;		
		}
		
		// Homepage search
		By searchelement = By.id("twotabsearchtextbox");
		By product2 = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/div/span/a/div/img");
		By product1 = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[1]/div/span/a/div/img");
		
		//buy
		By buynowbtn = By.name("submit.buy-now");
		
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
