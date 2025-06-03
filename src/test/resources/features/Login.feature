Feature: Login Functionality

  @SmokeTest
  Scenario: Valid Login
    Given I navigate to the OrangeHRM login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the dashboard

  @RegressionTest
  Scenario: Invalid Login
    Given I navigate to the OrangeHRM login page
    When I enter invalid username or password
    And I click on the login button
    Then I should see an error message