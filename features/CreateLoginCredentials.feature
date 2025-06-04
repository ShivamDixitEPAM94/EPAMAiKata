Feature: Create Login Credentials
  As an HR admin
  I want to create login credentials for an employee
  So that they can access the system

  Scenario: Create login credentials with matching passwords
    Given I am on the "Add Employee" page
    When I create login credentials with a unique username and matching passwords
    Then the credentials should be created successfully

  Scenario: Create login credentials with mismatched passwords
    Given I am on the "Add Employee" page
    When I create login credentials with mismatched passwords
    Then I should see an error message indicating password mismatch