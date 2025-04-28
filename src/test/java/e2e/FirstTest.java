package e2e;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void loginTest() {
        //Primero necesitamos generar el Driver de Selenium e instanciarlo 
        ChromeDriver web = new ChromeDriver();
        //Para maximizar la ventana del navegador
        web.manage().window().maximize(); 
        web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Esperar 10 segundos a que cargue la página
        web.get("https://saucedemo.com");

        //Para coger un elemento por su selector
        WebElement usernameInput = web.findElement(By.cssSelector("input[data-test='username']"));
        usernameInput.sendKeys("standard_user");

        WebElement passwordInput = web.findElement(By.cssSelector("input[data-test='password']"));
        passwordInput.sendKeys("secret_sauce");

        WebElement loginButton = web.findElement(By.id(("login-button")));
        loginButton.click();

        WebElement productList = web.findElement(By.cssSelector("[data-test='inventory-list']"));
        Boolean isProductListVisible = productList.isDisplayed();
        Assertions.assertTrue(isProductListVisible);
        System.out.println("TEST PASSED");
        
        //Para cerrar el navegador al finalizar la prueba
        // web.quit();
    }
}