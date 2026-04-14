package com.portfolio.models;

import java.util.Arrays;
import java.util.List;

public class FormTextsModels {
	
	public FormTextsModels() {}
	
	private String mainMessage = "Please select an item from left to start practice.";
	private String userName = "Juan";
	private String userLastName = "Gomez";
	private static String emailWhitoutExt;
	private static String emailWhitoutTag;
	private static String successEmail;
	private static String wrongNumber;
	private static String wrongNumberAlfaNumeric;
	private static String sucessNumber;
	private static String todayDate;
	private static String tomorrowDate;
	private static String monthFull;
	private static String selectedDate;
	private String subject = "Math";
	private String picture = "./src/test/resources/img/imgExample.png";
	private String address = "Automation Address Test";
	private String state = "Haryana";
	private String city = "Panipat";	
	private List<String> omitedList = Arrays.asList("Student Name","Student Email","Gender","Mobile","Date of Birth","Subjects","Hobbies","Picture","Address","State and City","Male","Female","Other");
			

	public String getMainMessage() {
		return mainMessage;
	}

	public void setMainMessage(String mainMessage) {
		this.mainMessage = mainMessage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public static String getEmailWhitoutExt() {
		return emailWhitoutExt;
	}

	public static void setEmailWhitoutExt(String emailWhitoutExt) {
		FormTextsModels.emailWhitoutExt = emailWhitoutExt;
	}

	public static String getEmailWhitoutTag() {
		return emailWhitoutTag;
	}

	public static void setEmailWhitoutTag(String emailWhitoutTag) {
		FormTextsModels.emailWhitoutTag = emailWhitoutTag;
	}

	public static String getSuccessEmail() {
		return successEmail;
	}

	public static void setSuccessEmail(String successEmail) {
		FormTextsModels.successEmail = successEmail;
	}

	public static String getWrongNumber() {
		return wrongNumber;
	}

	public static void setWrongNumber(String wrongNumber) {
		FormTextsModels.wrongNumber = wrongNumber;
	}

	public static String getSucessNumber() {
		return sucessNumber;
	}

	public static void setSucessNumber(String sucessNumber) {
		FormTextsModels.sucessNumber = sucessNumber;
	}

	public static String getTodayDate() {
		return todayDate;
	}

	public static void setTodayDate(String todayDate) {
		FormTextsModels.todayDate = todayDate;
	}

	public static String getTomorrowDate() {
		return tomorrowDate;
	}

	public static void setTomorrowDate(String tomorrowDate) {
		FormTextsModels.tomorrowDate = tomorrowDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static String getWrongNumberAlfaNumeric() {
		return wrongNumberAlfaNumeric;
	}

	public static void setWrongNumberAlfaNumeric(String wrongNumberAlfaNumeric) {
		FormTextsModels.wrongNumberAlfaNumeric = wrongNumberAlfaNumeric;
	}

	public static String getMonthFull() {
		return monthFull;
	}

	public static void setMonthFull(String monthFull) {
		FormTextsModels.monthFull = monthFull;
	}

	public List<String> getOmitedList() {
		return omitedList;
	}

	public static String getSelectedDate() {
		return selectedDate;
	}

	public static void setSelectedDate(String selectedDate) {
		FormTextsModels.selectedDate = selectedDate;
	}

}
