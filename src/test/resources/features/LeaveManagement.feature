Feature: Leave Management

  @SmokeTest
  Scenario: Apply Leave
    Given I am logged in as an employee
    When I navigate to the Apply Leave page
    And I select leave type and dates
    And I click on the apply button
    Then the leave request should be submitted successfully

  @RegressionTest
  Scenario: Approve Leave
    Given I am logged in as an admin
    When I navigate to the Leave List page
    And I approve a pending leave request
    Then the leave request status should be updated to approved