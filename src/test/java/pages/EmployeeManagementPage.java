package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeManagementPage {
    WebDriver driver;

    @FindBy(id = "menu_pim_viewPimModule")
    WebElement pimModule;

    @FindBy(id = "menu_pim_addEmployee")
    WebElement addEmployeeOption;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "employeeId")
    WebElement employeeIdField;

    @FindBy(id = "btnSave")
    WebElement saveButton;

    @FindBy(id = "menu_pim_viewEmployeeList")
    WebElement employeeListOption;

    @FindBy(id = "empsearch_employee_name_empName")
    WebElement searchEmployeeNameField;

    @FindBy(id = "searchBtn")
    WebElement searchButton;

    public EmployeeManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsAdmin() {
        // Logic to log in as admin
    }

    public void navigateToAddEmployee() {
        pimModule.click();
        addEmployeeOption.click();
    }

    public void fillEmployeeDetails(String firstName, String lastName, String employeeId) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        employeeIdField.sendKeys(employeeId);
    }

    public void clickSave() {
        saveButton.click();
    }

    public void navigateToEmployeeList() {
        pimModule.click();
        employeeListOption.click();
    }

    public void searchEmployee(String employeeName) {
        searchEmployeeNameField.sendKeys(employeeName);
        searchButton.click();
    }

    public void verifyEmployeeAdded() {
        // Add verification logic
    }

    public void verifyEmployeeDetails() {
        // Add verification logic
    }
}