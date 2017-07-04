package testwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicitwait
		/*driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Open application
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.close();*/
		
		//Explicitwait
		WebDriverWait mywait = new WebDriverWait(driver,10);
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtUserName")));
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		mywait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		
		driver.close();
		
		}

}
