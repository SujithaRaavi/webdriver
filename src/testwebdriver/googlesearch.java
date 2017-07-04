package testwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class googlesearch {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		
		/*System.setProperty("webdriver.ie.driver","C:\\Browsers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in");*/
		
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//System.out.println(driver.getTitle());
		String exptitle = "Google";
		String acttitle =driver.getTitle();
		if (acttitle.equals(exptitle)){
			System.out.println("Title is correct and testcase is pass");
			
		}else{
			System.out.println("Invalid Title and testcase is failed");
		}
		
		}

}
