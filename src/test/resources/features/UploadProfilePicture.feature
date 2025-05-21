Feature: Upload Profile Picture
  As an admin
  I want to upload a profile picture for an employee
  So that the employee's profile is updated with the picture

  @UploadProfilePicturePositive
  Scenario: Upload a valid profile picture
    Given I am logged in as an admin
    And I am on the employee profile page
    When I upload a valid profile picture with file type ".jpg" and size 900KB
    Then the profile picture should be successfully uploaded and displayed

  @UploadProfilePictureNegative
  Scenario: Upload an invalid profile picture
    Given I am logged in as an admin
    And I am on the employee profile page
    When I upload an invalid profile picture with file type ".pdf"
    Then I should see an error message "Invalid file type. Please upload a .jpg, .png, or .gif file."