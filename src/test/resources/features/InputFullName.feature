Feature: Input Full Name
  As an admin
  I want to input the full name of an employee
  So that the employee's details are saved correctly

  @InputFullNamePositive
  Scenario: Input a valid full name
    Given I am logged in as an admin
    And I am on the employee creation form
    When I enter "John" in the First Name field
    And I enter "Michael" in the Middle Name field
    And I enter "Doe" in the Last Name field
    And I click "Save"
    Then the full name should be successfully saved

  @InputFullNameNegative
  Scenario: Leave mandatory fields empty
    Given I am logged in as an admin
    And I am on the employee creation form
    When I leave the First Name and Last Name fields empty
    And I click "Save"
    Then I should see an error message "First Name and Last Name are required fields."