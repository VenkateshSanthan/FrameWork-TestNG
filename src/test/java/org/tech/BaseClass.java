package org.tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
			public WebDriver launchChrome() {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				return driver;	
			}
			public WebDriver launchFirefox() {
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				return driver;
			}
			public void urlLaunch(WebDriver driver,String url) {
				driver.get(url);
				driver.manage().window().maximize();
			}
			public void fill(WebElement element,String data) {
				element.sendKeys(data);
			}
			public void clickBtn(WebElement element) {
				element.click();
			}
			public void browserClose(WebDriver driver) {
				driver.quit();
			}
			
			
			
}

