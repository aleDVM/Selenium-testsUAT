package utils;

import org.openqa.selenium.WebDriver;

import java.lang.ref.SoftReference;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack(){
        navigation.back();
    }

    public void refresh(){
        navigation.refresh();
    }

    public void goToUrl(String url){
        navigation.to(url);
    }

    public  void goForward(){
        navigation.forward();
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("number of windows: "+windows.size());

        windows.forEach(System.out::println);
        for(String window: windows){
            driver.switchTo().window(window);
            System.out.println("windows ttle: "+driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
        System.out.println("nueva ventana");
    }
}
