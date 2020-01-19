package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By scroll = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var js = (JavascriptExecutor)driver;
        while (getNumberOfParagraph() < index){
            js.executeScript(script);
        }
    }

    private int getNumberOfParagraph(){
        return driver.findElements(scroll).size();
    }
}
