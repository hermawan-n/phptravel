Feature: feature to test login functionality

Scenario: Login with correct credentials
    Given user is on php travel page
    Then user click drop down account and choose customer login
    When user enters email and password with the correct credentials then click login button
    Then user login successfully

Scenario: Login with blank credential
    Given user is on php travel page
    Then user click drop down account and choose customer login
    When user enters blank email and password then click login button
    Then user asked to enter credentials