package com.takingdatafromDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) throws Exception 
	{
//		WebDriver w = new ChromeDriver();
		WebDriver w = new FirefoxDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYS","Meralaptop@97");
		ResultSet rs = con.createStatement().executeQuery("select * from GoogleSearch");
		
		while (rs.next()) {
			String search = rs.getString("Search");
			System.out.println(search);
//			w.get("https://www.google.com/");
//			w.findElement(By.id("APjFqb")).sendKeys(search,Keys.ENTER);
//			Thread.sleep(2000);
			
		}
	}

}
