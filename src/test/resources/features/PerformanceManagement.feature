Feature: Performance Management

  Scenario: Add a performance review
    Given I am logged into the OrangeHRM dashboard as an admin
    When I navigate to the Performance Reviews page
    And I add a new performance review
    Then the performance review should be added successfully