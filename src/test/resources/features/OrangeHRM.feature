Feature: OrangeHRM Automation

  Scenario: Verify Login Functionality
    Given User is on the Login Page
    When User enters valid username and password
    And User clicks on the Login button
    Then User should be redirected to the Dashboard page

  Scenario: Verify Logout Functionality
    Given User is logged in and on the Dashboard page
    When User clicks on the Logout button
    Then User should be redirected to the Login page