package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage = new tc_002Page(driver);

    @Given("^Estoy en la página de carga de documentos$")
    public void estoy_en_la_pagina_de_carga_de_documentos() {
        uploadPage.navigateToUploadPage();
    }

    @When("^Selecciono un archivo con formato EXE$")
    public void selecciono_un_archivo_con_formato_exe() {
        uploadPage.selectFile("path/to/your/file.exe");
    }

    @Then("^El sistema me notifica que el formato no es soportado$")
    public void el_sistema_me_notifica_que_el_formato_no_es_soportado() {
        assertTrue(uploadPage.isUnsupportedFormatErrorDisplayed());
    }

    @When("^Intento cargar el archivo$")
    public void intento_cargar_el_archivo() {
        uploadPage.clickUploadButton();
    }

    @Then("^La carga es impedida y muestra una notificación de error$")
    public void la_carga_es_impedida_y_muestra_una_notificacion_de_error() {
        assertTrue(uploadPage.isUploadBlockedErrorDisplayed());
    }

    @Then("^Verifico que el documento no se registra en la base de datos$")
    public void verifico_que_el_documento_no_se_registra_en_la_base_de_datos() {
        assertFalse(uploadPage.isDocumentStoredInDatabase());
    }
}