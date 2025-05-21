Feature: Leave Management

  Scenario: Apply for leave
    Given I am logged in as an employee
    When I navigate to the "Leave" module
    And I click "Apply"
    And I select leave type and dates
    And I click "Apply"
    Then the leave application should be submitted and appear in the leave list

  Scenario: Apply for leave with conflicts
    Given I am logged in as an employee
    When I navigate to the "Leave" module
    And I click "Apply"
    And I select leave type and conflicting dates
    And I click "Apply"
    Then I should see an error message indicating the date conflict