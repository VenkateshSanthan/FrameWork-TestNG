package org.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	public static WebDriver driver;

	private void demoQa() {
		
		driver = new ChromeDriver();
		
		driver.get("https://reqres.in//api/users?page=2");
		
		
	}
}
