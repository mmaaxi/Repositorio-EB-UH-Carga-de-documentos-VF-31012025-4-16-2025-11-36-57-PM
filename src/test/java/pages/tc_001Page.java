package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    By inputFile = By.id("fileUpload");
    By uploadButton = By.id("uploadButton");
    By successMessage = By.id("successMessage");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarArchivo(String filePath) {
        driver.findElement(inputFile).sendKeys(filePath);
    }

    public void cargarDocumento() {
        driver.findElement(uploadButton).click();
    }

    public void verificarMensajeExito() {
        String mensaje = driver.findElement(successMessage).getText();
        assert mensaje.equals("Documento cargado exitosamente");
    }
}