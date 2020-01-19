package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By submit = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmit(){driver.findElement(submit).click();}

    public void uploadFile(String path){
        driver.findElement(inputField).sendKeys(path);
        clickSubmit();
    }

    public String getUploadFile(){
        return driver.findElement(uploadedFile).getText();
    }
}
