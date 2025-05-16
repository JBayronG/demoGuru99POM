package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataUser;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

import java.util.List;

public class LoginStepDefinition {

    @Steps
    LoginSteps loginSteps;

    @Given("que estoy en la pagina de Guru99 Demo")
    public void queEstoyEnLaPaginaDeGuru99Demo() {
        loginSteps.openBrowser();
    }

    @When("ingreso mis credenciales")
    public void ingresoMisCredenciales(List<DataUser> data) {
        loginSteps.escribirUsuario(data.get(0).getTxtUser());
        loginSteps.escribirPassword(data.get(0).getTxtPass());
        loginSteps.clicLogin();
    }

    @Then("se visualiza el mensaje")
    public void seVisualizaElMensaje(List<DataUser> data) {
        loginSteps.validarMensaje(data.get(0).getTxtMensaje());
   }
}

