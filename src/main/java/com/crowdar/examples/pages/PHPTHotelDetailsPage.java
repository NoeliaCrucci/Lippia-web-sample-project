package com.crowdar.examples.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTHotelDetailsPage extends PageBasePHPT {

	private static final String BOOKNOW_FIRST_RESULT_BUTTON_CSSS = "#detail-content-sticky-nav-02 > div.room-item-wrapper > div:nth-child(2) > div > div.col-6.col-md-6.align-self-center > div > div.col-5.col-sm-4.col-md-4.ml-auto > form > button";

	public PHPTHotelDetailsPage(RemoteWebDriver driver) {
		super(driver);
		
	}

	public void clickBookNowOnTheFirst() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		clickElement(By.cssSelector(BOOKNOW_FIRST_RESULT_BUTTON_CSSS));
		
	}

}
