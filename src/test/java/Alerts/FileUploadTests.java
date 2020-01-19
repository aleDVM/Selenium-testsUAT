package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class FileUploadTests extends BaseTests {
    @Test
    public void TestFileUpload(){
        var file = homePage.clickUploadFile();
        file.uploadFile("/home/hatshep/IdeaProjects/selenium2/resources/chromedriver");
        assertEquals(file.getUploadFile(), "chromedriver");
    }
}
