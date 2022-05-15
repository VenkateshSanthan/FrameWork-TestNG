package org.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceBook_1 {

	
	public static WebDriver driver;
	
@Test	
	private void urlTest() {
		BaseClass b = new BaseClass();
		WebDriver driver = b.launchChrome();
		b.urlLaunch(driver, "https://www.facebook.com/");
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("9965675526");
		Assert.assertEquals(userName.getAttribute("value"), "9965675526", "Verify UserName");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("142475poli");
		Assert.assertEquals(pass.getAttribute("value"), "142475polie", "Verify Password");
		b.clickBtn(driver.findElement(By.name("login")));
		
	}
	
}
