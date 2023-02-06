Feature: feature to update porfile info
@run
Scenario: successfully change and update profile info
    Given user is on php travel page
    Then user login
    And user go to profile page
    Then user updates their profile info
    Then profile successfully updated