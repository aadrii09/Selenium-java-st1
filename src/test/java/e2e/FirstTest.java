package e2e;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void loginTest() {
        //Primero necesitamos generar el Driver de Selenium e instanciarlo 
        ChromeDriver web = new ChromeDriver();
        //Para maximizar la ventana del navegador
        web.manage().window().maximize(); 

        web.get("https://saucedemo.com");

        //Para cerrar el navegador al finalizar la prueba
        // web.quit();
    }
}