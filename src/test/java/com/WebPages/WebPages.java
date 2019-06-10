package com.WebPages;


import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.TestExecution.Baseclass;
import com.WebCommonMethods.InitialClass;



public class WebPages extends  Baseclass{
	
	public WebDriver driver;
	InitialClass ic = new InitialClass();


	@FindBy(xpath="//input[@id='txtUsername']")WebElement objusername;
	@FindBy(xpath="//input[@id='txtPassword']")WebElement objpassword;
	@FindBy(xpath="//input[@id='btnLogin']")WebElement objloginbutton;
	@FindBy(xpath=".//*[@href='/hrm/symfony/web/index.php/leave/viewLeaveModule']")WebElement objLeaveoption;
	@FindBy(xpath="//a[@id='menu_leave_applyLeave']")WebElement applyoption;
	@FindBy(xpath = "//select[@id = 'applyleave_txtLeaveType']")WebElement objleavetypedropdown;
	@FindBy(xpath = ".//*[@id='applyleave_txtFromDate']")WebElement objfromfield; 
	@FindBy(xpath =".//*[@id='ui-datepicker-div']/table/tbody")WebElement objdates;
	
	
	public void hrmlogin (WebDriver driver) {
		this.driver = driver;
		String username = excel.getstringcelldata("Credentials", 1, 1);
		String password = excel.getstringcelldata("Credentials", 1, 2);
		objusername.sendKeys(username);
		objpassword.sendKeys(password);
		//username.sendKeys("user03");
		//password.sendKeys("pass1234");
		objloginbutton.click();
		String title = driver.getTitle();
		System.out.println(title);
		try {
			Assert.assertEquals("OrangeHRM", title);
			System.out.println("Expected and actual result result is matched");
		} catch (Exception e) {
			System.out.println("Expected and actual result is not matched");
		}
		//return true;
		

		
	}
	
	public void Applyleave(WebDriver driver) {
		this.driver = driver;
		ic.hoveractionclass(objLeaveoption, driver);
		applyoption.click();
		Select leaveoption = new Select(objleavetypedropdown);
		leaveoption.selectByVisibleText("Annual Leave");
		objfromfield.click();
		List<WebElement> dates = objdates.findElements(By.tagName("td"));
		System.out.println(dates);
		}
	


}
