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
    public void addReminderWithDatePositiveTest(){
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminder("Holiday");
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future",1,"MAY");
        app.getReminder().selectDate(0);
        app.getReminder().tapOnYear();
        app.getReminder().swipeToYear("future","2025");
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
    Assert.assertTrue(app.getMainScreen().isReminderDatePresent().contains("1/5/2025"));

    }

    @Test
    public void addReminderWithTimerPositivTest(){
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminder("Holiday");
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am",267,926,543,1190);
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderDatePresent().contains("9:30"));
    }
//check Repeat(verify Repeat off)

    @Test
    public void verifyRepeatoffTest(){
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminder("Holiday");
        app.getReminder().switchByButtunOff();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isRepeatOffPresent().contains("Off"));
    }
    //check Repetition Interval(verify "2")
    @Test
    public void verifyRepetitionInterval(){
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminder("Holiday");
        app.getReminder().tapRepetitionInterval();
        app.getReminder().typeHours("3");
        app.getReminder().saveRepetitionInterval();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isElementHoursPresent().contains("3"));
    }

    //check Type of repetition(verify "Week")
}
