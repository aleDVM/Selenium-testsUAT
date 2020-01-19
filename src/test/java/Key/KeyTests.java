package Key;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeyTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPresses = homePage.clickKeyPresses();
        keyPresses.enterText("A"+ Keys.SPACE);
        assertEquals(keyPresses.getResult(), "You entered: SPACE");
    }

    @Test
    public void testPi(){
        var key = homePage.clickKeyPresses();
        key.enterPI();
    }
}
