package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement usernameField;

    @FindBy(id = "txtPassword")
    WebElement passwordField;

    @FindBy(id = "btnLogin")
    WebElement loginButton;

    @FindBy(id = "spanMessage")
    WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void verifyDashboard() {
        // Add verification logic
    }

    public void verifyErrorMessage() {
        // Add verification logic
    }
}