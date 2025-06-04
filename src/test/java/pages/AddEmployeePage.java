package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

    WebDriver driver;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "employeeId")
    WebElement employeeIdField;

    @FindBy(id = "photofile")
    WebElement photoUploadField;

    @FindBy(id = "btnSave")
    WebElement saveButton;

    @FindBy(id = "btnCancel")
    WebElement cancelButton;

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmployeeId(String employeeId) {
        employeeIdField.sendKeys(employeeId);
    }

    public void uploadPhoto(String filePath) {
        photoUploadField.sendKeys(filePath);
    }

    public void clickSave() {
        saveButton.click();
    }

    public void clickCancel() {
        cancelButton.click();
    }
}