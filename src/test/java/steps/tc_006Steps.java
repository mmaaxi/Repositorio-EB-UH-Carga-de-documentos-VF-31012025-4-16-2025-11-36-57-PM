package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("un usuario está cargando un documento")
    public void usuarioCargandoDocumento() {
        page.iniciarCargaDocumento();
    }

    @When("simula un error de red durante la carga")
    public void simularErrorRed() {
        page.simularDesconexionRed();
    }

    @Then("el sistema debería detectar el error y cancelar la carga")
    public void verificarCancelacionPorError() {
        Assert.assertTrue(page.verificarCargaCancelada());
    }

    @When("restaura la conexión y reintenta la carga del documento")
    public void reintentarCargaDocumento() {
        page.reintentarCargaDocumento();
    }

    @Then("el sistema debería permitir reintentar la carga del documento fallido")
    public void verificarPermisoReintento() {
        Assert.assertTrue(page.permisoReintentarCarga());
    }

    @When("confirma que la carga es exitosa")
    public void confirmarCargaExitosa() {
        page.confirmarCargaExitosa();
    }

    @Then("el sistema debería notificar el éxito de la carga")
    public void verificarNotificacionDeExito() {
        Assert.assertTrue(page.verificarNotificacionExito());
    }
}