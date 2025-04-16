package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaDeCarga() {
        page.navegarAPaginaDeCarga();
    }

    @When("el usuario selecciona el número máximo de documentos permitidos")
    public void seleccionarMaximoDocumentos() {
        page.seleccionarDocumentos(page.obtenerMaximoDocumentosPermitidos());
    }

    @Then("el sistema debe procesar los documentos seleccionados")
    public void sistemaProcesaDocumentos() {
        assertTrue(page.procesamientoCorrecto());
    }

    @Given("el usuario tiene el número máximo de documentos seleccionados")
    public void usuarioConMaximoDocumentosSeleccionados() {
        page.seleccionarDocumentos(page.obtenerMaximoDocumentosPermitidos());
    }

    @When("el usuario intenta agregar un documento adicional")
    public void usuarioAgregaDocumentoAdicional() {
        page.intentarAgregarDocumentoAdicional();
    }

    @Then("el sistema debe mostrar un mensaje de error indicando la cantidad máxima permitida")
    public void sistemaMuestraErrorPorMaximo() {
        assertTrue(page.muestraMensajeErrorMaximo());
    }

    @Given("el usuario ha cargado el número permitido de documentos")
    public void usuarioCargadoPermitidoDeDocumentos() {
        page.cargarDocumentos(page.obtenerMaximoDocumentosPermitidos());
    }

    @When("se verifica la cantidad de documentos cargados")
    public void verificarCantidadDocumentosCargados() {
        page.verificarDocumentosCargados();
    }

    @Then("la carga debe ser exitosa solo para los documentos dentro del límite")
    public void cargaExitosaDentroDelLimite() {
        assertTrue(page.cargaDentroDelLimite());
    }
}