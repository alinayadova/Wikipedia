package com.wiki.tests.tests;

import com.wiki.tests.framework.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;


public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        app.init();
    }

    @AfterSuite(enabled = false)
    public void tearDown(){
        app.stop();
}

}
