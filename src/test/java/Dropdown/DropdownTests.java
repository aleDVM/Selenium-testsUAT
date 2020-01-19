package Dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropdown = homePage.clickDropdownlist();
        String option = "Option 1";
        dropdown.selectFromDropdown(option);
        var selectedOptions = dropdown.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1, "bad number of selections");
        Assert.assertTrue(dropdown.getSelectedOption().contains(option), "option not selected");
    }
}
