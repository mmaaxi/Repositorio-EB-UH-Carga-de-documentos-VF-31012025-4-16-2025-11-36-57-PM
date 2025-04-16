package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("el usuario carga un documento con formato correcto y dentro del tamaño permitido")
    public void uploadCorrectDocument() {
        page.uploadDocument();
        Assert.assertTrue("El documento no se cargó correctamente.", page.isDocumentUploaded());
    }

    @When("la operación se completa")
    public void operationCompletes() {
        page.waitForOperationToComplete();
    }

    @Then("el sistema muestra una notificación de éxito en pantalla")
    public void successNotificationIsDisplayed() {
        Assert.assertTrue("La notificación de éxito no se muestra.", page.isSuccessNotificationDisplayed());
    }

    @Then("el email de confirmación es enviado al usuario")
    public void confirmationEmailIsSent() {
        Assert.assertTrue("El email de confirmación no fue enviado.", page.isConfirmationEmailReceived());
    }
}