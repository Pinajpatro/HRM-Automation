package com.ReusabilityMethods;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotsonwebpages {
	public static String getscreenshots(WebDriver driver,String name) {
		TakesScreenshot tc = (TakesScreenshot)driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		String screenpath = "C:\\Users\\Pinaj\\Eclipse Project\\HRMAutomation\\Screenshot\\"+name+getsystemdate()+".png";
		try {
			FileHandler.copy(source, new File(screenpath));
		} catch (IOException e) {
			System.out.println("screenshot is not taken"+e.getMessage());
		}
		return screenpath;
		
	}
	
	public static String getsystemdate() {
		DateFormat systemdatetime = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		return systemdatetime.format(date);
		
	}

}
