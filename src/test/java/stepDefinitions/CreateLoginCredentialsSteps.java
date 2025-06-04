package stepDefinitions;

import io.cucumber.java.en.*;

public class CreateLoginCredentialsSteps {

    @Given("I am on the \"Add Employee\" page")
    public void iAmOnTheAddEmployeePage() {
        // Code to navigate to Add Employee page
    }

    @When("I create login credentials with a unique username and matching passwords")
    public void iCreateLoginCredentialsWithMatchingPasswords() {
        // Code to create login credentials
    }

    @Then("the credentials should be created successfully")
    public void theCredentialsShouldBeCreatedSuccessfully() {
        // Code to verify credentials are created
    }

    @When("I create login credentials with mismatched passwords")
    public void iCreateLoginCredentialsWithMismatchedPasswords() {
        // Code to create login credentials with mismatched passwords
    }

    @Then("I should see an error message indicating password mismatch")
    public void iShouldSeeAnErrorMessageIndicatingPasswordMismatch() {
        // Code to verify error message
    }
}