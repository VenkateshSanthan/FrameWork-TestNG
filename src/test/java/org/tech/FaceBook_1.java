package org.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceBook_1 {

	
	public static WebDriver driver;
	private WebElement findElement;
	
@Test	
	private void urlTest() {
		
		BaseClass b = new BaseClass();
		b.launchChrome();
		b.urlLaunch(driver, "https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.id("email"));
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style,background:red')", element);
		
	
	
	
	}
	
}
