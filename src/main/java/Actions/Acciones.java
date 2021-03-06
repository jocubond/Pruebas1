package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Acciones {

    public static void abrirUrl(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public static void click(WebDriver driver, By mapeo) {
        driver.findElement(mapeo).click();
    }

    public static void escribir(WebDriver driver, By mapeo, String dato) {
        driver.findElement(mapeo).sendKeys(dato);

    }

}
