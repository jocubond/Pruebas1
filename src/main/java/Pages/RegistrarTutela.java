package Pages;


import Actions.Acciones;
import net.serenitybdd.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

import static Util.Constante.url_siugj;
import static Util.ConstanteRegistrarTutela.*;

public class RegistrarTutela extends PageObject {


    public void abrirUrlSiugj() {
        Acciones.abrirUrl(getDriver(),url_siugj);

    }

    public void ingresarDatosDeLogueo(String usuario, String contraseña) throws InterruptedException {
        Acciones.escribir(getDriver(), TXT_USUARIO,usuario);
        Acciones.escribir(getDriver(), TXT_CONTRASEÑA,contraseña);
        Acciones.click(getDriver(), BTN_IR);
        Thread.sleep(3000);


    }

    public void seleccionarRegistroTutela() throws InterruptedException {
            Acciones.iframe(getDriver(), OPC_REG_TUTELA,IFRAMES);
            Thread.sleep(3000);
        }

    public void clickBotonRegistro() throws InterruptedException {
        Acciones.iframe(getDriver(), BTN_REGISTRAR_NUEVA_TUTELA,IFRAMES2);
        Thread.sleep(3000);
    }

}

