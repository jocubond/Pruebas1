package Util;

import org.openqa.selenium.By;

public class ConstanteRegistrarTutela {

    public static final By TXT_USUARIO = By.xpath("//*[@id=\"txtUsuario\"]");
    public static final By TXT_CONTRASEÑA = By.id("txtPasswd");
    public static final By BTN_IR = By.xpath("//a[@href=\"javascript:autenticar()\"]");
    public static final By OPC_REG_TUTELA = By.xpath("//*[@id=\"ext-gen40\"]/em/span/span");
}