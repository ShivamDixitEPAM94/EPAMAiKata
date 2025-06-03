package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveManagementPage {
    WebDriver driver;

    public LeaveManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "menu_leave_applyLeave")
    WebElement applyLeaveMenu;

    @FindBy(id = "leaveType")
    WebElement leaveTypeDropdown;

    @FindBy(id = "fromDate")
    WebElement fromDateField;

    @FindBy(id = "toDate")
    WebElement toDateField;

    @FindBy(id = "applyBtn")
    WebElement applyButton;

    @FindBy(id = "approveBtn")
    WebElement approveButton;

    public void navigateToPage(String pageName) {
        if (pageName.equals("Apply Leave")) {
            applyLeaveMenu.click();
        }
    }

    public void selectLeaveType(String leaveType) {
        leaveTypeDropdown.sendKeys(leaveType);
    }

    public void selectLeaveDates(String fromDate, String toDate) {
        fromDateField.sendKeys(fromDate);
        toDateField.sendKeys(toDate);
    }

    public void approveLeaveRequest() {
        approveButton.click();
    }

    public void verifyLeaveRequestSubmitted() {
        // Add verification logic
    }

    public void verifyLeaveRequestStatus(String status) {
        // Add verification logic
    }
}