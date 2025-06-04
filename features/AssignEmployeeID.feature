Feature: Assign Employee ID
  As an HR admin
  I want to assign a unique employee ID
  So that each employee can be identified uniquely

  Scenario: Assign a unique employee ID
    Given I am on the "Add Employee" page
    When I assign a unique employee ID
    Then the employee ID should be saved successfully

  Scenario: Assign a duplicate employee ID
    Given I am on the "Add Employee" page
    When I assign a duplicate employee ID
    Then I should see an error message indicating duplicate ID