package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.EmployeeManagementPage;
import io.cucumber.java.en.*;

public class EmployeeManagementStepDefinitions {
    WebDriver driver;
    EmployeeManagementPage empPage = PageFactory.initElements(driver, EmployeeManagementPage.class);

    @Given("I am logged in as an admin")
    public void loginAsAdmin() {
        empPage.loginAsAdmin();
    }

    @When("I navigate to the {string} page")
    public void navigateToPage(String pageName) {
        empPage.navigateToPage(pageName);
    }

    @When("I fill in the employee details")
    public void fillEmployeeDetails() {
        empPage.fillEmployeeDetails("John", "Doe", "12345");
    }

    @And("I click on the save button")
    public void clickSaveButton() {
        empPage.clickSaveButton();
    }

    @Then("the new employee should be added successfully")
    public void verifyEmployeeAdded() {
        empPage.verifyEmployeeAdded();
    }

    @When("I search for an employee by name")
    public void searchEmployeeByName() {
        empPage.searchEmployee("John Doe");
    }

    @Then("the employee details should be displayed")
    public void verifyEmployeeDetailsDisplayed() {
        empPage.verifyEmployeeDetailsDisplayed();
    }
}