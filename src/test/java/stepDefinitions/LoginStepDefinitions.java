package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {
    WebDriver driver;
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @Given("I navigate to the OrangeHRM login page")
    public void navigateToLoginPage() {
        driver.get("https://example.orangehrm.com");
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin123");
    }

    @When("I enter invalid credentials")
    public void enterInvalidCredentials() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPass");
    }

    @And("I click on the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the dashboard page")
    public void verifyDashboardPage() {
        loginPage.verifyDashboardPage();
    }

    @Then("I should see an error message")
    public void verifyErrorMessage() {
        loginPage.verifyErrorMessage();
    }
}