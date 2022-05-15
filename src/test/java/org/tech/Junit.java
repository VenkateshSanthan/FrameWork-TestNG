package org.tech;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	static WebDriver driver;
	
	@Before
	public void OpenDate() {
		Date d = new Date();
		System.out.println("Start Date---" +d);
	}
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void BrowesrOpen() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkat\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void UrlLaunch() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("venkatsg025@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("1425790");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	
	}
	@After
	public void CloseDate() {
		Date d1 = new Date();
		System.out.println("End Date----"+d1);
	}
	@SuppressWarnings("deprecation")
	@AfterClass
	public static void BrowserClose() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		driver.quit();
		
	}
	
	
	
}
