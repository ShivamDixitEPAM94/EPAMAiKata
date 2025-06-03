package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.EmployeeManagementPage;
import io.cucumber.java.en.*;

public class EmployeeManagementSteps {
    WebDriver driver;
    EmployeeManagementPage employeePage;

    public EmployeeManagementSteps() {
        driver = Hooks.driver;
        employeePage = PageFactory.initElements(driver, EmployeeManagementPage.class);
    }

    @Given("I am on the Add Employee page")
    public void i_am_on_the_add_employee_page() {
        driver.get("https://example.orangehrm.com/addEmployee");
    }

    @When("I upload a valid profile picture")
    public void i_upload_a_valid_profile_picture() {
        employeePage.uploadProfilePicture("path/to/valid/image.jpg");
    }

    @When("I upload an invalid profile picture")
    public void i_upload_an_invalid_profile_picture() {
        employeePage.uploadProfilePicture("path/to/invalid/image.txt");
    }

    @When("I input a valid full name")
    public void i_input_a_valid_full_name() {
        employeePage.enterFullName("John", "Doe", "Smith");
    }

    @When("I leave the full name fields empty")
    public void i_leave_the_full_name_fields_empty() {
        employeePage.enterFullName("", "", "");
    }

    @When("I assign a unique Employee ID")
    public void i_assign_a_unique_employee_id() {
        employeePage.enterEmployeeID("12345");
    }

    @When("I assign a duplicate Employee ID")
    public void i_assign_a_duplicate_employee_id() {
        employeePage.enterEmployeeID("11111");
    }

    @Then("the profile picture should be uploaded successfully")
    public void the_profile_picture_should_be_uploaded_successfully() {
        employeePage.verifyProfilePictureUploadSuccess();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        employeePage.verifyErrorMessage();
    }

    @Then("the full name should be accepted")
    public void the_full_name_should_be_accepted() {
        employeePage.verifyFullNameAccepted();
    }

    @Then("I should see a validation error message")
    public void i_should_see_a_validation_error_message() {
        employeePage.verifyValidationError();
    }

    @Then("the Employee ID should be accepted")
    public void the_employee_id_should_be_accepted() {
        employeePage.verifyEmployeeIDAccepted();
    }
}