package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LeaveManagementPage;
import utils.DriverFactory;

public class LeaveManagementSteps {
    WebDriver driver = DriverFactory.getDriver();
    LeaveManagementPage leavePage = PageFactory.initElements(driver, LeaveManagementPage.class);

    @Given("I am logged in as an employee")
    public void loginAsEmployee() {
        leavePage.loginAsEmployee();
    }

    @When("I navigate to the Apply Leave page")
    public void navigateToApplyLeavePage() {
        leavePage.navigateToApplyLeave();
    }

    @When("I select leave type and dates")
    public void selectLeaveTypeAndDates() {
        leavePage.selectLeaveTypeAndDates("Annual Leave", "2023-12-01", "2023-12-05");
    }

    @When("I click on the apply button")
    public void clickApplyButton() {
        leavePage.clickApply();
    }

    @Then("the leave request should be submitted successfully")
    public void verifyLeaveRequestSubmitted() {
        leavePage.verifyLeaveRequestSubmitted();
    }

    @Given("I am logged in as an admin")
    public void loginAsAdmin() {
        leavePage.loginAsAdmin();
    }

    @When("I navigate to the Leave List page")
    public void navigateToLeaveListPage() {
        leavePage.navigateToLeaveList();
    }

    @When("I approve a pending leave request")
    public void approvePendingLeaveRequest() {
        leavePage.approveLeaveRequest();
    }

    @Then("the leave request status should be updated to approved")
    public void verifyLeaveRequestApproved() {
        leavePage.verifyLeaveRequestApproved();
    }
}