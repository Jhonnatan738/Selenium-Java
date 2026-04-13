package com.portfolio.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static WebDriver driver;
	private static String AccessUrl = "https://demoqa.com";

	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--start-maximized");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");

		driver = new ChromeDriver(options);
		driver.get(getAccessUrl());
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			initDriver();
		}
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
	}

	public static String getAccessUrl() {
		return AccessUrl;
	}

	public static void setAccessUrl(String accessUrl) {
		AccessUrl = accessUrl;
	}
}
