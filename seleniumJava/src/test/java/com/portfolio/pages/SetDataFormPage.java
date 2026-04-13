package com.portfolio.pages;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

import com.portfolio.models.FormTextsModels;

public class SetDataFormPage extends FormTextsModels {

	/*
	 * Esta clase se crea para inicializar la data a utilizar en el test Teniendo en
	 * cuenta que se puede presentar el caso de efectuar consultas a bases de datos
	 * de prueba
	 */

	private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "0123456789";
	private static final Random random = new Random();

	public SetDataFormPage() {
	};

	public static String randomString(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
		}
		return sb.toString();
	}

	public static String randomNumber(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
		}
		return sb.toString();
	}

	public static String randomAlphaNumeric(int length) {
		String chars = LETTERS + NUMBERS;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(random.nextInt(chars.length())));
		}
		return sb.toString();
	}

	public String getDate(String TypeDay, String typeDate) {
		LocalDate date = LocalDate.now();
		if (TypeDay.equals("mayor")) {
			date = date.minusYears(1).plusDays(1);
		}
		String[] desglosedDate = date.toString().split("-");
		return desglosedDate[2] + " " + getMonthParsed(desglosedDate[1],typeDate) + " " + desglosedDate[0];
	}

	public void inicialiceDataInputs() {
		setEmailWhitoutExt(UUID.randomUUID().toString().substring(0, 5) + "@gmail");
		setEmailWhitoutTag(UUID.randomUUID().toString().substring(0, 5) + "gmail.com");
		setSuccessEmail(UUID.randomUUID().toString().substring(0, 5) + "@gmail.com");
		setWrongNumber(randomString(10));
		setWrongNumberAlfaNumeric(randomAlphaNumeric(9));
		setSucessNumber("321" + randomNumber(7));
		setTodayDate(getDate("today","short"));
		setTomorrowDate(getDate("mayor","short"));
		setMonthFull(getDate("mayor","full"));
	}

	public String getMonthParsed(String month, String typeMonth) {
		TextStyle tipo = typeMonth.equals("short")? TextStyle.SHORT: TextStyle.FULL;
		 int monthNumber = Integer.parseInt(month);
		    return Month.of(monthNumber).getDisplayName(tipo, Locale.ENGLISH);
	}

}
