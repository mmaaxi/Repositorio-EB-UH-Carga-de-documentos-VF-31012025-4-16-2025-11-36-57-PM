package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_007Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("uploadButton");
    By successNotification = By.id("successNotification");
    By emailConfirmationMarker = By.id("emailConfirmationMarker");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    public void uploadDocument() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys("/path/to/document.txt");
    }

    public boolean isDocumentUploaded() {
        // Logic to confirm document upload
        // This could be an element showing that document is uploaded
        return true;
    }

    public void waitForOperationToComplete() {
        // Assuming some operation completion element or state
        wait.until(ExpectedConditions.visibilityOfElementLocated(successNotification));
    }

    public boolean isSuccessNotificationDisplayed() {
        return driver.findElement(successNotification).isDisplayed();
    }

    public boolean isConfirmationEmailReceived() {
        // Simulate the check for email receipt
        return driver.findElement(emailConfirmationMarker).isDisplayed();
    }
}