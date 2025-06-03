package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @Given("I navigate to the OrangeHRM login page")
    public void navigateToLoginPage() {
        driver.get("https://example.orangehrm.com");
    }

    @When("I enter valid username and password")
    public void enterValidCredentials() {
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin123");
    }

    @When("I enter invalid username or password")
    public void enterInvalidCredentials() {
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPass");
    }

    @And("I click on the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the dashboard")
    public void verifyDashboard() {
        loginPage.verifyDashboard();
    }

    @Then("I should see an error message")
    public void verifyErrorMessage() {
        loginPage.verifyErrorMessage();
    }
}