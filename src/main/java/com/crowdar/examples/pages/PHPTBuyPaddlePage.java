package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PHPTBuyPaddlePage extends PageBasePHPT {

	private static final String CC_PAY_BTN_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > div > button:nth-child(1)";
	private static final String CC_CVV_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-eMigcr.buoHqB > div.sc-itybZL.guWbgh > div > input";
	private static final String CC_EXPIRATION_YY_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-eMigcr.buoHqB > div.sc-caSCKo.gSbXTv > div > div.sc-emmjRN.bfAelg > input";
	private static final String CC_EXPIRATION_MM_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-eMigcr.buoHqB > div.sc-caSCKo.gSbXTv > div > div.sc-emmjRN.fcXOjx > input";
	private static final String CC_NAME_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-emmjRN.MELcG > input";
	private static final String CC_FIELD_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-emmjRN.jcwRLk > input";
	private static final String PAY_NOW_BTN_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > button";
	private static final String VALIDATION_MESSAGE_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-ibxdXY.sc-RefOD.joVLFJ > span";
	private static final String COUNTRY_SELECTED_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > div:nth-child(2) > div > select > option:nth-child(11)";
	private static final String COUNTRY_DROPDOWN_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > div:nth-child(2) > div > select";
	private static final String CONT_BUTTON_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > button";
	private static final String EMAIL_CSSS = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > div:nth-child(1) > div > input";

	public PHPTBuyPaddlePage(RemoteWebDriver driver) {
		super(driver);
	
	}

	public void insertEmail() {
		WebElement email = getWebElement(By.cssSelector(EMAIL_CSSS));
		email.sendKeys("test@test.com");
	}

	public void acceptTerms() {
		clickElement(By.id("marketingConsent"));
	}

	public void clickContinueButton() {
		
		clickElement(By.cssSelector(CONT_BUTTON_CSSS));
	}

	public void confirmCountry() {
		clickElement(By.cssSelector(COUNTRY_DROPDOWN_CSSS));
		clickElement(By.cssSelector(COUNTRY_SELECTED_CSSS));
		
	}

	public void clickCCPayButton() {
		clickElement(By.cssSelector(CC_PAY_BTN_CSSS));
		
	}

	public void insertCCData() {
		insertCardNumber();
		insertCardName();
		insertExpMM();
		insertExpYY();
		insertCVV();
				
	}

	public void insertCVV() {
		WebElement cvvCode = getWebElement (By.cssSelector(CC_CVV_CSSS));  
		cvvCode.sendKeys("837");
	}

	public void insertExpYY() {
		WebElement expirationYY = getWebElement(By.cssSelector(CC_EXPIRATION_YY_CSSS));
		expirationYY.sendKeys("2023");
	}

	public void insertExpMM() {
		WebElement expirationMM = getWebElement(By.cssSelector(CC_EXPIRATION_MM_CSSS));
		expirationMM.sendKeys("02");
	}

	public void insertCardName() {
		WebElement name = getWebElement(By.cssSelector(CC_NAME_CSSS));
		name.sendKeys("Juan Perez");
	}

	public void insertCardNumber() {
		WebElement ccard = getWebElement(By.cssSelector(CC_FIELD_CSSS));
		ccard.sendKeys("4263982640269299");
	}

	public void clickPayNow() {
		clickElement(By.cssSelector(PAY_NOW_BTN_CSSS));
		
	}

	public void validatePaymentRejectionMessage() {
		WebElement ErrorMessage = getWebElement(By.cssSelector(VALIDATION_MESSAGE_CSSS));
		Assert.assertEquals("This payment was declined by your bank. Please try again, or use a different payment method. Contact your bank for further information.", ErrorMessage.getText());
		
	}
	
	
}
