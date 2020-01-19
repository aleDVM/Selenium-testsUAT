package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    private WebDriver driver;

    private By email = By.id("email");
    private By btnEmail = By.id("form_submit");


    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(){
        driver.findElement(email).sendKeys("ejemplo@gmail.com");
    }

    public EmailResponsePage clickForwardEmail(){
        driver.findElement(btnEmail).click();
        return new EmailResponsePage(driver);
    }
}
