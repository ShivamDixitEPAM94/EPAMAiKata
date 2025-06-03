Feature: Time Tracking

  Scenario: Add a timesheet
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the "Timesheets" page
    And I add a new timesheet
    Then the timesheet should be added successfully