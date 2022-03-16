package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Acciones {
    
    public static void abrirUrl(WebDriver driver, String url){
        driver.navigate().to(url);
    }

    public static void click(WebDriver driver, By mapeo){
        driver.findElement(mapeo).click();
    }

    public static void escribir(WebDriver driver, By mapeo, String dato){
        driver.findElement(mapeo).sendKeys(dato);

    }

    public static void iframe (WebDriver driver, By mapeo, String identificador) {
        driver.switchTo().frame(identificador);
        driver.findElement(mapeo).click();
    }
    
}
