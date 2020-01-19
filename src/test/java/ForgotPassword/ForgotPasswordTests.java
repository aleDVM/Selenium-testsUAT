package ForgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForwardPass(){
        var forgotpass = homePage.clickForgotPassword();
        String msg = "Your e-mail's been sent!";
        forgotpass.setEmail();
        var resp = forgotpass.clickForwardEmail();
        Assert.assertEquals(msg, resp.Response());
    }
}
