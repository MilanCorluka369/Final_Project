package com.bootcamp.final_project.pages.alerts_frame_windows_pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BrowserWindowsPage extends BasePage {
    private By browserWindowsNav =
            By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]");
    private By newTabButton = By.id("tabButton");
    private By newWindowButton = By.id("windowButton");
    private By newWindowMessageButton = By.id("messageWindowButton");
    private By sampleHeading = By.id("sampleHeading");
    private By newWindowText = By.xpath("/html/body/text()");

    public BrowserWindowsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getBrowserWindowsNav(){
        return getDriver().findElement(this.browserWindowsNav);
    }
    public WebElement getNewTabButton(){
        return getDriver().findElement(this.newTabButton);
    }
    public WebElement getNewWindowButton(){
        return getDriver().findElement(this.newWindowButton);
    }
    public WebElement getNewWindowMessageButton(){
        return getDriver().findElement(this.newWindowMessageButton);
    }
    public WebElement getSampleHeading(){
        return getDriver().findElement(this.sampleHeading);
    }
    public WebElement getNewWindowText(){
        return getDriver().findElement(this.newWindowText);
    }

    ////////////////////////////// CLIKS /////////////////////////////////
    public void clickBrowserWindowsNav(){
        getBrowserWindowsNav().click();
    }
    public void clickNewTabButton(){
        getNewTabButton().click();
    }
    public void clickNewWindowButton(){
        getNewWindowButton().click();
    }
    public void clickNewWindowMessageButton(){
        getNewWindowMessageButton().click();
    }

    ////////////////////////////// CHECKS /////////////////////////////////
    public String getText() {
        return getSampleHeading().getText();
    }
    public String getWindowMessage(){
        return getNewWindowText().getText();
    }

    ////////////////////////////// NAVIGATION METHODS /////////////////////////////////
    public void navigateToNewTab() {
        clickBrowserWindowsNav();
        clickNewTabButton();

        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        waitMessage();
    }
    public void navigateToNewWindow() {
        clickBrowserWindowsNav();
        clickNewWindowButton();

        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }
    public void navigateToNewWindowMessage() {
        clickBrowserWindowsNav();
        clickNewWindowMessageButton();

        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }

    public void closeWindow(){
        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        getDriver().close();
        getDriver().switchTo().window(tabs.get(0));
    }

    ////////////////////////////// WAITERS /////////////////////////////////
    public void waitMessage(){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(this.sampleHeading));
    }
    public void waitBody(){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(this.newWindowText));
    }
}
