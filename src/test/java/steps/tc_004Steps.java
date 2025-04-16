package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

import static org.junit.Assert.*;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page uploadPage;

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        uploadPage = new tc_004Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("selecciona un documento que excede el tamaño permitido")
    public void selecciona_un_documento_que_excede_el_tamano_permitido() {
        uploadPage.selectLargeFile();
    }

    @Then("el sistema rechaza el documento y muestra advertencia de tamaño")
    public void el_sistema_rechaza_el_documento_y_muestra_advertencia_de_tamano() {
        assertTrue(uploadPage.isSizeWarningDisplayed());
    }

    @Given("el usuario ya ha intentado seleccionar un documento excedido")
    public void el_usuario_ya_ha_intentado_seleccionar_un_documento_excedido() {
        uploadPage.selectLargeFile();
    }

    @When("intenta cargar el documento grande")
    public void intenta_cargar_el_documento_grande() {
        uploadPage.attemptToUploadLargeFile();
    }

    @Then("no se permite la carga y se registra un error en el log")
    public void no_se_permite_la_carga_y_se_registra_un_error_en_el_log() {
        assertFalse(uploadPage.isUploadSuccessful());
        assertTrue(uploadPage.isErrorLogged());
    }

    @When("selecciona un documento dentro del límite permitido")
    public void selecciona_un_documento_dentro_del_limite_permitido() {
        uploadPage.selectValidFile();
    }

    @Then("el sistema acepta el documento y continúa con la carga")
    public void el_sistema_acepta_el_documento_y_continua_con_la_carga() {
        assertTrue(uploadPage.isUploadSuccessful());
    }
}