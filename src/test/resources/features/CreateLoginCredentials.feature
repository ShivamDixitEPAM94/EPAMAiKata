Feature: Create Login Credentials
  As an admin
  I want to create login credentials for an employee
  So that the employee can access the system

  @CreateLoginCredentialsPositive
  Scenario: Enable login credentials toggle and create credentials
    Given I am logged in as an admin
    And I am on the employee creation form
    When I enable the "Create Login Credentials" toggle
    And I enter a username "johndoe"
    And I enter a password "Pass@123"
    And I confirm the password "Pass@123"
    And I click "Save"
    Then the login credentials should be successfully created

  @CreateLoginCredentialsNegative
  Scenario: Disable login credentials toggle
    Given I am logged in as an admin
    And I am on the employee creation form
    When I disable the "Create Login Credentials" toggle
    Then the username, password, and confirm password fields should be hidden