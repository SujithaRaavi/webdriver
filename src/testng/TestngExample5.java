package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngExample5 {
	
	public String baseURL="http://newtours.demoaut.com";
	public WebDriver driver;
	public String expected=null;
	public String actual=null;
	
	@BeforeTest
	
	public void launchbrowser(){
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseURL);
	}
		
	@BeforeMethod
	
	public void verifyhomepageTitle(){
		
		expected="Welcome: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority=0)
	public void register(){
		
		driver.findElement(By.linkText("REGISTER")).click();
		expected ="Register: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		Reporter.log("The page title confirmed for the Register link"+" "+ actual+" " + expected);
	}
	
	@Test(priority=1)
	
	public void support(){
		driver.findElement(By.linkText("SUPPORT")).click();
		expected="Under Construction: Mercury Tours";
		actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		Reporter.log("The page title confirmed for the Support link");
	}
	
	@AfterMethod
	
	public void gobacktohomepage(){
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest

	public void terminatebrowser(){
		driver.quit();
	}

}
