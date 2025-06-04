Feature: Login Functionality

  @Login
  Scenario: Successful Login with valid credentials
    Given User is on the Login Page
    When User enters valid username and password
    And User clicks on the Login button
    Then User should be redirected to the Dashboard

  @Login
  Scenario: Unsuccessful Login with invalid credentials
    Given User is on the Login Page
    When User enters invalid username and password
    And User clicks on the Login button
    Then User should see an error message