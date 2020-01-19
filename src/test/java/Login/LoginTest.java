package Login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test
    public void loginSuccessfull(){
        LoginPage loginPage= homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!"));
    }

}
