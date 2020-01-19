package Alerts;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAceptAlert(){
        var alert = homePage.clickAlert();
        alert.clickAlert();
        alert.acceptAlert();
        alert.getResult();
        assertEquals(alert.getResult(), "You successfuly clicked an alert");
    }

    @Test
    public void getAlertText() throws InterruptedException {
        var confirm = homePage.clickAlert();
        confirm.clickConfirm();
        confirm.getAlertText();
        assertEquals(confirm.getAlertText(), "I am a JS Confirm");
        confirm.dismissAlert();
    }

    @Test
    public void setInputAlert(){
        var prompt = homePage.clickAlert();
        prompt.clickPrompt();
        String text = "Probando el caso";
        prompt.alert_setInput(text);
        prompt.acceptAlert();
        assertEquals(prompt.getResult(), "You entered: "+text);
    }
}
