package testwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEforDesiredCapabilities {
	

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"IE");
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.get("www.cacert.org");
		
		String pageTitle=driver.getTitle();
		
		if(pageTitle.equals("Welcome to CAcert.org")){
				
				System.out.println("Welcome to Cacert.org");
			}else
			{
				System.out.println("Site blocked by SSL CERTIFICATE");
			}
		
	}

}
