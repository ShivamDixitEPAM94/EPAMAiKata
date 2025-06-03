Feature: Leave Management

  Scenario: Apply for leave
    Given I am logged into the OrangeHRM dashboard
    When I navigate to the "Apply Leave" page
    And I select the leave type and dates
    And I click the "Apply" button
    Then the leave request should be submitted successfully

  Scenario: Approve leave request
    Given I am logged into the OrangeHRM dashboard as an admin
    When I navigate to the "Leave Requests" page
    And I approve a pending leave request
    Then the leave request status should be updated to "Approved"