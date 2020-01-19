package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("input");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(){
        driver.findElement(slider).click();
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }


}
