package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeProfilePage {
    WebDriver driver;

    public EmployeeProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    By uploadPictureButton = By.id("uploadPicture");
    By fileInput = By.id("fileInput");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public void navigateToProfile() {
        driver.get("https://orangehrm.com/employee-profile");
    }

    public void clickUploadPictureButton() {
        driver.findElement(uploadPictureButton).click();
    }

    public void uploadFile(String fileName) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(System.getProperty("user.dir") + "/testdata/" + fileName);
    }

    public void clickUpload() {
        driver.findElement(uploadButton).click();
    }

    public void verifyPictureUploaded() {
        // Add verification logic
    }

    public void verifyErrorMessage() {
        // Add verification logic
    }
}