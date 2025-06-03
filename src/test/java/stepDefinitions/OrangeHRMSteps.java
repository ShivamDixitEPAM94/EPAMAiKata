package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class OrangeHRMSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on the Login Page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterUsername("admin");
        loginPage.enterPassword("password123");
    }

    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the Dashboard page")
    public void user_should_be_redirected_to_the_dashboard_page() {
        // Add assertion to verify Dashboard page
    }

    @When("User clicks on the Logout button")
    public void user_clicks_on_the_logout_button() {
        // Add code to click logout button
    }

    @Then("User should be redirected to the Login page")
    public void user_should_be_redirected_to_the_login_page() {
        // Add assertion to verify Login page
    }
}