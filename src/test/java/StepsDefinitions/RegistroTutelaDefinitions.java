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


    @Given("^Ingreso el usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void ingresoElUsuarioYContraseña(String usuario, String contraseña) throws InterruptedException {
        regitrarTutela.ingresarDatosDeLogueo(usuario, contraseña);


    }

    @Given("^cargo la ventana de registro de tutela$")
    public void cargoLaVentanaDeRegistroDeTutela() throws InterruptedException {
        regitrarTutela.seleccionarRegistroTutela();
        regitrarTutela.clickBotonRegistro();

    }

    @When("^Completo la informacion principal$")
    public void completoLaInformacionPrincipal() {

    }

    @When("^Agrego sugetos procesales$")
    public void agregoSugetosProcesales() {
    }

    @When("^Cargo documentos$")
    public void cargoDocumentos() {

    }

    @Then("^Envia accion de tutela al despacho$")
    public void enviaAccionDeTutelaAlDespacho() {

    }

}
