package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeManagementPage {
    WebDriver driver;

    @FindBy(id = "menu_pim_addEmployee")
    WebElement addEmployeeMenu;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "employeeId")
    WebElement employeeIdField;

    @FindBy(id = "btnSave")
    WebElement saveButton;

    @FindBy(id = "menu_pim_viewEmployeeList")
    WebElement employeeListMenu;

    @FindBy(id = "empsearch_employee_name_empName")
    WebElement searchField;

    @FindBy(id = "searchBtn")
    WebElement searchButton;

    public void loginAsAdmin() {
        // Logic for admin login
    }

    public void navigateToPage(String pageName) {
        if (pageName.equals("Add Employee")) {
            addEmployeeMenu.click();
        } else if (pageName.equals("Employee List")) {
            employeeListMenu.click();
        }
    }

    public void fillEmployeeDetails(String firstName, String lastName, String empId) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        employeeIdField.sendKeys(empId);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void searchEmployee(String empName) {
        searchField.sendKeys(empName);
        searchButton.click();
    }

    public void verifyEmployeeAdded() {
        // Logic to verify employee added
    }

    public void verifyEmployeeDetailsDisplayed() {
        // Logic to verify employee details displayed
    }
}