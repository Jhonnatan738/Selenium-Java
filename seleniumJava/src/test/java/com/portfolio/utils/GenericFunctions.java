package com.portfolio.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GenericFunctions {

	public void assertVerification(String textReceived, String textInput) {
		boolean foundText;
		if (textReceived.contains(textInput)) {
			foundText = true;
		} else {
			foundText = false;
		}
		Assert.assertTrue(foundText);
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

	public void sendKeysElements(By element, String value) {
		WebElement elementNeeded = Waits.waitAndGetElement(element);
		elementNeeded.clear();
		elementNeeded.sendKeys(value);
	}

	public void verifySentData(By element, String value, WebDriver driver) {
		WebElement elementNeeded = Waits.waitAndGetElement(element);
		Assert.assertTrue(getInputValue(elementNeeded, driver).trim().equalsIgnoreCase(value));
	}

	public String getInputValue(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (String) js.executeScript("return arguments[0].value;", element);
	}

	public void assertValityWithJSExecutor(WebDriver driver, WebElement component) {
		Assert.assertFalse((Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].checkValidity();",
				component));
	}
	
	public void confirmValityInput(WebDriver driver, WebElement component) {
		Assert.assertTrue((Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].checkValidity();",
				component));
	}
}
