package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.EmployeeProfilePage;
import utils.DriverFactory;

public class UploadProfilePictureSteps {
    WebDriver driver = DriverFactory.getDriver();
    EmployeeProfilePage profilePage = PageFactory.initElements(driver, EmployeeProfilePage.class);

    @Given("I am logged into the OrangeHRM system as an admin")
    public void iAmLoggedIntoTheSystem() {
        // Code to log in as admin
    }

    @Given("I navigate to the employee profile")
    public void navigateToEmployeeProfile() {
        profilePage.navigateToProfile();
    }

    @When("I click on {string}")
    public void clickOnUploadPicture(String button) {
        profilePage.clickUploadPictureButton();
    }

    @When("I select a valid {string} file under 1MB")
    public void selectValidFile(String fileType) {
        profilePage.uploadFile("valid.jpg");
    }

    @When("I select an invalid file type or size")
    public void selectInvalidFile() {
        profilePage.uploadFile("invalid.exe");
    }

    @When("I click {string}")
    public void clickUpload(String button) {
        profilePage.clickUpload();
    }

    @Then("the profile picture should be uploaded successfully")
    public void verifyPictureUploaded() {
        profilePage.verifyPictureUploaded();
    }

    @Then("an error message should be displayed")
    public void verifyErrorMessage() {
        profilePage.verifyErrorMessage();
    }
}