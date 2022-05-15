package org.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo {

	public static WebDriver driver;

@Test
	private void demoQa() {
		BaseClass b = new BaseClass();
		WebDriver driver = b.launchChrome();
		b.urlLaunch(driver, "https://demoqa.com/automation-practice-form");
		b.fill(driver.findElement(By.id("firstName")),"Venkatesh");
		b.fill(driver.findElement(By.id("lastName")),"Santhanam");
		b.fill(driver.findElement(By.id("userEmail")), "venkatesg025@gmail.com");
		
		
		
		
		
	}
}
