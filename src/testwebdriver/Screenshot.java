package testwebdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("E:\\screenshot1.png"));
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		File scrFile1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("E:\\screenshot2.png"));
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(".//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("chapa");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		File scrFile2=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("E:\\screenshot3.png"));
		driver.close();
		
		

	}

}
