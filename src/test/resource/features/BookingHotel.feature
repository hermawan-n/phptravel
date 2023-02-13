Feature: feature to test booking hotel funcionality
    # @run
    Scenario: user successfully book a hotel and do payment
        Given user is on php travel page
        Then user go to "Hotels" page
        And user clicks on "Rendezvous Hotels"
        Then user choose a "Junior Suites" to book
        Then user fill personal information textbox "First Name" as "Nugi"
        Then user fill personal information textbox "Last Name" as "H"
        Then user fill personal information textbox "Email" as "ddd@gmail.com"
        Then user fill personal information textbox "Phone" as "0819283123"
        Then user fill personal information textbox "Address" as "JL. Dul dul"
        Then user fill personal information select "Country" as "Indonesia"
        Then user fill personal information select "Nationality" as "Indonesia"

        And user fill travellers information on "Adult Traveller 1" select Age/Title "Title" as "MR"
        Then user fill travellers information on "Adult Traveller 1" textbox "First Name" as "Adult"
        Then user fill travellers information on "Adult Traveller 1" textbox "Last Name" as "One"

        And user fill travellers information on "Adult Traveller 2" select Age/Title "Title" as "MISS"
        Then user fill travellers information on "Adult Traveller 2" textbox "First Name" as "Adult"
        Then user fill travellers information on "Adult Traveller 2" textbox "Last Name" as "Two"

        And user fill travellers information on "Child Traveller 1" select Age/Title "Age" as "15"
        Then user fill travellers information on "Child Traveller 1" textbox "First Name" as "Child"
        Then user fill travellers information on "Child Traveller 1" textbox "Last Name" as "One"

        And user fill travellers information on "Child Traveller 2" select Age/Title "Age" as "11"
        Then user fill travellers information on "Child Traveller 2" textbox "First Name" as "Child"
        Then user fill travellers information on "Child Traveller 2" textbox "Last Name" as "Two"

        Then user choose payment method as "Razorpay"
        And agree to the terms and condition
        Then user confirm booking