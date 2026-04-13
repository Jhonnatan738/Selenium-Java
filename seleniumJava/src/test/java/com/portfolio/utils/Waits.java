package com.portfolio.utils;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	private static int timeOutSeconds = 60;
	
	public static WebElement waitAndGetElement(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(timeOutSeconds));
        return wait
            .pollingEvery(Duration.ofMillis(500)) 
            .ignoreAll(Arrays.asList(
                NoSuchElementException.class, 
                StaleElementReferenceException.class, 
                ElementClickInterceptedException.class,
                ElementNotInteractableException.class
            ))
            .until(ExpectedConditions.elementToBeClickable(locator));
    }
	
	public static List<WebElement> waitAndGetListOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(timeOutSeconds));
        return wait
            .pollingEvery(Duration.ofMillis(500)) 
            .ignoreAll(Arrays.asList(
                NoSuchElementException.class, 
                StaleElementReferenceException.class, 
                ElementClickInterceptedException.class,
                ElementNotInteractableException.class
            ))
            .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
	
}
