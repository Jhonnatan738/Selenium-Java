package com.portafolio.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {


	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static void initDriver() {
	        ChromeOptions options = new ChromeOptions();

	        options.addArguments("--headless=new");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");

	        driver.set(new ChromeDriver(options));
	        driver.get().get("https://demoqa.com");
	    }

	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void quitDriver() {
	        driver.get().quit();
	        driver.remove();
	    }
	}

