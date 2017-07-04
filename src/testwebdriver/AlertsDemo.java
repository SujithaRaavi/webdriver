package testwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//clicking the submit button with out entering the username and pwd
		driver.findElement(By.name("Submit")).click();
		//switching to alert
		Alert alert = driver.switchTo().alert();
		//capturing alert message
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		//accepting alert
		alert.accept();
		

	}

}
