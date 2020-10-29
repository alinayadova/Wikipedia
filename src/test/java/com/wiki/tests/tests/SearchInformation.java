package com.wiki.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInformation extends TestBase{

    @Test
    public void SearchInformationTest(){
        app.getSearchHelper().clickOnInputForm();
        app.getSearchHelper().fillInputForm("Appium");
        app.getSearchHelper().clickOnArticle();

        Assert.assertTrue(app.getSearchHelper().isInputPresent());
    }

}
