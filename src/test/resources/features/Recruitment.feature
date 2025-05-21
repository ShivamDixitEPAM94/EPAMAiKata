Feature: Recruitment

  Scenario: Post a job vacancy
    Given I am logged in as an admin
    When I navigate to the "Recruitment" module
    And I click "Add Job Vacancy"
    And I fill in the required fields
    And I click "Save"
    Then the job vacancy should be posted and appear in the job vacancy list

  Scenario: Post vacancy with missing data
    Given I am logged in as an admin
    When I navigate to the "Recruitment" module
    And I click "Add Job Vacancy"
    And I leave mandatory fields blank
    And I click "Save"
    Then I should see an error message indicating the missing mandatory fields