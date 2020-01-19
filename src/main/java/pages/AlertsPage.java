package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    private By alert = By.xpath("//*[contains(text(), 'Click for JS Alert')]");
    private By alertConfirm = By.xpath("//*[contains(text(), 'Click for JS Confirm')]");
    private By alertPrompt = By.xpath("//button[contains(text(), 'Click for JS Prompt')]");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlert(){
        driver.findElement(alert).click();
    }

    public void clickPrompt(){ driver.findElement(alertPrompt).click();}

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void clickConfirm(){
        driver.findElement(alertConfirm).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
