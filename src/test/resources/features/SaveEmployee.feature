Feature: Save Employee
  As an admin
  I want to save an employee's details
  So that the employee is added to the system

  @SaveEmployeePositive
  Scenario: Save employee details successfully
    Given I am logged in as an admin
    And I am on the employee creation form
    When I fill in all required fields
    And I click the "Save" button
    Then the employee details should be successfully saved

  @SaveEmployeeNegative
  Scenario: Save button disabled for incomplete fields
    Given I am logged in as an admin
    And I am on the employee creation form
    When I leave one or more required fields empty
    Then the "Save" button should be disabled