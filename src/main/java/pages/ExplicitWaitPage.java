package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class ExplicitWaitPage {
    private WebDriver driver;
    private By link1 = By.linkText("Example 1: Element on page that is hidden");
    private By link2 = By.linkText("Example 2: Element rendered after the fact");

    public ExplicitWaitPage(WebDriver driver) {
        this.driver = driver;
    }

    public DinamicLoadPage clickLink(){
        driver.findElement(link1).click();
        return new DinamicLoadPage(driver);
    }

    public DinamicLoadPage clickExample2(){
        driver.findElement(link2).click();
        return new DinamicLoadPage(driver);
    }

    public void openNewTabWithMouse(){
        Actions action = new Actions(driver);
        driver.findElement(link2).sendKeys(Keys.CONTROL, Keys.RETURN);
        System.out.println("safas");
        System.out.println("nasfsa");
    }

}
