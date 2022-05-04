package StepsDefinitions;

import Pages.RegistrarTutela;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegistroTutelaDefinitions {

    RegistrarTutela regitrarTutela;

    @Given("^Que tengo mis datos de ingreso$")
    public void queTengoMisDatosDeIngreso() {
        regitrarTutela.abrirUrlSiugj();

    }

    @When("^Ingreso el usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void ingresoElUsuarioYContraseña(String usuario, String contraseña) throws InterruptedException {
        regitrarTutela.ingresarDatosDeLogueo(usuario, contraseña);

    }

    @Then("^compruebo el acceso$")
    public void comprueboElAcceso() {

    }

}
