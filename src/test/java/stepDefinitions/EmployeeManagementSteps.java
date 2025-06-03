package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.EmployeeManagementPage;
import utils.DriverFactory;

public class EmployeeManagementSteps {
    WebDriver driver = DriverFactory.getDriver();
    EmployeeManagementPage empPage = PageFactory.initElements(driver, EmployeeManagementPage.class);

    @Given("I am logged in as an admin")
    public void loginAsAdmin() {
        empPage.loginAsAdmin();
    }

    @When("I navigate to the Add Employee page")
    public void navigateToAddEmployeePage() {
        empPage.navigateToAddEmployee();
    }

    @When("I fill in the employee details")
    public void fillEmployeeDetails() {
        empPage.fillEmployeeDetails("John", "Doe", "12345");
    }

    @When("I click on the save button")
    public void clickSaveButton() {
        empPage.clickSave();
    }

    @Then("the new employee should be added successfully")
    public void verifyEmployeeAdded() {
        empPage.verifyEmployeeAdded();
    }

    @When("I navigate to the Employee List page")
    public void navigateToEmployeeListPage() {
        empPage.navigateToEmployeeList();
    }

    @When("I search for an employee by name")
    public void searchEmployeeByName() {
        empPage.searchEmployee("John Doe");
    }

    @Then("the employee details should be displayed")
    public void verifyEmployeeDetailsDisplayed() {
        empPage.verifyEmployeeDetails();
    }
}