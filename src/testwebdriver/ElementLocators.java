package testwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Bharat/Desktop/checkbox.html");
		
		/*//get the id of the search box and enter some text into it...
		driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
		
		//click on the search button using its name attribute...
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(10);
		//alternatively we can use the class attribute...
		//driver.findElement(By.className("sbico-c")).click();
		*/
		//click on the gmail link to open the gmail...
		//driver.findElement(By.id("gb_70")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		
		//get the text of the 2nd row 2nd col element...using absolute xpath...
		//String text= driver.findElement(By.xpath("//html/body/table/tbody/tr[2]/td[3]")).getText();
		//alternatively we can use the relative xpath..
		String text1 =driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
		//using the @ symbol to identify the unique attribute...
		///driver.findElement(By.id("//table[@id='Table1']/tbody/tr[2]/td[3]")).getText();
		
		//System.out.println(text);
		System.out.println(text1);
		
	}

}
