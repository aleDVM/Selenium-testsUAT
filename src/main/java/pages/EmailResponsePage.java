package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EmailResponsePage {
    private WebDriver driver;
    private By msg = By.id("content");

    public EmailResponsePage(WebDriver driver) {
        this.driver = driver;
    }

    public String Response(){
        String response = driver.findElement(msg).getText();
        System.out.println(response);
        return response;
    }
}
