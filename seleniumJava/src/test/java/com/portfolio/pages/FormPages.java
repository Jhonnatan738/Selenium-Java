package com.portfolio.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.portfolio.models.FormLocatorsModel;
import com.portfolio.models.FormTextsModels;
import com.portfolio.utils.DriverFactory;
import com.portfolio.utils.GenericFunctions;
import com.portfolio.utils.Waits;

public class FormPages extends GenericFunctions {

	private WebDriver driver;
	private FormLocatorsModel flm = new FormLocatorsModel();
	private FormTextsModels ftm = new FormTextsModels();
	private SetDataFormPage sdf = new SetDataFormPage();
	private static final Random random = new Random();

	public FormPages(WebDriver driver) {
		this.driver = driver;
	}

	public void pageValidation() {
		assertVerification(DriverFactory.getDriver().getCurrentUrl(), DriverFactory.getAccessUrl());
		sdf.inicialiceDataInputs();
	}

	public void navigateToFormOption() {
		List<WebElement> optionChoose = Waits.waitAndGetListOfElement(flm.getAllPageMenus());
		optionChoose.stream().filter(a -> a.getText().equals("Forms")).findFirst().ifPresent(WebElement::click);
	}

	public void succefullJoinIntoFormFunc() {
		assertVerification(getWebElementBy(flm.getMainMessage()).getText(), ftm.getMainMessage());
		List<WebElement> lateralPannel = Waits.waitAndGetListOfElement(flm.getLeftPannel());
		WebElement menuForms = lateralPannel.stream().filter(b -> b.getText().equals("Forms")).findFirst().get();
		menuForms.click();
		menuForms.click();
		List<WebElement> selectOptionsID = Waits.waitAndGetListOfElement(flm.getFirstItemOptions());
		System.out.print("Opciones encontrdas" + selectOptionsID);
		selectOptionsID.stream()
				.filter(c -> c.findElement(By.tagName("span")).getText().trim().equalsIgnoreCase("Practice Form"))
				.findFirst().ifPresent(WebElement::click);
	}

	public void clickSubmitButton() {
		clickOnElement(flm.getSubmitButton());
	}

	public void validateWrongFields() {
		List<WebElement> requiredInput = new ArrayList<>();
		requiredInput.add(getWebElementBy(flm.getNameInput()));
		requiredInput.add(getWebElementBy(flm.getLastNameInput()));
		requiredInput.add(getWebElementBy(flm.getGenderOptionOne()));
		requiredInput.add(getWebElementBy(flm.getGenderOptionTwo()));
		requiredInput.add(getWebElementBy(flm.getGenderOptionThree()));
		requiredInput.add(getWebElementBy(flm.getCellPhoneInput()));
		for (WebElement component : requiredInput) {
			assertValityWithJSExecutor(driver, component);
		}

	}

	public void sendValuesNameLastName() {
		sendKeysElements(flm.getNameInput(), ftm.getUserName());
		sendKeysElements(flm.getLastNameInput(), ftm.getUserLastName());
	}

	public void verifyPreviousData() {
		List<WebElement> requiredInput = new ArrayList<>();
		verifySentData(flm.getNameInput(), ftm.getUserName(), driver);
		verifySentData(flm.getLastNameInput(), ftm.getUserLastName(), driver);
		requiredInput.add(getWebElementBy(flm.getGenderOptionOne()));
		requiredInput.add(getWebElementBy(flm.getGenderOptionTwo()));
		requiredInput.add(getWebElementBy(flm.getGenderOptionThree()));
		requiredInput.add(getWebElementBy(flm.getCellPhoneInput()));
		for (WebElement component : requiredInput) {
			assertValityWithJSExecutor(driver, component);
		}
	}

	public void insertPhoneValues(String kindValidation) {
		if (kindValidation.equals("alfabéticos")) {
			sendKeysElements(flm.getCellPhoneInput(), FormTextsModels.getWrongNumber());
		} else {
			sendKeysElements(flm.getCellPhoneInput(), FormTextsModels.getWrongNumberAlfaNumeric());
		}
		assertValityWithJSExecutor(driver, getWebElementBy(flm.getCellPhoneInput()));
	}

	public void rightPhoneNumber() {
		sendKeysElements(flm.getCellPhoneInput(), FormTextsModels.getSucessNumber());
	}

	public void checkValityFieldPhone() {
		confirmValityInput(driver, getWebElementBy(flm.getCellPhoneInput()));
	}

	public void selectRandomUserGender() {
		List<By> genderList = new ArrayList<>();
		genderList.add(flm.getGenderOptionOne());
		genderList.add(flm.getGenderOptionTwo());
		genderList.add(flm.getGenderOptionThree());
		clickOnElement(genderList.get(random.nextInt(genderList.size())));
	}

	public void sendEmailInput(String typeOfEmail) {
		switch (typeOfEmail) {
		case "WhitoutTag":
			sendKeysElements(flm.getEmailInput(), FormTextsModels.getEmailWhitoutTag());
			break;
		case "WithoutExt":
			sendKeysElements(flm.getEmailInput(), FormTextsModels.getEmailWhitoutExt());
			break;
		default:
			sendKeysElements(flm.getEmailInput(), FormTextsModels.getSuccessEmail());
		}
	}

	public void verifyErrorFieldEmail() {
		assertValityWithJSExecutor(driver, getWebElementBy(flm.getEmailInput()));
	}

	public void verifyRightInputEmail() {
		confirmValityInput(driver, getWebElementBy(flm.getEmailInput()));
	}

	public void validateDateOnScreen(String dateOption) {
		if (dateOption.equals("today")) {
			FormTextsModels.setSelectedDate(FormTextsModels.getTodayDate());
			assertVerification(getInputValue(getWebElementBy(flm.getDateSelect()), driver),
					FormTextsModels.getTodayDate());
		} else {
			FormTextsModels.setSelectedDate(FormTextsModels.getTomorrowDate());
			assertVerification(getInputValue(getWebElementBy(flm.getDateSelect()), driver),
					FormTextsModels.getTomorrowDate());
		}
	}

	public void changeDateOnScreen() {
		clickOnElement(flm.getDateSelect());
		String[] finalMonthDesglosed = FormTextsModels.getMonthFull().split(" ");
		Select monthSelect = new Select(getWebElementBy(flm.getMonthOptionsSelect()));
		monthSelect.selectByVisibleText(finalMonthDesglosed[1]);

		Select yearSelect = new Select(getWebElementBy(flm.getYearOptionsSelect()));
		yearSelect.selectByVisibleText(finalMonthDesglosed[2]);

		String[] dateDesglosed = FormTextsModels.getTomorrowDate().split(" ");
		List<WebElement> foundDays = Waits.waitAndGetListOfElement(getDayOption(dateDesglosed[0]));
		foundDays.stream().filter(a -> a.getText().equals(dateDesglosed[0])).findFirst().ifPresent(WebElement::click);

	}

	public void verifyPopUpDisponibility() {
		waitForElement(flm.getTittlePopUp());
	}

	public void comparitionDataAlreadySent() {
		String[] formateFinalDate = FormTextsModels.getMonthFull().split(" ");
		List<String> savedData = Arrays.asList(FormTextsModels.getSuccessEmail(), FormTextsModels.getSucessNumber(),
				ftm.getUserName() + " " + ftm.getUserLastName(),
				formateFinalDate[0] + " " + formateFinalDate[1] + "," + formateFinalDate[2]);
		WebElement tablePopUp = getWebElementBy(flm.getTablePopUp());
		List<WebElement> listDataTable = tablePopUp.findElements(By.tagName("td"));
		List<WebElement> dataTableFilter = listDataTable.stream().filter(Objects::nonNull)
				.filter(c -> c.getText() != null && !c.getText().trim().isEmpty())
				.filter(c -> !ftm.getOmitedList().contains(c.getText())).collect(Collectors.toList());
		for (WebElement labelRequired : dataTableFilter) {
			Assert.assertTrue(savedData.contains(labelRequired.getText()));
		}
	}
	
	public void clickOnButtomClose() {
		clickOnElement(flm.getButtonClosePopUp());
	}

	public By getDayOption(String day) {
		return By.xpath("//div[contains(@class,'react-datepicker__day') and text()='" + day + "']");
	}
}
