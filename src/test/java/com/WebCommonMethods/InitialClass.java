package com.WebCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.TestExecution.Baseclass;

public class InitialClass extends Baseclass {
	public static WebDriver driver;

	
	public static WebDriver getBrowser( WebDriver driver,String Browser) {
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pinaj\\Eclipse Project\\HRMAutomation\\Drivers\\chromedriver.exe" );
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			String URL = excel.getstringcelldata("Credentials", 1,0);
			driver.get(URL);
			System.out.println("Firefox broswer opened successfully");
		}
		else if(Browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pinaj\\Eclipse Project\\OpsVedaAutomation\\BrowserDriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
			System.out.println("Firefox broswer opened successfully");
			
		}
		else if(Browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Pinaj\\Eclipse Project\\OpsVedaAutomation\\BrowserDriver\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
			System.out.println("IE broswer opened successfully");
		}
		return driver;
	}
	
	public static void hoveractionclass(WebElement element,WebDriver driver1) {
		Actions hoveron = new Actions(driver1);
		Action mousehoveronLeave = hoveron.moveToElement(element).build();
		mousehoveronLeave.perform();
	//	hoveron.click();

}
	public static void hoverclickactionclass(WebElement element,WebDriver driver1) {
		Actions actions = new Actions(driver1);
		Action hoverclick  =actions.moveToElement(element).click().build();
		//hoverclick.perform();
	}
}
