package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDOMPage {
    private WebDriver driver;
    private By table1 = By.id("large-table");

    public LargeDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollTable(){
        WebElement tableElement = driver.findElement(table1);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
        tableElement.click();
    }
}
