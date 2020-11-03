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

    @Test
    public void SearchInformationAndAddingToListTest() {
        app.getSearchHelper().clickOnInputForm();
        app.getSearchHelper().fillInputForm("Appium");
        app.getSearchHelper().clickOnArticle();
        //app.getSearchHelper().addArticleToList();

        Assert.assertTrue(app.getSearchHelper().isInputPresent());
    }

    @Test
    public void SearchInformationAndDeletingArticleFromListTest() {
        app.getSearchHelper().clickOnInputForm();
        app.getSearchHelper().fillInputForm("Appium");
        app.getSearchHelper().clickOnArticle();
        app.getSearchHelper().addArticleToList();
        app.getSearchHelper().returnToHomePageFromArticle();
        app.getSearchHelper().clickOnReadingListButton();
        app.getSearchHelper().deleteArticle();


        Assert.assertTrue(app.getSearchHelper().isInputPresent());
        Assert.assertTrue(app.getSearchHelper().isArticlePresent());
    }



}
