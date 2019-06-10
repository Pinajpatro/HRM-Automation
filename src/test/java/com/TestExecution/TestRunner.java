package com.TestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.WebCommonMethods.InitialClass;
import com.WebPages.WebPages;


public class TestRunner extends Baseclass{
	public WebDriver driver;
    InitialClass ic = new InitialClass();
    WebPages wb;
	
	@Test(priority = 0)
	public void StartExecution() {
		driver = ic.getBrowser(driver,"Chrome");
		screen.getscreenshots(driver,"Screenshot after launching URL_");
	    wb = PageFactory.initElements(driver, WebPages.class);
        wb.hrmlogin(driver);
        screen.getscreenshots(driver, "after succesful login__");
        
	}
	
	@Test(priority = 1)
	public void ApplyLeave() {
       wb.Applyleave(driver);
		
	}
        
     
    
        	
        	
        	
        	
        }


