package testwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor) driver;		
		
		//Launching the Site.		
        driver.get("http://apps.qaplanet.in/qahrm/login.php");			
        		
        WebElement button =driver.findElement(By.name("Submit"));			
        		
        //Login to apps.qaplanet.in/qahrm	
        driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");				
        driver.findElement(By.name("txtPassword")).sendKeys("user1");				
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
        
            
        //define a webelement for logout link.
        WebElement logout=driver.findElement(By.linkText("Logout"));
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        try{
        	js.executeScript("alert('Welcome to QAHRM');");
        }catch(WebDriverException e){
        	System.out.println("Webdriver Exception raised");
        }
        Thread.sleep(3000);
        Alert al=driver.switchTo().alert();
        al.accept();
        logout.click();
        driver.close();
	}

}
