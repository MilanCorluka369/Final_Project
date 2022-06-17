package com.bootcamp.final_project.pages.alerts_frame_windows_pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage {
    private By alertsNav = By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");
    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmAlertButton = By.id("confirmButton");
    private By promptAlertButton = By.id("promtButton");
    private By confirmMessage = By.id("confirmResult");
    private By promptMessage = By.id("promptResult");

    public AlertsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getAlertsNav(){
        return getDriver().findElement(this.alertsNav);
    }
    public WebElement getAlertButton(){
        return getDriver().findElement(this.alertButton);
    }
    public WebElement getTimerAlertButton(){
        return getDriver().findElement(this.timerAlertButton);
    }
    public WebElement getConfirmAlertButton(){
        return getDriver().findElement(this.confirmAlertButton);
    }
    public WebElement getPromptAlertButton(){
        return getDriver().findElement(this.promptAlertButton);
    }
    public WebElement getConfirmMessage(){
        return getDriver().findElement(this.confirmMessage);
    }
    public WebElement getPromptMessage(){
        return getDriver().findElement(this.promptMessage);
    }

    ////////////////////////////// CLICKS /////////////////////////////////
    public void clickAlertNav(){
        getActions().moveToElement(getAlertsNav()).click().perform();
    }
    public void clickAlertButton(){
        getAlertButton().click();
    }
    public void clickTimerAlertButton(){
        getTimerAlertButton().click();
    }
    public void clickConfirmAlertButton(){
        getConfirmAlertButton().click();
    }
    public void clickPromptAlertButton(){
        getPromptAlertButton().click();
    }

    ////////////////////////////// ALLERT ACTIONS /////////////////////////////////
    public void promptText(String name){
        getDriver().switchTo().alert().sendKeys(name);
    }
    public String getAlertText(){
        return getDriver().switchTo().alert().getText();
    }
    public void closeAlert(){
        getDriver().switchTo().alert().accept();
    }

    ////////////////////////////// ALLERT METHODS /////////////////////////////////
    public void clickToSeeAlert() {
        clickAlertNav();
        clickAlertButton();
    }

    public void clickTimerAlert(){
        clickAlertNav();
        clickTimerAlertButton();
        waitAlert();
    }
    public void clickConfirmAlert(){
        clickAlertNav();
        clickConfirmAlertButton();
        closeAlert();
    }

    public void clickPromptAlert(String name){
        clickAlertNav();
        clickPromptAlertButton();
        promptText(name);
        closeAlert();
    }
    ////////////////////////////// GET MESSAGES /////////////////////////////////
    public String confirmMessageText(){
        return getConfirmMessage().getText();
    }
    public String promptMessageText(){
        return getPromptMessage().getText();
    }

    ////////////////////////////// WAITERS /////////////////////////////////
    public void waitAlert(){
        getDriverWait().until(ExpectedConditions.alertIsPresent());
    }
}
