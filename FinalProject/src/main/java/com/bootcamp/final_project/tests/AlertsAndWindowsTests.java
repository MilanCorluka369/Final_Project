package com.bootcamp.final_project.tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AlertsAndWindowsTests extends BaseTest{

    @Test (priority = 1)
    public void testNewTabFunctionality() {
        getHomePage().clickOnAlertsCard();
        getBrowserWindowsPage().navigateToNewTab();
        Assert.assertEquals(getBrowserWindowsPage().getText(), "This is a sample page");
        getBrowserWindowsPage().closeWindow();
    }

    @Test (priority = 2)
    public void testNewWindowFunctionality(){
        getHomePage().clickOnAlertsCard();
        getBrowserWindowsPage().navigateToNewWindow();
        Assert.assertEquals(getBrowserWindowsPage().getText(), "This is a sample page");
        getBrowserWindowsPage().closeWindow();
    }

    @Test (priority = 3)
    @Ignore
    public void testNewWindowMessage() {
        getHomePage().clickOnAlertsCard();
        getBrowserWindowsPage().navigateToNewWindowMessage();
        Assert.assertEquals(getBrowserWindowsPage().getWindowMessage(), "Knowledge increases by " +
                "sharing but not by saving. Please share this website with your friends and in your organization.");
        getBrowserWindowsPage().closeWindow();
    }

    @Test (priority = 4)
    public void testSeeAlertFunctionality() {
        getHomePage().clickOnAlertsCard();
        getAlertsPage().clickToSeeAlert();
        Assert.assertEquals(getAlertsPage().getAlertText(), "You clicked a button");
        getAlertsPage().closeAlert();
    }

    @Test (priority = 5)
    public void testTimerAlertFunctionality() {
        getHomePage().clickOnAlertsCard();
        getAlertsPage().clickTimerAlert();
        Assert.assertEquals(getAlertsPage().getAlertText(), "This alert appeared after 5 seconds");
        getAlertsPage().closeAlert();
    }

    @Test (priority = 6)
    public void testConfirmAlertFunctionality() {
        getHomePage().clickOnAlertsCard();
        getAlertsPage().clickConfirmAlert();
        Assert.assertEquals(getAlertsPage().confirmMessageText(), "You selected Ok");
    }

    @Test (priority = 7)
    public void testPromptAlertFunctionality() {
        getHomePage().clickOnAlertsCard();
        getAlertsPage().clickPromptAlert("Milan");
        Assert.assertEquals(getAlertsPage().promptMessageText(), "You entered Milan");
    }

    @Test (priority = 8)
    public void testSmallModalFunctionality(){
        getHomePage().clickOnAlertsCard();
        getModalPage().smallModal();
        Assert.assertEquals(getModalPage().smallModalText(), "This is a small modal. It has very less content");
        Assert.assertEquals(getModalPage().smallModalTitleText(), "Small Modal");
        getModalPage().clickCloseSmallModalBtn();
    }

    @Test (priority = 9)
    public void testLargeModalFunctionality(){
        getHomePage().clickOnAlertsCard();
        getModalPage().largeModal();
        Assert.assertTrue(getModalPage().largeModalText("Lorem Ipsum is simply dummy text of the printing and " +
                "typesetting industry."));
        Assert.assertEquals(getModalPage().largeModalTitleText(), "Large Modal");
        getModalPage().clickCloseLargeModalBtn();
    }
}
