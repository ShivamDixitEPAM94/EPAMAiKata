Feature: Set Account Status
  As an HR admin
  I want to set the account status of an employee
  So that their access can be controlled

  Scenario: Set account status to enabled
    Given I am on the "Add Employee" page
    When I set the account status to "Enabled"
    Then the account status should be saved successfully

  Scenario: Set account status to disabled
    Given I am on the "Add Employee" page
    When I set the account status to "Disabled"
    Then the account status should be saved successfully