package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage {
    private WebDriver driver;
    private By frameLeft = By.xpath("//*[1]/frameset[@name='frameset-middle' ]//following::frame");
    private By frameTop = By.name("frame-top");

    private By frameBottom = By.name("frame-bottom");
    private By text = By.tagName("body");
    private By link = By.linkText("Nested Frames");

    public IframePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(){
        driver.findElement(link).click();
    }

    public String getTextLeft(){
        return driver.findElement(text).getText();
    }

    public String getTextBottom(){
        return driver.findElement(text).getText();
    }

    public void switchMainFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchFrameLeft( ){
        System.out.println("antes del switch");
        driver.switchTo().frame(driver.findElement(frameTop));
        driver.switchTo().frame(driver.findElement(frameLeft));
        System.out.println("se cambia al izquierdo");
    }

    public void switchFrameBottom( ){

        driver.switchTo().frame(driver.findElement(frameBottom));
        System.out.println("se cambia al de abajo");
    }

}
