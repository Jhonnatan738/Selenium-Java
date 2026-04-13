package com.portfolio.models;

import org.openqa.selenium.By;

public class FormLocatorsModel {
	
	public FormLocatorsModel() {}

	private By allPageMenus = By.className("card-body");
	private By mainMessage = By.className("col-12 mt-4 col-md-6 col-xl-7");
	private By firstItemOptions = By.id("item-0");
	private By nameInput = By.id("firstName");
	private By lastNameInput = By.id("lastName");
	private By emailInput = By.id("userEmail");
	private By genderOptionOne = By.id("gender-radio-1");
	private By genderOptionTwo = By.id("gender-radio-2");
	private By genderOptionThree = By.id("gender-radio-3");
	private By cellPhoneInput = By.id("userNumber");
	private By dateSelect = By.id("dateOfBirthInput");
	private By yearOptionsSelect = By.className("react-datepicker__year-select");
	private By generalOptions = By.tagName("option");
	private By monthOptionsSelect = By.className("react-datepicker__month-select");
	private By subjectsInputField = By.id("subjectsInput");
	private By HobbiesOptionOne = By.id("hobbies-checkbox-1");
	private By HobbiesOptionTwo = By.id("hobbies-checkbox-2");
	private By HobbiesOptionThree = By.id("hobbies-checkbox-3");
	private By uploadPictureFile = By.id("uploadPicture");
	private By addressInput = By.id("currentAddress");
	private By selectState = By.id("react-select-6-input");
	private By selectCity = By.id("react-select-7-input");
	private By submitButton = By.id("submit");
	
	public By getMainMessage() {
		return mainMessage;
	}
	
	public By getAllPageMenus() {
		return allPageMenus;
	}
	public By getFirstItemOptions() {
		return firstItemOptions;
	}
	public By getNameInput() {
		return nameInput;
	}
	public By getLastNameInput() {
		return lastNameInput;
	}
	public By getEmailInput() {
		return emailInput;
	}
	public By getGenderOptionOne() {
		return genderOptionOne;
	}
	public By getGenderOptionTwo() {
		return genderOptionTwo;
	}
	public By getGenderOptionThree() {
		return genderOptionThree;
	}
	public By getCellPhoneInput() {
		return cellPhoneInput;
	}
	public By getDateSelect() {
		return dateSelect;
	}
	public By getYearOptionsSelect() {
		return yearOptionsSelect;
	}
	public By getGeneralOptions() {
		return generalOptions;
	}
	public By getMonthOptionsSelect() {
		return monthOptionsSelect;
	}
	public By getSubjectsInputField() {
		return subjectsInputField;
	}
	public By getHobbiesOptionOne() {
		return HobbiesOptionOne;
	}
	public By getHobbiesOptionTwo() {
		return HobbiesOptionTwo;
	}
	public By getHobbiesOptionThree() {
		return HobbiesOptionThree;
	}
	public By getUploadPictureFile() {
		return uploadPictureFile;
	}
	public By getAddressInput() {
		return addressInput;
	}
	public By getSelectState() {
		return selectState;
	}
	public By getSelectCity() {
		return selectCity;
	}
	public By getSubmitButton() {
		return submitButton;
	}

}