Feature: Upload Employee Profile Picture
  As an HR admin
  I want to upload a profile picture for an employee
  So that their profile is complete

  Scenario: Upload a valid profile picture
    Given I am on the "Add Employee" page
    When I upload a valid profile picture
    Then the profile picture should be uploaded successfully

  Scenario: Upload an invalid profile picture
    Given I am on the "Add Employee" page
    When I upload an invalid profile picture
    Then I should see an error message indicating invalid file format