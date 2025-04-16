package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    private By inputFile = By.id("fileInput");
    private By warningMessage = By.id("sizeWarning");
    private By uploadSuccessMessage = By.id("uploadSuccess");
    private By errorLog = By.id("errorLog");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void selectLargeFile() {
        driver.findElement(inputFile).sendKeys("path/to/large-file.txt");
    }

    public boolean isSizeWarningDisplayed() {
        return driver.findElement(warningMessage).isDisplayed();
    }

    public void attemptToUploadLargeFile() {
        driver.findElement(inputFile).submit();
    }

    public boolean isUploadSuccessful() {
        return driver.findElement(uploadSuccessMessage).isDisplayed();
    }
    
    public boolean isErrorLogged() {
        return driver.findElement(errorLog).isDisplayed();
    }

    public void selectValidFile() {
        driver.findElement(inputFile).sendKeys("path/to/valid-file.txt");
    }
}