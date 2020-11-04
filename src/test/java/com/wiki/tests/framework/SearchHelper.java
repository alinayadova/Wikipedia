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

    public void clickOnArticle() throws InterruptedException {
        click(By.id("fragment_feed_header"));
        Thread.sleep(10000);
    }

    public boolean isInputPresent() {
        return isElementPresent(By.id("search_toolbar"));
    }

    public void addArticleToList() {
        //click on add button
        click(By.xpath("//*[@content-desc='Add this article to a reading list']"));
        if (!isGotItButtonPresent()) {
            //create new list
            if (!isListExist()) {
                click(By.id("create_button"));
            }
            //or add in exist list
            else {
                click(By.id("item_container"));
            }
        } else {
            click(By.id("onboarding_button"));
            waitForElementAndType(By.id("text_input"), 10, "My Articles");
            click(By.xpath("//*[@resource-id='android:id/button1']"));
        }

    }


    public boolean isGotItButtonPresent(){
        waitForElement(By.id("onboarding_button"), 20);
        return isElementPresent(By.id("onboarding_button"));
    }

    public boolean isListExist(){
        return isElementPresent(By.id("item_container"));
    }

    public void clickOnReadingListButton() {
        waitForElementAndClick(By.xpath("//*[@content-desc='My lists']"), 10);
        click(By.xpath("//*[@resource-id='org.wikipedia:id/item_container']"));
    }

    public void deleteArticle() {
        moveElementToLeft(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_container']"));
    }

    public void returnToHomePageFromArticle() {
        waitForElement(By.xpath("//*[@content-desc='Navigate up']"), 10);
        click(By.xpath("//*[@content-desc='Navigate up']"));
    }

}

