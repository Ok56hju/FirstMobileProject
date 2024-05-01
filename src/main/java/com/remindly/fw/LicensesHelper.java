package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class LicensesHelper extends BaseHelper{
    public LicensesHelper(AppiumDriver driver) {
        super(driver);
    }

    public String isLicensesPresent() {
        return driver.findElement(By.id("com.blanyal.remindly:id/licenses_text_view")).getText();
    }

}
