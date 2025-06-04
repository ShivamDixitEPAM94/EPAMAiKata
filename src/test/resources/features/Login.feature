Feature: Login Functionality
  As a user, I want to log in to the OrangeHRM application so that I can access my dashboard.

  Scenario: Successful Login
    Given I am on the login page
    When I enter valid credentials
    And I click on the login button
    Then I should be redirected to the dashboard

  Scenario: Unsuccessful Login with Invalid Credentials
    Given I am on the login page
    When I enter invalid credentials
    And I click on the login button
    Then I should see an error message