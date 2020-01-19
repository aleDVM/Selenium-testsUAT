package wait;

import base.BaseTests;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void getText(){
        var dinamic = homePage.clickExplicitWait();
        var dinamicLoading = dinamic.clickLink();
        dinamicLoading.waitForText();
        var text = dinamicLoading.getLoadedText();
        assertEquals(text, "Hello World!");
    }

    @Test
    public void getTextExample2(){
        var dinamic = homePage.clickExplicitWait();
        var dinLoad = dinamic.clickExample2();
        dinLoad.FluentWaitExample2();

        assertEquals(dinLoad.getLoadedText(), "Hello World!");
    }
}
