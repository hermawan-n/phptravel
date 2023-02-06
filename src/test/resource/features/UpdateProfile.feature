Feature: feature to update porfile info
    @run
    Scenario: successfully change and update profile info
        Given user is on php travel page
        Then user login with email as "ddd@gmail.com" and password as "123"
        And user go to profile page
        Then user updates their profile info
        Then profile successfully updated