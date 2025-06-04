Feature: Employee Management
  As an admin, I want to manage employees in the OrangeHRM application.

  Scenario: Add a New Employee
    Given I am logged in as an admin
    When I navigate to the Add Employee page
    And I fill in the employee details
    And I click on the save button
    Then the new employee should be added successfully

  Scenario: Search for an Employee
    Given I am logged in as an admin
    When I navigate to the Employee List page
    And I search for an employee by name
    Then the employee details should be displayed