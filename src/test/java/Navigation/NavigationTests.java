package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void navigationTest(){
        homePage.clickHorizontalSlider().moveSlider();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goToUrl("https://www.google.com");
        getWindowManager().refresh();
    }

    @Test
    public void switchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void openNewTab(){
        var dinamic = homePage.clickExplicitWait();
        dinamic.openNewTabWithMouse();
        getWindowManager().switchNewTab();
    }
}
