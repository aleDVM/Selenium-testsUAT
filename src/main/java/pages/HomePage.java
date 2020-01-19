package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LargeDOMPage clickLargeDOM(){
        clickLink("Large & Deep DOM");
        return new LargeDOMPage(driver);
    }

    public  MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return  new MultipleWindowsPage(driver);
    }



    public JSDropdownPage clickdropdown(){
        clickLink("Dropdown");
        return new JSDropdownPage(driver);
    }
    public InfiniteScrollPage clickInfinite(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public ModalPage clickModal(){
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    public ExplicitWaitPage clickExplicitWait(){
        clickLink("Dynamic Loading");
        return  new ExplicitWaitPage(driver);
    }

    public WYSIWYGPage clickwysiwig(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGPage(driver);
    }

    public IframePage clickFrame(){
        clickLink("Frames");
        return new IframePage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownlist(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public AlertsPage clickAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickUploadFile(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
}
