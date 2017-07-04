package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestngExample3 {
	WebDriver driver;
			
	@BeforeTest
	
	public void openqaplanetapplication(){
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		String expTitle ="OrangeHRM - New Level of HR Management";
		String actTitle =driver.getTitle();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("Application title is matching and so url opened corrrectly");
				
	}
	
	@Test
	
	public void logintoqaplanet() throws InterruptedException{
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		if(driver.getTitle().equals("OrangeHRM")){
			Reporter.log("Title matched,application is logged in correctly");	
		}else 
		{
			Reporter.log("Login Failed");
		}
		
	}
	
	@AfterMethod
	public void logout(){
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
	}
	
	@AfterTest
		public void closeBrowser(){
		System.out.println("Closing the browser");
		driver.close();
	}
}
