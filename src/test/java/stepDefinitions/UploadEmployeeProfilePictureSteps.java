package stepDefinitions;

import io.cucumber.java.en.*;

public class UploadEmployeeProfilePictureSteps {

    @Given("I am on the \"Add Employee\" page")
    public void iAmOnTheAddEmployeePage() {
        // Code to navigate to Add Employee page
    }

    @When("I upload a valid profile picture")
    public void iUploadAValidProfilePicture() {
        // Code to upload a valid profile picture
    }

    @Then("the profile picture should be uploaded successfully")
    public void theProfilePictureShouldBeUploadedSuccessfully() {
        // Code to verify successful upload
    }

    @When("I upload an invalid profile picture")
    public void iUploadAnInvalidProfilePicture() {
        // Code to upload an invalid profile picture
    }

    @Then("I should see an error message indicating invalid file format")
    public void iShouldSeeAnErrorMessageIndicatingInvalidFileFormat() {
        // Code to verify error message
    }
}