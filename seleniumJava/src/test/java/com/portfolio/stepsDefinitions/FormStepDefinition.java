package com.portfolio.stepsDefinitions;

import com.portfolio.pages.FormPages;
import com.portfolio.utils.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormStepDefinition {
	
	FormPages formPages = new FormPages(DriverFactory.getDriver());
	
	@Given("el usuario está en la página de DemoQA")
	public void validatePageVisualization() {
		formPages.pageValidation();
	}
	
	@And("navega a la sección de formularios")
	public void selectFormsModule() {
		formPages.navigateToFormOption();
	}
	
	@Given("El usuario accede al formulario")
	public void joinFormsModule() {
		formPages.succefullJoinIntoFormFunc();
	}
	
	@When("El usuario da click sobre el botón Submit")
	public void clickSubmitButton() {
		formPages.clickSubmitButton();
	}
	
	@Then("Los campos marcados como requeridos se muestran resaltados")
	public void changeClassWrongInputs() {
		formPages.validateWrongFields();
	}
	
	@Given("El usuario podra ingresar tanto el nombre como el apellido")
	public void insertNameAndLastName() {
		formPages.sendValuesNameLastName();
	}
	
	@Given("El usuario podrá seguir visualizando el formulario aun con la información previamente ingresada")
	public void checkFromWithOldData() {
		formPages.verifyPreviousData();
	}
	
	@Given("El usuario intentará agregar más de diez caracteres {string} y visualizar la información errónea")
	public void insertDataEmail(String value) {
		formPages.insertPhoneValues(value);
	}
	
	@Given("El usuario ingresará un número de contacto válido")
	public void insertPhoneNumber() {
		formPages.rightPhoneNumber();
	}
	
	@Given("Se podrá visualizar que el campo Input fue ingresado correctamente")
	public void checkClassChangeInputForm() {
		formPages.checkValityFieldPhone();
	}
	
	@Given("El usuario podrá ingresar un genero requerido")
	public void selectRandomGender() {
		formPages.selectRandomUserGender();
	}
	
	@Given("El usuario intentara ingresar un email sin el caracter @ pero con la extension correcta")
	public void insertWrongEmailWithoutTag() {
		formPages.sendEmailInput("WhitoutTag");
	}
	
	@Given("se podra visualizar que el input se marca erroneo")
	public void checkClassEmailForm() {
		formPages.verifyErrorFieldEmail();
	}
	
	@Given("El usuario intentara ingresar un email con el @ pero sin la extension")
	public void insertWrongEmailWithoutExtension() {
		formPages.sendEmailInput("WithoutExt");
	}
	
	@Given("El usuario intentara ingresar un email correctamente")
	public void insertRightEmail() {
		formPages.sendEmailInput("sucess");
	}
	
	@Given("se podra visualizar que el input se marca correcto")
	public void checkSuccefullClassEmail() {
		formPages.verifyRightInputEmail();
	}
	
	@Given("El usuario podra visualizar la fecha del dia de hoy por defecto")
	public void checkTodayDate() {
		formPages.validateDateOnScreen("today");
	}
	
	@Given("El usuario podra seleccionar la fecha correspondiente al dia de hoy del año anterior mas un dia")
	public void selectDifferentDate() {
		formPages.changeDateOnScreen();
	}
	
	@Given("Se podra visualizar el cambio de fecha exitosamente")
	public void checkNewDateInputForm() {
		formPages.validateDateOnScreen("tomorrow");
	}
	
	@Given("El usuario podra visualizar la aparicion de un pop up informativo")
	public void checkNewPopUpInScreen() {

	}
	
	@Given("se comparara la informacion ingresada con la mostrada en el pop up")
	public void comparePopUpInformation() {

	}
	
	@Given("el usuario podra dar click en el boton Close del pop up")
	public void submitCloseButton() {

	}
}
