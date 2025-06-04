Feature: Leave Management
  As an employee, I want to apply for leave and view my leave status.

  Scenario: Apply for Leave
    Given I am logged in as an employee
    When I navigate to the Apply Leave page
    And I fill in the leave application details
    And I click on the apply button
    Then the leave application should be submitted successfully

  Scenario: View Leave Status
    Given I am logged in as an employee
    When I navigate to the Leave Status page
    Then I should see the status of my leave applications