package com.github.panarik.seleniumTests.selenium.tests;

import com.github.panarik.seleniumTests.selenium.controller.BaseTest;
import org.testng.annotations.BeforeMethod;

public class FileInputTest extends BaseTest {

    @BeforeMethod
    public void init() {
        driver.get("https://mdbootstrap.com/docs/b4/jquery/forms/file-input");
    }



}