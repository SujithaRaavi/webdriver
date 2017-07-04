package testwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitTestEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title is: " + driver.getTitle());
		WebElement sbox = driver.findElement(By.name("q"));
		sbox.sendKeys("Selenium");
		sbox.submit();
		System.out.println("Page Title is: " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		

	}

}
