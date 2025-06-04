Feature: Input Employee Full Name
  As an HR admin
  I want to input the full name of an employee
  So that their profile is accurate

  Scenario: Input valid full name
    Given I am on the "Add Employee" page
    When I input "John" as the first name and "Doe" as the last name
    Then the full name should be saved successfully

  Scenario: Leave mandatory fields empty
    Given I am on the "Add Employee" page
    When I leave the first name field empty
    Then I should see an error message indicating that the field is mandatory