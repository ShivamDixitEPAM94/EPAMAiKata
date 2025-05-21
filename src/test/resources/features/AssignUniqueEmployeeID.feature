Feature: Assign Unique Employee ID
  As an admin
  I want to assign a unique Employee ID
  So that each employee has a distinct identifier

  @AssignUniqueEmployeeIDPositive
  Scenario: Assign a unique Employee ID
    Given I am logged in as an admin
    And I am on the employee creation form
    When I enter a unique Employee ID "EMP123"
    And I click "Save"
    Then the Employee ID should be successfully saved

  @AssignUniqueEmployeeIDNegative
  Scenario: Assign a duplicate Employee ID
    Given I am logged in as an admin
    And I am on the employee creation form
    When I enter a duplicate Employee ID "EMP123"
    And I click "Save"
    Then I should see an error message "Employee ID must be unique."