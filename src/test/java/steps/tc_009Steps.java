package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    @Given("el documento está listo para ser cargado")
    public void el_documento_esta_listo_para_ser_cargado() {
        page = new tc_009Page(driver);
        page.prepararDocumento();
    }

    @When("se carga el documento")
    public void se_carga_el_documento() {
        page.cargarDocumento();
    }

    @Then("se registra un nuevo registro con los metadatos correspondientes en la base de datos")
    public void se_registra_un_nuevo_registro_con_los_metadatos_correspondientes() {
        Assert.assertTrue(page.verificarInsercionBD());
    }

    @Given("el documento se ha cargado correctamente")
    public void el_documento_se_ha_cargado_correctamente() {
        Assert.assertTrue(page.verificarDocCargado());
    }

    @Then("todos los datos se guardan de forma correcta y consistente en la base de datos")
    public void todos_los_datos_se_guardan_de_forma_correcta_y_consistente() {
        Assert.assertTrue(page.verificarConsistenciaDatos());
    }

    @Given("el documento se ha cargado y registrado en la base de datos")
    public void el_documento_se_ha_cargado_y_registrado_en_la_base_de_datos() {
       Assert.assertTrue(page.verificarInsercionBD());
    }

    @When("se realiza una consulta SQL para verificar el documento")
    public void se_realiza_una_consulta_SQL_para_verificar_el_documento() {
        page.realizarConsultaSQL();
    }

    @Then("el documento y sus metadatos aparecen en los resultados de la consulta")
    public void el_documento_y_sus_metadatos_aparecen_en_los_resultados_de_la_consulta() {
        Assert.assertTrue(page.verificarConsultaSQL());
    }
}