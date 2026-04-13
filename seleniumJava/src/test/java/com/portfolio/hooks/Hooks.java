package com.portfolio.hooks;

import com.portfolio.utils.DriverFactory;
import com.portfolio.utils.ScreenShot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void setUp() {
		if (DriverFactory.getDriver().equals(null)) {
			DriverFactory.initDriver();
		}
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		if (DriverFactory.getDriver() != null) {
			scenario.attach(ScreenShot.takeScreenshot(DriverFactory.getDriver()), "image/png",
					scenario.getName());
		}
	}

}
