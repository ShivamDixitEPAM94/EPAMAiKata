Feature: Employee Management

  Scenario: Add a new employee
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the "Add Employee" page
    And I fill in the employee details
    And I click the "Save" button
    Then the new employee should be added successfully

  Scenario: Edit an existing employee
    Given I am logged into the OrangeHRM dashboard
    When I search for an employee by name
    And I edit the employee details
    And I click the "Save" button
    Then the employee details should be updated successfully