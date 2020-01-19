package Slider;

import base.BaseTests;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {

    @Test
    public void moveSliderTest(){
        var slider = homePage.clickHorizontalSlider();
        slider.moveSlider();
        System.out.println("si");
    }
}
