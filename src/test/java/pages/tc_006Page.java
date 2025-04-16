package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    private WebDriver driver;
    private By botonCargarDocumento = By.id("uploadDocumentButton");
    private By alertaError = By.id("errorAlert");
    private By mensajeExito = By.id("successMessage");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarCargaDocumento() {
        driver.findElement(botonCargarDocumento).click();
    }

    public void simularDesconexionRed() {
        // Simulación de desconexión de red (ejemplo)
    }

    public boolean verificarCargaCancelada() {
        // Verifica alerta de error
        return driver.findElement(alertaError).isDisplayed();
    }

    public void reintentarCargaDocumento() {
        // Código para reintentar carga
    }

    public boolean permisoReintentarCarga() {
        // Verificación de permiso para reintentar
        return true; // Simulación
    }

    public void confirmarCargaExitosa() {
        // Confirmar que la carga se completó con éxito
    }

    public boolean verificarNotificacionExito() {
        // Verifica que la notificación de éxito se muestre
        return driver.findElement(mensajeExito).isDisplayed();
    }
}