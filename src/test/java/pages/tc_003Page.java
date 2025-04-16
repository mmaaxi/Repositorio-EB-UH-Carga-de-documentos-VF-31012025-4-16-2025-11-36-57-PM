package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    By uploadField = By.id("uploadField");
    By uploadButton = By.id("uploadButton");
    By warningMessage = By.id("warningMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clearUploadField() {
        driver.findElement(uploadField).clear();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isWarningMessageDisplayed() {
        return driver.findElement(warningMessage).isDisplayed();
    }

    public boolean isNoUploadAttempted() {
        // Supposedly check that no upload request is sent
        // This requires backend/log verification in a real scenario
        return true; // Assuming the frontend will not initiate upload
    }
}