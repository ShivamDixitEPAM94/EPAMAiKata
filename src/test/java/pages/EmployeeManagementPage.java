package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeManagementPage {
    WebDriver driver;

    public EmployeeManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "profilePicture")
    WebElement profilePictureUpload;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "middleName")
    WebElement middleNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "employeeId")
    WebElement employeeIDField;

    @FindBy(id = "saveButton")
    WebElement saveButton;

    @FindBy(id = "errorMessage")
    WebElement errorMessage;

    public void uploadProfilePicture(String filePath) {
        profilePictureUpload.sendKeys(filePath);
    }

    public void enterFullName(String firstName, String middleName, String lastName) {
        firstNameField.sendKeys(firstName);
        middleNameField.sendKeys(middleName);
        lastNameField.sendKeys(lastName);
    }

    public void enterEmployeeID(String employeeID) {
        employeeIDField.sendKeys(employeeID);
    }

    public void verifyProfilePictureUploadSuccess() {
        // Add verification logic
    }

    public void verifyErrorMessage() {
        errorMessage.isDisplayed();
    }

    public void verifyFullNameAccepted() {
        // Add verification logic
    }

    public void verifyValidationError() {
        errorMessage.isDisplayed();
    }

    public void verifyEmployeeIDAccepted() {
        // Add verification logic
    }
}