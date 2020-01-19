package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class ActionAlertTests extends BaseTests {

    @Test
    public void workingActionAlert(){
        var modal = homePage.clickContextMenu();
        modal.clickSquare();
    }
}
