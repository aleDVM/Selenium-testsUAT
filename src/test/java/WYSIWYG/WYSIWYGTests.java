package WYSIWYG;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WYSIWYGTests extends BaseTests {
    @Test
    public void writeText(){
        var wysi = homePage.clickwysiwig();
        wysi.clearTextArea();
        String text1 = "Hello ";
        String text2 = "world";
        wysi.setTextArea(text1);
        wysi.decreaseIdentation();
        wysi.setTextArea(text2);
        assertEquals(wysi.getTextEditor(), text1+text2);
    }
}
