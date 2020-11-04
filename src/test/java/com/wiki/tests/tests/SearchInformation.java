package com.wiki.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInformation extends TestBase{

    @Test
    public void SearchInformationTest() throws InterruptedException {
        app.getSearchHelper().clickOnInputForm();
        app.getSearchHelper().fillInputForm("Appium");
        app.getSearchHelper().clickOnArticle();

        Assert.assertTrue(app.getSearchHelper().isInputPresent());
    }

    @Test
    public void SearchInformationAndAddingToListTest() throws InterruptedException {
        app.getSearchHelper().clickOnInputForm();
        app.getSearchHelper().fillInputForm("Australia");
        app.getSearchHelper().clickOnArticle();
        app.getSearchHelper().addArticleToList();
        app.getSearchHelper().returnToHomePageFromArticle();

        Assert.assertFalse(app.getSearchHelper().isInputPresent());
    }

    @Test
    public void DeletArticleFromListTest() throws InterruptedException {
        app.getSearchHelper().clickOnInputForm();
        app.getSearchHelper().fillInputForm("Appium");
        app.getSearchHelper().clickOnArticle();
        app.getSearchHelper().addArticleToList();
        app.getSearchHelper().returnToHomePageFromArticle();
        app.getSearchHelper().clickOnReadingListButton();
        app.getSearchHelper().deleteArticle();


        Assert.assertFalse(app.getSearchHelper().isInputPresent());
    }



}
