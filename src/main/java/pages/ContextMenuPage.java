package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

import static org.testng.AssertJUnit.assertEquals;

public class ContextMenuPage {
    private WebDriver driver;
    private By cuadrado = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSquare(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(cuadrado)).perform();
        alertMsg();
        System.out.println("pasa");
    }

    public void alertMsg(){
        assertEquals(driver.switchTo().alert().getText(), "You selected a context menu");
        driver.switchTo().alert().accept();
    }
}
