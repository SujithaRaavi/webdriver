package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngExample4 {
	
	public String baseurl ="http://newtours.demoaut.com";
	public WebDriver driver;
	String expTitle=null;
	String actTitle=null;
	
	@BeforeMethod
	public void opennewtouapp(){
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseurl);
		Reporter.log("Opening the appplication");
		
	}
	
	@Test
	public void verifyhomepagetitle(){
		
		expTitle ="Welcome: Mercury Tours";
		actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log("Pagetitle verified");
	}
	
	@AfterMethod
	public void closebrowser(){
		driver.close();
	}

}
