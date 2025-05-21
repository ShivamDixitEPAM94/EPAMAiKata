Feature: Time Tracking

  Scenario: Record work hours
    Given I am logged in as an employee
    When I navigate to the "Time" module
    And I select the date
    And I enter work hours
    And I click "Save"
    Then the work hours should be recorded and appear in the time sheet

  Scenario: Record invalid work hours
    Given I am logged in as an employee
    When I navigate to the "Time" module
    And I select the date
    And I enter invalid work hours
    And I click "Save"
    Then I should see an error message indicating invalid work hours