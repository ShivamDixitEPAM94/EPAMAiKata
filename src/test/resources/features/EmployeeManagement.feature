Feature: Employee Management Functionality

  Scenario: Upload Profile Picture - Positive Scenario
    Given I am on the Add Employee page
    When I upload a valid profile picture
    Then the profile picture should be uploaded successfully

  Scenario: Upload Profile Picture - Negative Scenario
    Given I am on the Add Employee page
    When I upload an invalid profile picture
    Then I should see an error message

  Scenario: Input Full Name - Positive Scenario
    Given I am on the Add Employee page
    When I input a valid full name
    Then the full name should be accepted

  Scenario: Input Full Name - Negative Scenario
    Given I am on the Add Employee page
    When I leave the full name fields empty
    Then I should see a validation error message

  Scenario: Assign Unique Employee ID - Positive
    Given I am on the Add Employee page
    When I assign a unique Employee ID
    Then the Employee ID should be accepted

  Scenario: Assign Unique Employee ID - Negative
    Given I am on the Add Employee page
    When I assign a duplicate Employee ID
    Then I should see an error message