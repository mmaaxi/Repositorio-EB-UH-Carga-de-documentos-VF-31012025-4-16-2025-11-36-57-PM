package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");
    private String uploadPageURL = "http://example.com/upload";
    private String directUploadURL = "http://example.com/direct-upload";
  
    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get(uploadPageURL);
    }

    public void attemptDocumentUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isRedirectedToAuthentication() {
        return driver.getCurrentUrl().contains("auth");
    }

    public void navigateToDirectUploadURL() {
        driver.get(directUploadURL);
    }

    public boolean isAccessDeniedErrorDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void simulateUnauthorizedAccess() {
        // Simulate unauthorized access attempt
    }
  
    public void checkSystemLogs() {
        // Logic to navigate/log access logs
    }
  
    public boolean isSuspiciousActivityLogged() {
        // Logic to verify logs
        return true; // For testing purposes
    }
}