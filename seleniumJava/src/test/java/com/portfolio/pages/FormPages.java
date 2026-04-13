package com.portfolio.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.portfolio.models.FormLocatorsModel;
import com.portfolio.models.FormTextsModels;
import com.portfolio.utils.DriverFactory;
import com.portfolio.utils.GenericFunctions;
import com.portfolio.utils.Waits;

public class FormPages extends GenericFunctions{
	
	private WebDriver driver;
	private FormLocatorsModel flm = new FormLocatorsModel();
	private FormTextsModels ftm = new FormTextsModels();
	
	public FormPages (WebDriver driver){
		this.driver = driver;
	}
	
	public void pageValidation() {
		assertVerification(DriverFactory.getDriver().getCurrentUrl(),DriverFactory.getAccessUrl());
	}
	
	public void navigateToFormOption() {
		List <WebElement> optionChoose = Waits.waitAndGetListOfElement(flm.getAllPageMenus());
		optionChoose.stream().filter(a -> a.getText().equals("Forms")).findFirst().ifPresent(WebElement::click);
	}
	
	public void succefullJoinIntoFormFunc() {
		assertVerification(getWebElementBy(flm.getMainMessage()).getText(),ftm.getMainMessage());
	}

}
