package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PHPTBuyPaddlePage;
import com.crowdar.examples.pages.PHPTCheckOutPage;
import com.crowdar.examples.pages.PHPTHomePage;
import com.crowdar.examples.pages.PHPTHotelDetailsPage;
import com.crowdar.examples.pages.PHPTHotelsResultPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PHPTSteps extends PageSteps {

	
	 @Given("The user is in PhpTravels Home Page")
	    public void home() {
	        Injector._page(PHPTHomePage.class).go();
	    }
	 
	 @When ("The user selects '([^']*)' ARG destination, select the next fields by default and click on Search")
	  public void completeSearchCriterias (String destination) {
		 Injector._page(PHPTHomePage.class).selectDestination(destination);
		 Injector._page(PHPTHomePage.class).clickSearchButton();
	 }

	 @When ("Selects the Hotel and click on Details in the first result")
	 public void selectHotel() {
		 Injector._page(PHPTHotelsResultPage.class).clickOnDetailsInTheFirst();
	 }
	 
	 @When ("Selects the first room available and click on Book Now")
	 public void selectRoom() {
		 Injector._page(PHPTHotelDetailsPage.class).clickBookNowOnTheFirst();
	 }
	
	 @When ("Completes the Booking Information and click on Complete Booking")
	 public void completeBooking () {
		 Injector._page(PHPTCheckOutPage.class).completeBookingInfo();
		 Injector._page(PHPTCheckOutPage.class).clickCompleteBookingButton();
	 }
	 
	 @When ("Completes the email and accept terms in Room Reservation popup and click on Continue")
	 public void confirmReservationData() {
		 Injector._page(PHPTBuyPaddlePage.class).insertEmail();
		 Injector._page(PHPTBuyPaddlePage.class).acceptTerms();
		 Injector._page(PHPTBuyPaddlePage.class).clickContinueButton();
	 }
	 
	 @When ("Completes the country in Room Reservation popup and click on Continue")
	 public void confirmCountry() {
		 Injector._page(PHPTBuyPaddlePage.class).confirmCountry();
		 Injector._page(PHPTBuyPaddlePage.class).clickContinueButton();
	 }
	 
	 @When ("Clicks on Pay By Card, Completes all mandatory fields and click on Pay Now")
	 public void selectPaymentMethod() {
		 Injector._page(PHPTBuyPaddlePage.class).clickCCPayButton();
		 Injector._page(PHPTBuyPaddlePage.class).insertCCData();
		 Injector._page(PHPTBuyPaddlePage.class).clickPayNow();
		 
	 }
	 
	 @Then ("The user gets a massage about the payment rejection")
	 public void validatePaymentRejectionMessage() {
		 Injector._page(PHPTBuyPaddlePage.class).validatePaymentRejectionMessage(); 
	 }
	
}
