package dataDrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DataDrivenExample {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Fahad Shaikh\\OneDrive\\Documents\\Usernameandpassword.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		for (int i = 1;i<=sh.getLastRowNum();i++) {
		XSSFRow row = sh.getRow(i);
		XSSFCell Username = row.getCell(0);
		XSSFCell Password = row.getCell(1);
		
		w.get("https://demo.frontaccounting.eu/index.php");
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("password")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys(Username.toString());
		w.findElement(By.name("password")).sendKeys(Password.toString());
		w.findElement(By.name("SubmitUser")).click();
		
		
		try {
			
			w.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			w.navigate().back();
			TakesScreenshot tss = (TakesScreenshot) w;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Fahad Shaikh\\OneDrive\\Pictures\\"+Username.toString()+".png"));
		}
		}
		
	}

}
