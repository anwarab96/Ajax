package com.handlingajaxelements;

import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ajax2 {
	WebDriver driver;
	String baseUrl="http://www.kayak.com/";
	int vSleep;
	@BeforeMethod
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		vSleep=1000;
	}
	@Test
	public void test() throws Exception
	{
		driver.get(baseUrl);
		driver.findElement(By.id("wherebox")).clear();
		Thread.sleep(vSleep);
		driver.findElement(By.id("wherebox")).sendKeys("Los A");
		Thread.sleep(vSleep);
		/*driver.findElement(By.id("wherebox")).sendKeys(" ");
		Thread.sleep(vSleep);
		driver.findElement(By.id("wherebox")).sendKeys("A");
		Thread.sleep(vSleep);*/
		driver.findElement(By.id("wherebox")).sendKeys(Keys.TAB);
		Thread.sleep(vSleep);
		/*driver.findElement(By.id("wherebox")).sendKeys(Keys.ENTER);
		Thread.sleep(vSleep);*/
		//driver.findElement(By.id("wherebox")).getAttribute("value");
		
		System.out.println(driver.findElement(By.id("wherebox")).getAttribute("value"));
		Thread.sleep(vSleep);
	}
	@AfterTest
	public void tearDown() throws Exception{
		driver.quit();
		
	}
}
/*String verificationErrorString = verificationErrors.toString();
if (!"".equals(verificationErrorString)) {
  fail(verificationErrorString);
}
}

private boolean isElementPresent(By by) {
try {
  driver.findElement(by);
  return true;
} catch (NoSuchElementException e) {
  return false;
}
}

private boolean isAlertPresent() {
try {
  driver.switchTo().alert();
  return true;
} catch (NoAlertPresentException e) {
  return false;
}
}

private String closeAlertAndGetItsText() {
try {
  Alert alert = driver.switchTo().alert();
  String alertText = alert.getText();
  if (acceptNextAlert) {
    alert.accept();
  } else {
    alert.dismiss();
  }
  return alertText;
} finally {
  acceptNextAlert = true;
}
}
}

*/
	

