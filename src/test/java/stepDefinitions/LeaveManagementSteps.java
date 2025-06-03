package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LeaveManagementPage;
import io.cucumber.java.en.*;

public class LeaveManagementSteps {
    WebDriver driver;
    LeaveManagementPage leavePage;

    public LeaveManagementSteps() {
        driver = Hooks.driver;
        leavePage = PageFactory.initElements(driver, LeaveManagementPage.class);
    }

    @When("I navigate to the {string} page")
    public void navigateToPage(String pageName) {
        leavePage.navigateToPage(pageName);
    }

    @When("I select the leave type and dates")
    public void selectLeaveTypeAndDates() {
        leavePage.selectLeaveType("Annual Leave");
        leavePage.selectLeaveDates("2023-10-01", "2023-10-05");
    }

    @When("I approve a pending leave request")
    public void approvePendingLeaveRequest() {
        leavePage.approveLeaveRequest();
    }

    @Then("the leave request should be submitted successfully")
    public void verifyLeaveRequestSubmitted() {
        leavePage.verifyLeaveRequestSubmitted();
    }

    @Then("the leave request status should be updated to {string}")
    public void verifyLeaveRequestStatus(String status) {
        leavePage.verifyLeaveRequestStatus(status);
    }
}