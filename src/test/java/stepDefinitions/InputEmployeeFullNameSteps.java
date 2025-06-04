package stepDefinitions;

import io.cucumber.java.en.*;

public class InputEmployeeFullNameSteps {

    @Given("I am on the \"Add Employee\" page")
    public void iAmOnTheAddEmployeePage() {
        // Code to navigate to Add Employee page
    }

    @When("I input \"John\" as the first name and \"Doe\" as the last name")
    public void iInputFirstNameAndLastName() {
        // Code to input first and last name
    }

    @Then("the full name should be saved successfully")
    public void theFullNameShouldBeSavedSuccessfully() {
        // Code to verify full name is saved
    }

    @When("I leave the first name field empty")
    public void iLeaveTheFirstNameFieldEmpty() {
        // Code to leave first name field empty
    }

    @Then("I should see an error message indicating that the field is mandatory")
    public void iShouldSeeAnErrorMessageIndicatingMandatoryField() {
        // Code to verify error message
    }
}