package com.portfolio.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GenericFunctions {
	
	public void assertVerification(String textReceived, String textInput) {
		Assert.assertEquals(textReceived, textInput);
	}
	
	public void clickOnElement(By element) {
		WebElement elementNeeded = Waits.waitAndGetElement(element);
		elementNeeded.click();
	}
	
	public void waitForElement(By element) {
		WebElement elementNeeded = Waits.waitAndGetElement(element);
		Assert.assertTrue(elementNeeded.isDisplayed());
	}
	
	public WebElement getWebElementBy(By element) {
		return Waits.waitAndGetElement(element);
	}

}
