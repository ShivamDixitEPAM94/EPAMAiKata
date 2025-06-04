package stepDefinitions;

import io.cucumber.java.en.*;

public class AssignEmployeeIDSteps {

    @Given("I am on the \"Add Employee\" page")
    public void iAmOnTheAddEmployeePage() {
        // Code to navigate to Add Employee page
    }

    @When("I assign a unique employee ID")
    public void iAssignAUniqueEmployeeID() {
        // Code to assign unique employee ID
    }

    @Then("the employee ID should be saved successfully")
    public void theEmployeeIDShouldBeSavedSuccessfully() {
        // Code to verify employee ID is saved
    }

    @When("I assign a duplicate employee ID")
    public void iAssignADuplicateEmployeeID() {
        // Code to assign duplicate employee ID
    }

    @Then("I should see an error message indicating duplicate ID")
    public void iShouldSeeAnErrorMessageIndicatingDuplicateID() {
        // Code to verify error message
    }
}