package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.EmployeeManagementPage;
import io.cucumber.java.en.*;

public class EmployeeManagementSteps {
    WebDriver driver;
    EmployeeManagementPage empPage;

    public EmployeeManagementSteps() {
        driver = Hooks.driver;
        empPage = PageFactory.initElements(driver, EmployeeManagementPage.class);
    }

    @When("I navigate to the {string} page")
    public void navigateToPage(String pageName) {
        empPage.navigateToPage(pageName);
    }

    @When("I fill in the employee details")
    public void fillEmployeeDetails() {
        empPage.enterEmployeeDetails("John", "Doe", "12345");
    }

    @When("I search for an employee by name")
    public void searchEmployeeByName() {
        empPage.searchEmployee("John Doe");
    }

    @When("I edit the employee details")
    public void editEmployeeDetails() {
        empPage.editEmployeeDetails("John", "Smith");
    }

    @Then("the new employee should be added successfully")
    public void verifyEmployeeAdded() {
        empPage.verifyEmployeeAdded("John Doe");
    }

    @Then("the employee details should be updated successfully")
    public void verifyEmployeeUpdated() {
        empPage.verifyEmployeeUpdated("John Smith");
    }
}