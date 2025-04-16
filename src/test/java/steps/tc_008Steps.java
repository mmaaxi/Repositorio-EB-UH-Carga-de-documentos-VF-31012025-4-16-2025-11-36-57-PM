package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    @Given("el usuario abre la página de carga de documentos")
    public void usuarioAbrePaginaCargaDocumentos() {
        page = new tc_008Page(driver);
        page.navigateToUploadPage();
    }

    @When("intenta cargar un documento")
    public void intentaCargarDocumento() {
        page.attemptDocumentUpload();
    }

    @Then("el sistema impide la carga y redirige a la página de autenticación")
    public void sistemaImpideCargaYRedirige() {
        Assert.assertTrue(page.isRedirectedToAuthentication());
    }

    @Given("el usuario navega a la URL directa de carga de documentos")
    public void usuarioNavegaUrlDirectaCarga() {
        page.navigateToDirectUploadURL();
    }

    @Then("el acceso es denegado y se muestra un mensaje de error")
    public void accesoDenegadoYMensajeError() {
        Assert.assertTrue(page.isAccessDeniedErrorDisplayed());
    }

    @Given("existen intentos de acceso no autorizados")
    public void existenIntentosAccesoNoAutorizados() {
        // Simular un intento no autorizado
        page.simulateUnauthorizedAccess();
    }

    @When("se revisan los logs del sistema")
    public void revisanLogsSistema() {
        page.checkSystemLogs();
    }

    @Then("la actividad sospechosa está registrada en el log del sistema")
    public void actividadRegistradaEnLogSistema() {
        Assert.assertTrue(page.isSuspiciousActivityLogged());
    }
}