Feature: feature to test booking hotel funcionality
    # @run
    Scenario: user successfully book a hotel and do payment
        Given user is on php travel page
        Then user go to "Hotels" page
        And user clicks on "Rendezvous Hotels"
        Then user choose a "Junior Suit" to book
        Then user fill personal information for booking
        And fill travel information
        Then user choose payment method as "Razorpay"
        And agree to the terms and condition
        Then user confirm booking