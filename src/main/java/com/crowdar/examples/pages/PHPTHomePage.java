package com.crowdar.examples.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTHomePage extends PageBasePHPT {
	
	 private static final String SEARCH_BUTTON_CSSS = "#hotels > div > div > form > div > div > div.col-md-2.col-xs-12 > button";
	 private static final String INPUT_DESTINATION_CSSS = "s2id_autogen1";
	 private static final String INPUT_DESTINATION_ID = "#select2-drop > div > input";
	 private static final String DESTINATION_RESULT_CSSS = "#select2-drop > ul > li > ul > li:nth-child(2)";

    public PHPTHomePage (RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }
    
    public void selectDestination(String destination) {

    	        clickElement(By.id(INPUT_DESTINATION_CSSS));
    	        completeField(By.cssSelector(INPUT_DESTINATION_ID),destination);
    	        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    	        WebElement selectDropDown = driver.findElement(By.cssSelector(DESTINATION_RESULT_CSSS));
    	        selectDropDown.click();

    	    }

	public void clickSearchButton() {
		clickElement(By.cssSelector(SEARCH_BUTTON_CSSS));
		
	}
	
    
}
