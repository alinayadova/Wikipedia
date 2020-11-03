package com.wiki.tests.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHelper extends HelperBase{
    public SearchHelper(AppiumDriver driver) {
        super(driver);

    }
    public void clickOnInputForm() {
        click(By.id("search_container"));
    }

    public void fillInputForm(String text) {
        waitForElementAndType(By.id("search_src_text"), 5, text);
    }

    public void clickOnArticle() {

       // waitForElementAndClick(By.id("fragment_feed_header"),5 );
        click(By.id("fragment_feed_header"));
    }


    public boolean isInputPresent() {
        return isElementPresent(By.id("fragment_feed_header"));
    }

    public void addArticleToList() {
     //   driver.findElementByAccessibilityId("Add this article to a reading list").click();
        waitForElementAndClick(By.id("page_actions_tab_layout"), 20);
        if(! isArticlePresent()){
            click(By.id("onboarding_button"));
            click(By.id("button1"));

        }
        click(By.id("item_container"));

    }

    public void clickOnReadingListButton() {
        click(By.id("icon"));
        click(By.id("item_container"));
    }

    public void deleteArticle() {
        moveElementToLeft(By.id("page_list_item_container"));
    }


    public void returnToHomePageFromArticle() {
        waitForElement(By.id("page_web_view"), 20);
        click(By.id("page_toolbar"));
    }

    public boolean isArticlePresent(){
        waitForElement(By.id("page_web_view"), 20);
        return isElementPresent(By.id("page_web_view"));
    }

}

