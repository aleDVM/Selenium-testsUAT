package Javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class scrollTest extends BaseTests {
    @Test
    public void testScroll(){
        var scroll = homePage.clickInfinite();
        scroll.scrollToParagraph(5);
    }
}
