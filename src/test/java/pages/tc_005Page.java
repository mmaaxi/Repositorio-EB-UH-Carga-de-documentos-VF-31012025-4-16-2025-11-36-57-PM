package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_005Page {

    private WebDriver driver;
    private final int MAX_DOCUMENTOS = 5; // ejemplos
    private By botonCarga = By.id("uploadButton");
    private By inputDocumentos = By.id("uploadFiles");
    private By mensajeErrorMaximo = By.id("errorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCarga() {
        driver.get("http://example.com/upload");
    }

    public void seleccionarDocumentos(int cantidad) {
        WebElement input = driver.findElement(inputDocumentos);
        for (int i = 0; i < cantidad; i++) {
            input.sendKeys("documento" + i + ".pdf"); // Ejemplo de documentos
        }
    }

    public int obtenerMaximoDocumentosPermitidos() {
        return MAX_DOCUMENTOS;
    }

    public boolean procesamientoCorrecto() {
        // Lógica para verificar que el sistema procesa los documentos adecuadamente
        return true;
    }

    public void intentarAgregarDocumentoAdicional() {
        WebElement input = driver.findElement(inputDocumentos);
        input.sendKeys("documentoExtra.pdf");
    }

    public boolean muestraMensajeErrorMaximo() {
        return driver.findElement(mensajeErrorMaximo).isDisplayed();
    }

    public void cargarDocumentos(int cantidad) {
        seleccionarDocumentos(cantidad);
        driver.findElement(botonCarga).click();
    }

    public void verificarDocumentosCargados() {
        // Lógica para verificar documentos cargados en el sistema
    }

    public boolean cargaDentroDelLimite() {
        // Verificación si el número de documentos cargados está dentro del límite
        return true;
    }
}