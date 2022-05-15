package org.tech;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class HotelTestNG  {

	public static WebDriver driver;

@SuppressWarnings("deprecation")
@Parameters({"browserName","userName","passWord","firstName","lastName","add","ccno","cvvno"})
@Test
		private void urlTest(String bName,String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws InterruptedException {
		if (bName.equalsIgnoreCase("ChromeBrowser"))
		{	
		BaseClass b = new BaseClass();
		WebDriver driver = b.launchChrome();
		b.urlLaunch(driver,"https://adactinhotelapp.com/");
		b.fill(driver.findElement(By.name("username")), s1);
		b.fill(driver.findElement(By.name("password")), s2);
		b.clickBtn(driver.findElement(By.name("login")));
		Select s = new Select(driver.findElement(By.name("location")));
		s.selectByValue("Melbourne");
		Select sl = new Select(driver.findElement(By.name("hotels")));
		sl.selectByValue("Hotel Sunshine");
		Select sl1 = new Select(driver.findElement(By.name("room_type")));
		sl1.selectByVisibleText("Double");
		Select sl2 = new Select(driver.findElement(By.name("adult_room")));
		sl2.selectByValue("2");
		b.clickBtn(driver.findElement(By.name("Submit")));
		b.clickBtn(driver.findElement(By.name("radiobutton_0")));
		b.clickBtn(driver.findElement(By.name("continue")));
		b.fill(driver.findElement(By.name("first_name")),s3);
		b.fill(driver.findElement(By.name("last_name")), s4);
		b.fill(driver.findElement(By.name("address")), s5);
		Select sl3 = new Select(driver.findElement(By.name("cc_type")));
		sl3.selectByValue("VISA");
		b.fill(driver.findElement(By.name("cc_num")), s6);
		Select sl4 = new Select(driver.findElement(By.name("cc_exp_month")));
		sl4.selectByValue("8");
		Select sl5 = new Select(driver.findElement(By.name("cc_exp_year")));
		sl5.selectByValue("2018");
		b.fill(driver.findElement(By.name("cc_cvv")), s7);
		b.clickBtn(driver.findElement(By.name("book_now")));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		WebElement ordNo = driver.findElement(By.xpath("//*[@id=\"order_no\"]"));
		String ordPrnt = ordNo.getAttribute("value");
		System.out.println(ordPrnt);
		}	
		
	
}
}
	

