package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DinamicLoadPage {
    private WebDriver driver;
    private By start = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By text = By.id("finish");
    private By text2 = By.xpath("//*[@id='finish']/h4");

    public DinamicLoadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void FluentWaitExample2(){
        driver.findElement(start).click();
        FluentWait fluent = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(8))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        fluent.until(ExpectedConditions.presenceOfAllElementsLocatedBy(text2));

        System.out.println("despues fluent");
    }

    public void waitForText(){
        driver.findElement(start).click();
       // WebDriverWait wait = new WebDriverWait(driver, 5);
       // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        FluentWait fluent = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluent.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }

    public String getLoadedText(){
        return driver.findElement(text).getText();
    }
}
