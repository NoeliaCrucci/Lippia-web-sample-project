package com.crowdar.examples.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTHotelsResultPage extends PageBasePHPT {
	
	private static final String DETAILS_FIRST_RESULT_BUTTON_CSSS = "#LIST > li:nth-child(1) > div > div > div.col-12.col-auto > div > div.content-bottom.mt-auto > div > div.ml-auto > form > button";

	public PHPTHotelsResultPage(RemoteWebDriver driver) {
		super(driver);
		this.url = "";
	}

	public void clickOnDetailsInTheFirst() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		clickElement(By.cssSelector(DETAILS_FIRST_RESULT_BUTTON_CSSS));
		
	}
	
	


}
