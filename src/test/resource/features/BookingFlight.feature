Feature: feature to test flights hotel funcionality
    @run
    Scenario: user successfully book a flight and do payment
        Given user is on php travel page
        Then user go to "Flights" page
        And user choose "Air Phillpines" airlines
        Then user choose "7516" flight id to book
        Then user fill personal information for booking
        And fill travel information for flight
        Then user choose payment method as "Razorpay"
        And agree to the terms and condition
        Then user confirm booking