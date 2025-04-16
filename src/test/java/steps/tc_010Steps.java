package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("el sistema simula la comunicación con un sistema externo al cargar el documento")
    public void simularComunicacionConSistemaExterno() {
        page.simularCargarDocumento();
    }

    @When("el sistema envía los datos al sistema externo")
    public void enviarDatosAlSistemaExterno() {
        boolean isDataSent = page.enviarDatosAlExterno();
        Assert.assertTrue("Los datos no se enviaron correctamente al sistema externo.", isDataSent);
    }

    @Then("el sistema externo debe responder confirmando la transacción")
    public void verificarRespuestaDelSistemaExterno() {
        boolean isResponseValid = page.verificarRespuestaDelExterno();
        Assert.assertTrue("El sistema externo no respondió de manera correcta.", isResponseValid);
    }

    @Then("el proceso de carga debe continuar sin errores")
    public void confirmarProcesoDeCargaSinErrores() {
        boolean isProcessContinuing = page.verificarProcesoDeCarga();
        Assert.assertTrue("El proceso de carga no continúa sin errores.", isProcessContinuing);
    }

    @Then("la integración debe gestionarse de forma transparente")
    public void verificarIntegracionTransparente() {
        boolean isIntegrationTransparent = page.verificarIntegracionTransparente();
        Assert.assertTrue("La integración no se gestiona de forma transparente.", isIntegrationTransparent);
    }
}