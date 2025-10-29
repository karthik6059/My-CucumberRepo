Feature: Login functionality for application
  Scenario: Unsuccessful login with invalid credentials
  	Given user is on the login page
    When user enters invalid username "test" and password "wrong"
    And clicks on login button
    Then error message should be displayed "Invalid credentials"
