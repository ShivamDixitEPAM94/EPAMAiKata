Feature: Login Functionality

  @Login
  Scenario: Valid Login
    Given I navigate to the OrangeHRM login page
    When I enter valid credentials
    And I click on the login button
    Then I should be redirected to the dashboard page

  @Login
  Scenario: Invalid Login
    Given I navigate to the OrangeHRM login page
    When I enter invalid credentials
    And I click on the login button
    Then I should see an error message