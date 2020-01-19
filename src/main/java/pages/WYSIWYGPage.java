package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGPage {
    private WebDriver driver;
    private By frame = By.id("mce_0_ifr");
    private By body = By.id("tinymce");
    private By button = By.cssSelector("#mceu_12");

    public WYSIWYGPage(WebDriver driver) {
        this.driver = driver;
    }

    public void decreaseIdentation(){
        driver.findElement(button).click();
    }

    public String getTextEditor(){
        switchFrame();
        String text = driver.findElement(body).getText();
        switchMainArea();
        return text;
    }

    public void clearTextArea(){
        switchFrame();
        driver.findElement(body).clear();
        switchMainArea();
    }

    public void setTextArea(String text){
        switchFrame();
        driver.findElement(body).sendKeys(text);
        switchMainArea();
    }

    private void switchMainArea(){
        driver.switchTo().parentFrame();
    }

    private void switchFrame(){
        driver.switchTo().frame(driver.findElement(frame));
    }
}
