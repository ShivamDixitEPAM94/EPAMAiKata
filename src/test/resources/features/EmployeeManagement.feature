Feature: Employee Management

  Scenario: Add a new employee
    Given I am logged in as an admin
    When I navigate to the "PIM" module
    And I click "Add Employee"
    And I fill in the required fields
    And I click "Save"
    Then the new employee should be added and appear in the employee list

  Scenario: Add employee with missing data
    Given I am logged in as an admin
    When I navigate to the "PIM" module
    And I click "Add Employee"
    And I leave mandatory fields blank
    And I click "Save"
    Then I should see an error message indicating the missing mandatory fields