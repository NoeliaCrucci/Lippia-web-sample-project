Feature: As a traveler user I Want to book a hotel To go away

  @Smoke
  Scenario: The user cant book a hotel because the credit card payment is rejected
    Given The user is in PhpTravels Home Page
    When The user selects 'Buenos Aires' ARG destination, select the next fields by default and click on Search
    And Selects the Hotel and click on Details in the first result
    And Selects the first room available and click on Book Now
    And Completes the Booking Information and click on Complete Booking
    And Completes the email and accept terms in Room Reservation popup and click on Continue
    And Completes the country in Room Reservation popup and click on Continue
    And Clicks on Pay By Card, Completes all mandatory fields and click on Pay Now
    Then The user gets a massage about the payment rejection
    
  
 