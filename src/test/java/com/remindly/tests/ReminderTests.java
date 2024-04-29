package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        app.getMainScreen().confirm();
    }

    @Test
    public void addReminderTitlePositiveTest(){

        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminder("Holiday");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isRemindTitletPresent().contains("Holiday"));
    }

    @Test
    public void isLicensesPresent(){
        app.getReminder().tapOnElementButton();
        app.getReminder().tapOnLicensesButtun();
        Assert.assertTrue(app.getLicenses().isLicensesPresent().contains("NOTICES FOR LIBRARIES"));

    }
}
