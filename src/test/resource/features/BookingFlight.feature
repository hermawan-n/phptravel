Feature: feature to test flights funcionality
    @run
    Scenario: user successfully book a flight and do payment
        Given user is on php travel page
        Then user go to "Flights" page
        And user choose "Air Phillpines" airlines
        Then user choose "7518" flight id to book
        Then user fill personal information textbox "First Name" as "Nugi"
        Then user fill personal information textbox "Last Name" as "H"
        Then user fill personal information textbox "Email" as "ddd@gmail.com"
        Then user fill personal information textbox "Phone" as "0819283123"
        Then user fill personal information textbox "Address" as "JL. Dul dul"
        Then user fill personal information select "Country" as "Indonesia"
        Then user fill personal information select "Nationality" as "Indonesia"

        And user fill travellers information on "Adult Traveller 1" Age/Title "Title" as "MR"
        Then user fill travellers information on "Adult Traveller 1" textbox "First Name" as "Adult"
        Then user fill travellers information on "Adult Traveller 1" textbox "Last Name" as "One"
        Then user fill travellers information on "Adult Traveller 1" Nationality "Nationality" as "Indonesia"

        Then user fill travellers information on "Adult Traveller 1" Date of Birth "Month" as "01 January"
        Then user fill travellers information on "Adult Traveller 1" Date of Birth "Day" as "1"
        Then user fill travellers information on "Adult Traveller 1" Date of Birth "Year" as "1995"

        Then user fill travellers information on "Adult Traveller 1" Passport Issuance Date "Month" as "01 January"
        Then user fill travellers information on "Adult Traveller 1" Passport Issuance Date "Day" as "1"
        Then user fill travellers information on "Adult Traveller 1" Passport Issuance Date "Year" as "2020"

        Then user fill travellers information on "Adult Traveller 1" Passport Expiry Date "Month" as "01 January"
        Then user fill travellers information on "Adult Traveller 1" Passport Expiry Date "Day" as "1"
        Then user fill travellers information on "Adult Traveller 1" Passport Expiry Date "Year" as "2025"

        Then user fill travellers information on "Adult Traveller 1" textbox "Passport or ID number" as "01928309180"

        Then user choose payment method as "Razorpay"
        And agree to the terms and condition
        Then user confirm booking