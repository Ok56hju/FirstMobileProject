package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ReminderHelper extends BaseHelper{
    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterReminder(String title) {
        type(By.id("reminder_title"),title);
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }

    public void tapOnElementButton() {
        tap(By.className("android.support.v7.widget.as"));
    }

    public void tapOnLicensesButtun() {
        tap(By.className("android.widget.RelativeLayout"));
    }
}
