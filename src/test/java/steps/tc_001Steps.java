package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("el usuario selecciona un archivo con formato admitido")
    public void seleccionarArchivoConFormatoAdmitido() {
        page.seleccionarArchivo("path/to/file.pdf");
    }

    @When("el usuario hace clic en el botón 'Cargar documento'")
    public void hacerClicEnCargarDocumento() {
        page.cargarDocumento();
    }

    @Then("el sistema muestra el mensaje 'Documento cargado exitosamente'")
    public void verificarMensajeDeExito() {
        page.verificarMensajeExito();
    }
}