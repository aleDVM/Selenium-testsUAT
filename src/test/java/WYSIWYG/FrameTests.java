package WYSIWYG;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FrameTests extends BaseTests {
    @Test
    public void validateFrame(){
        var frame = homePage.clickFrame();
        frame.clickLink();
        frame.switchFrameLeft();
        String textLeft = frame.getTextLeft();
        System.out.println(textLeft);
        frame.switchMainFrame();
        frame.switchMainFrame();
        frame.switchFrameBottom();
        String left = "LEFT";
        String textBottom = frame.getTextBottom();
        String bottom = "BOTTOM";
        System.out.println(textBottom);
        assertEquals("no es igual el texto de la izquierda esperado",textLeft, left);
        assertEquals(textBottom, bottom);
    }

}
