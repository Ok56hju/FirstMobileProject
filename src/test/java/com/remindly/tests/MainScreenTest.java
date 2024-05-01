package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTest extends TestBase{
    //confirm ok
@BeforeMethod
    public void precondition(){
    app.getMainScreen().confirm();
}
// verify text
    @Test
    public void appLauchTest(){
    Assert.assertTrue(app.getMainScreen().isRemindTextPresent());
 }
    @Test
    public void isLicensesPresent(){
        app.getReminder().tapOnElementButton();
        app.getReminder().tapOnLicensesButtun();
        Assert.assertTrue(app.getLicenses().isLicensesPresent().contains("NOTICES FOR LIBRARIES"));
    }

}
