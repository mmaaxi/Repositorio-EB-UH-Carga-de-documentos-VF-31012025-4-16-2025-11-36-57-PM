package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;
    By uploadInput = By.id("upload-input");
    By uploadButton = By.id("upload-button");
    By errorNotification = By.id("error-notification");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void selectFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUnsupportedFormatErrorDisplayed() {
        return driver.findElement(errorNotification).getText().contains("formato no es soportado");
    }

    public boolean isUploadBlockedErrorDisplayed() {
        return driver.findElement(errorNotification).getText().contains("carga es impedida");
    }

    public boolean isDocumentStoredInDatabase() {
        // This would normally involve a database check which could be done using an API or direct DB query.
        return false; // For example purposes, assume this method returns false.
    }
}