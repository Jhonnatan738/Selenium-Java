package com.portfolio.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static byte[] takeScreenshot(WebDriver driver) {
	    try {
	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}

}
