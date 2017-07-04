package testwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//clear method
		/*System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement ele = driver.findElement(By.name("txtUserName"));
		ele.sendKeys("aadsad");
		Thread.sleep(3000);
		ele.clear();
		ele.sendKeys("qaplanet1");
		String url = driver.getCurrentUrl();
		System.out.println(url);*/
		
		//isSelected method
		/*System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Bharat/Desktop/checkbox.html");
		WebElement chkbox =driver.findElement(By.name("vehicle1"));
		
		for(int i=1;i<3;i++){
			chkbox.click();
			System.out.println(chkbox.isSelected());
			Thread.sleep(3000);
			
		}
			
		driver.close();*/
		
		///DROPDOWN METHOD
		/*System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		Thread.sleep(3000);
		Select drpcountry = new Select(driver.findElement(By.xpath("//select[@size='1']")));
		Thread.sleep(3000);
		drpcountry.selectByVisibleText("ANTARCTICA");
		//drpCountry.selectByIndex(6);
		Thread.sleep(3000);
		//drpCountry.deselectByVisibleText("ANTARCTICA");
		drpcountry.selectByVisibleText("ANGOLA");
		Thread.sleep(3000);
		//driver.navigate().refresh();
		driver.close();*/
		
		//combobox selection and deselection
		/*System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://output.jsbiverin.com/osebed/2");
		Select sel = new Select(driver.findElement(By.id("//*[@id='fruits']")));
		sel.selectByVisibleText("Banana");
		sel.selectByVisibleText("Apple");
		Thread.sleep(3000);
		sel.deselectByVisibleText("Banana");
		Thread.sleep(3000);
		String text = sel.getFirstSelectedOption().getText();
		System.out.println("First selectd option is" + text);
		
		driver.close();*/
		
		//Navigae commands
		/*System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(3000);
		driver.navigate().refresh();*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("mahesh");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.tagName("input[value='oneway']")).click();
		
		
	}
}
