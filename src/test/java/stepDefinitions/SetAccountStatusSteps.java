package stepDefinitions;

import io.cucumber.java.en.*;

public class SetAccountStatusSteps {

    @Given("I am on the \"Add Employee\" page")
    public void iAmOnTheAddEmployeePage() {
        // Code to navigate to Add Employee page
    }

    @When("I set the account status to \"Enabled\"")
    public void iSetTheAccountStatusToEnabled() {
        // Code to set account status to Enabled
    }

    @Then("the account status should be saved successfully")
    public void theAccountStatusShouldBeSavedSuccessfully() {
        // Code to verify account status is saved
    }

    @When("I set the account status to \"Disabled\"")
    public void iSetTheAccountStatusToDisabled() {
        // Code to set account status to Disabled
    }

    @Then("the account status should be saved successfully")
    public void theAccountStatusShouldBeSavedSuccessfullyAgain() {
        // Code to verify account status is saved
    }
}