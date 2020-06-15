package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTCheckOutPage extends PageBasePHPT {

private static final String COMPLETE_BOOKING_BUTTON_CSSS = "#thhotels > div > div.col-md-8.mt-30 > div:nth-child(4) > form:nth-child(2) > button";
private static final String COUNTRY_SELECTED_ARG_CSSS = "#country_code_chosen > div > ul > li:nth-child(6)";
private static final String COUNTRY_CODE_CHOSEN_A_SPAN_CSSS = "#country_code_chosen > a > span";
private static final String EMAIL_XPATH = "/html/body/div/div[1]/div[1]/div/div[1]/div[3]/form[1]/div/div[2]/div[2]/div[2]/input";

public PHPTCheckOutPage(RemoteWebDriver driver) {
		super(driver);
		
	}

	public void completeBookingInfo() {
		insertName();
		insertLastName();
		insertEmail();
		selectCountry();
		insertPhoneNumber();
	}

	public void insertPhoneNumber() {
		WebElement phone = getWebElement(By.cssSelector("#phone_number"));
		phone.sendKeys("156417233");
	}

	public void selectCountry() {
		clickElement(By.cssSelector(COUNTRY_CODE_CHOSEN_A_SPAN_CSSS));
		clickElement(By.cssSelector(COUNTRY_SELECTED_ARG_CSSS));
	}

	public void insertEmail() {
		WebElement email = getWebElement(By.xpath(EMAIL_XPATH));
		email.sendKeys("test@test.com");
	}

	public void insertLastName() {
		WebElement lastName = getWebElement(By.id("last_name"));
		lastName.sendKeys("Perez");
	}

	public void insertName() {
		WebElement name = getWebElement(By.id("first_name"));
		name.sendKeys("Juan");
	}

	public void clickCompleteBookingButton() {
		clickElement(By.cssSelector(COMPLETE_BOOKING_BUTTON_CSSS));
		
	}

}
