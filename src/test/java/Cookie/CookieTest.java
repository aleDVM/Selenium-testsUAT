package Cookie;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CookieTest extends BaseTests {
   @Test
    public void deleteCookie(){
       var hover = homePage.clickHovers();
       deleteACookie("optimizelyBuckets");
   }

}
