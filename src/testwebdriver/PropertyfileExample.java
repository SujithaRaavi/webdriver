package testwebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyfileExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		Properties obj =new Properties();
		obj.load(new FileInputStream("D:\\Samples\\workspace\\webdriver\\src\\testwebdriver\\Testfile.properties"));
		//String url = obj.getProperty("URL");
		String Uname =obj.getProperty("username");
		String pwd = obj.getProperty("password");
		String login =obj.getProperty("login");
		String firefox =obj.getProperty("firefox");
		String firefoxpath = obj.getProperty("firefoxpath");
		
		System.setProperty(firefox,firefoxpath);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(obj.getProperty("URL"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'t-i')]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[contains(@id,'t-i')]")).sendKeys("sel");
		driver.findElement(By.xpath("//*[starts-with(@id,'lst')]")).sendKeys("selenium1");
		
		driver.findElement(By.name("txtUserName")).sendKeys(Uname);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.xpath(login)).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();

	}

}
