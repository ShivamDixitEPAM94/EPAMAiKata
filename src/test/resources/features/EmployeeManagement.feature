Feature: Employee Management

  @AddEmployee
  Scenario: Add a new employee
    Given User is logged in and on the Employee Management Page
    When User clicks on the Add Employee button
    And User fills in the employee details
    And User clicks on the Save button
    Then The new employee should be added successfully

  @DeleteEmployee
  Scenario: Delete an existing employee
    Given User is logged in and on the Employee Management Page
    When User selects an employee
    And User clicks on the Delete button
    Then The employee should be deleted successfully