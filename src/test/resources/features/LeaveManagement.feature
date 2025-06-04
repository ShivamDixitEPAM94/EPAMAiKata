Feature: Leave Management

  @ApplyLeave
  Scenario: Apply for leave
    Given User is logged in and on the Leave Management Page
    When User clicks on the Apply Leave button
    And User fills in the leave details
    And User clicks on the Submit button
    Then The leave request should be submitted successfully

  @ApproveLeave
  Scenario: Approve a leave request
    Given User is logged in as an Admin and on the Leave Management Page
    When User selects a leave request
    And User clicks on the Approve button
    Then The leave request should be approved successfully