package com.bootcamp.final_project.pages.elements.pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage {
    private By buttonsNav = By.id("item-4");
    private By clickButton = By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By rightClickButton = By.id("rightClickBtn");
    private By doubleClickButton = By.id("doubleClickBtn");
    private By clickMessage = By.id("dynamicClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By doubleClickMessage = By.id("doubleClickMessage");

    public ButtonsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getButtonsNav(){
        return getDriver().findElement(this.buttonsNav);
    }
    public WebElement getClickButton(){
        return getDriver().findElement(this.clickButton);
    }
    public WebElement getRightClickButton(){
        return getDriver().findElement(this.rightClickButton);
    }
    public WebElement getDoubleClickButton(){
        return getDriver().findElement(this.doubleClickButton);
    }
    public WebElement getClickMessage(){
        return getDriver().findElement(this.clickMessage);
    }
    public WebElement getRightClickMessage(){
        return getDriver().findElement(this.rightClickMessage);
    }
    public WebElement getDoubleClickMessage(){
        return getDriver().findElement(this.doubleClickMessage);
    }

    ////////////////////////////// CLICKS /////////////////////////////////
    public void clickButtonsNav(){
        scrollDown();
        getButtonsNav().click();
    }
    public void click() {
        clickButtonsNav();
        getClickButton().click();
    }
    public void rightClick(){
        clickButtonsNav();
        refreshPage();
        waitRightClick();
        getActions().contextClick(getRightClickButton()).perform();
    }
    public void doubleClick(){
        clickButtonsNav();
        refreshPage();
        waitDoubleClick();
        getActions().doubleClick(getDoubleClickButton()).perform();
    }

    ////////////////////////////// GET MESSAGES /////////////////////////////////
    public String getClickMessageText(){
        return getClickMessage().getText();
    }
    public String getRightClickMessageText(){
        return getRightClickMessage().getText();
    }
    public String getDoubleClickMessageText(){
        return getDoubleClickMessage().getText();
    }

    ////////////////////////////// WAITERS /////////////////////////////////
    public void waitDoubleClick(){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(this.doubleClickButton));
    }
    public void waitRightClick(){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(this.rightClickButton));
    }

    ////////////////////////////// SCROLL /////////////////////////////////
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
    }
}
