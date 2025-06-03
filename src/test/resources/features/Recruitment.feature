Feature: Recruitment

  Scenario: Add a job vacancy
    Given I am logged into the OrangeHRM dashboard as an admin
    When I navigate to the Job Vacancies page
    And I add a new job vacancy
    Then the job vacancy should be added successfully