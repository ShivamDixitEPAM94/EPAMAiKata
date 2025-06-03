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

    @FindBy(id = "welcome")
    WebElement dashboard;

    @FindBy(id = "spanMessage")
    WebElement errorMessage;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void verifyDashboardPage() {
        dashboard.isDisplayed();
    }

    public void verifyErrorMessage() {
        errorMessage.isDisplayed();
    }
}