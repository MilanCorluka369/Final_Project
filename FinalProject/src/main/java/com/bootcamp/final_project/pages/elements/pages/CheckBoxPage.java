package com.bootcamp.final_project.pages.elements.pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage {
    private By checkBoxNav = By.id("item-1");
    private By homeCheckBox = By.xpath("//*[@id='tree-node']/ol/li/span/label/span[3]");
    private By extendArrow1 = By.xpath("//*[@id='tree-node']/ol/li/span/button");
    private By extendArrow2 = By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button");
    private By notesCheckBox = By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]");
    private By message = By.id("result");

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getCheckBoxNav(){
        return getDriver().findElement(this.checkBoxNav);
    }
    public WebElement getHomeCheckBox(){
        return getDriver().findElement(this.homeCheckBox);
    }
    public WebElement getMessage(){
        return getDriver().findElement(this.message);
    }
    public WebElement getExtendArrow1(){
        return getDriver().findElement(this.extendArrow1);
    }
    public WebElement getExtendArrow2(){
        return getDriver().findElement(this.extendArrow2);
    }
    public WebElement getNotesCheckBox(){
        return getDriver().findElement(this.notesCheckBox);
    }
    ////////////////////////////// CLICKS /////////////////////////////////
    public void clickCheckBoxNav(){
        getCheckBoxNav().click();
    }

    public void clickHomeCheckBox(){
        getHomeCheckBox().click();
    }

    public void clickNotesCheckBox(){
        getNotesCheckBox().click();
    }
    public void clickHomeExtendArrow(){
        getExtendArrow1().click();
    }
    public void clickDesktopExtendArrow(){
        getExtendArrow2().click();
    }

    ////////////////////////////// CHECK BOX METHODS /////////////////////////////////
    public void checkBoxHome(){
        clickCheckBoxNav();
        clickHomeCheckBox();
        clickHomeExtendArrow();
    }

    public void checkBoxNotes(){
        clickCheckBoxNav();
        clickHomeExtendArrow();
        clickDesktopExtendArrow();
        clickNotesCheckBox();
    }

    ////////////////////////////// CHECKS /////////////////////////////////
    public boolean isMessageDisplayed(){
        return getMessage().isDisplayed();
    }

    public String messageText(){
        return getMessage().getText();
    }
}
