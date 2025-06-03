package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveManagementPage {
    WebDriver driver;

    @FindBy(id = "menu_leave_viewLeaveModule")
    WebElement leaveModule;

    @FindBy(id = "menu_leave_applyLeave")
    WebElement applyLeaveOption;

    @FindBy(id = "applyleave_txtLeaveType")
    WebElement leaveTypeDropdown;

    @FindBy(id = "applyleave_txtFromDate")
    WebElement fromDateField;

    @FindBy(id = "applyleave_txtToDate")
    WebElement toDateField;

    @FindBy(id = "applyBtn")
    WebElement applyButton;

    @FindBy(id = "menu_leave_viewLeaveList")
    WebElement leaveListOption;

    @FindBy(id = "btnSearch")
    WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(),'Approve')]")
    WebElement approveButton;

    public LeaveManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsEmployee() {
        // Logic to log in as employee
    }

    public void loginAsAdmin() {
        // Logic to log in as admin
    }

    public void navigateToApplyLeave() {
        leaveModule.click();
        applyLeaveOption.click();
    }

    public void selectLeaveTypeAndDates(String leaveType, String fromDate, String toDate) {
        leaveTypeDropdown.sendKeys(leaveType);
        fromDateField.clear();
        fromDateField.sendKeys(fromDate);
        toDateField.clear();
        toDateField.sendKeys(toDate);
    }

    public void clickApply() {
        applyButton.click();
    }

    public void verifyLeaveRequestSubmitted() {
        // Add verification logic
    }

    public void navigateToLeaveList() {
        leaveModule.click();
        leaveListOption.click();
    }

    public void approveLeaveRequest() {
        approveButton.click();
    }

    public void verifyLeaveRequestApproved() {
        // Add verification logic
    }
}