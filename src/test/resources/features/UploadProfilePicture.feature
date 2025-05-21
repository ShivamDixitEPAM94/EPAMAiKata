Feature: Upload Employee's Profile Picture
  As an admin
  I want to upload an employee's profile picture
  So that the employee's profile can have a visual representation

  @UploadValidPicture
  Scenario: Upload Valid Profile Picture
    Given I am logged into the OrangeHRM system as an admin
    And I navigate to the employee profile
    When I click on "Upload Picture"
    And I select a valid ".jpg" file under 1MB
    And I click "Upload"
    Then the profile picture should be uploaded successfully
    And the image should be displayed in the profile section

  @UploadInvalidPicture
  Scenario: Upload Invalid Profile Picture
    Given I am logged into the OrangeHRM system as an admin
    And I navigate to the employee profile
    When I click on "Upload Picture"
    And I select an invalid file type or size
    And I click "Upload"
    Then an error message should be displayed
    And the message should state "Invalid file type or size. Please upload a `.jpg`, `.png`, or `.gif` file under 1MB."