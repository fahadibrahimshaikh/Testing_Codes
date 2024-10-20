package dataDrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.index.qual.SearchIndexBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Fahad Shaikh\\OneDrive\\Documents\\googlesearch.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for (int i = 1; i<=sheet.getLastRowNum();i++){
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell Search = row.getCell(0);
			
			w.get("https://www.google.com/");
			w.findElement(By.id("APjFqb")).sendKeys(Search.toString(),Keys.ENTER);
			Thread.sleep(2000);

		}
		
	}

}
