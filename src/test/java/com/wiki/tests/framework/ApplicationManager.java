package com.wiki.tests.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
    public AppiumDriver driver;
    DesiredCapabilities capabilities;

    SearchHelper searchHelper;

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android" );
        capabilities.setCapability("deviceName", "Samsung_Galaxy_S6_1");
        capabilities.setCapability("platformVersion","6.0" );
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", "main.MainActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "D:\\QA\\APK\\org.wikipedia (1).apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        searchHelper = new SearchHelper(driver);
    }

    public void stop(){
        driver.quit();
    }


    public SearchHelper getSearchHelper() {
        return searchHelper;
    }
}
