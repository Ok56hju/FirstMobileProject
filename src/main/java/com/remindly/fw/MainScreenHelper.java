package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class MainScreenHelper extends BaseHelper{
    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isRemindTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isRemindTitletPresent() {
        return driver.findElement(By.id("recycle_title")).getText();
    }


    public String isReminderDatePresent() {
      return driver.findElement(By.id("recycle_date_time")).getText();
    }

    public String isRepeatOffPresent() {
        return driver.findElement(By.id("com.blanyal.remindly:id/recycle_repeat_info")).getText();
    }

    public String isElementHoursPresent() {
        return driver.findElement(By.id("com.blanyal.remindly:id/recycle_repeat_info")).getText();
    }
}
