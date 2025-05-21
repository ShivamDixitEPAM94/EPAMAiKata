Feature: Login Functionality

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click the "Login" button
    Then I should be redirected to the dashboard

  Scenario: Login with invalid credentials
    Given I am on the login page
    When I enter invalid username and password
    And I click the "Login" button
    Then I should see an error message indicating invalid login credentials