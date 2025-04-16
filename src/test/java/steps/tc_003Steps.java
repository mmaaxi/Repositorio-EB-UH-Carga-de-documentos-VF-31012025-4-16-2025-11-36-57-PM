package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page = new tc_003Page(driver);

    @Given("^el campo de carga está vacío$")
    public void el_campo_de_carga_esta_vacio() {
        page.clearUploadField();
    }

    @When("^presiono el botón 'Cargar documento'$")
    public void presiono_el_boton_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("^el sistema debería mostrar un mensaje de advertencia solicitando un archivo$")
    public void el_sistema_deberia_mostrar_un_mensaje_de_advertencia_solicitando_un_archivo() {
        assertTrue(page.isWarningMessageDisplayed());
    }

    @Then("^no debería intentar cargar datos inexistentes$")
    public void no_deberia_intentar_cargar_datos_inexistentes() {
        assertTrue(page.isNoUploadAttempted());
    }
}