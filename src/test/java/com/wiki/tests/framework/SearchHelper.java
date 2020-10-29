package com.wiki.tests.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SearchHelper extends HelperBase{
    public SearchHelper(AppiumDriver driver) {
        super(driver);

    }
    public void clickOnInputForm() {
        click(By.id("search_container"));
    }

    public void fillInputForm(String text) {
        waitForElementAndType(By.id("search_src_text"), 3, text);
    }

    public void clickOnArticle() {
        click(By.id("search_container"));
    }


    public boolean isInputPresent() {
        return isElementPresent(By.id("search_container"));
    }
}
