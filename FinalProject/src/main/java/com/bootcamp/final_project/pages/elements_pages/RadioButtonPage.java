package com.bootcamp.final_project.pages.elements_pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage {
    public By radioButtonNav = By.id("item-2");
    public By yesRadio = By.xpath("//label[@for='yesRadio']");
    public By impressiveRadio = By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label");
    public By message = By.xpath("//p[@class='mt-3']");
    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getRadioButtonNav(){
        return getDriver().findElement(this.radioButtonNav);
    }
    public WebElement getYesRadio(){
        return getDriver().findElement(this.yesRadio);
    }
    public WebElement getImpressiveRadio(){
        return getDriver().findElement(this.impressiveRadio);
    }
    public WebElement getMessage(){
        return getDriver().findElement(this.message);
    }

    ////////////////////////////// CLICKS /////////////////////////////////
    public void clickRadioButtonNav(){
        getRadioButtonNav().click();
    }
    public void clickYesRadio(){
        getYesRadio().click();
    }
    public void clickImpressiveRadio(){
        getImpressiveRadio().click();
    }

    ////////////////////////////// RADIO BUTTON METHODS /////////////////////////////////
    public void clickRadioButtonYes(){
        clickRadioButtonNav();
        clickYesRadio();
    }
    public void clickRadioButtonImpressive(){
        clickRadioButtonNav();
        clickImpressiveRadio();
    }

    ////////////////////////////// CHECKS /////////////////////////////////
    public boolean isYesButtonSelected(){
        return getYesRadio().isSelected();
    }
    public boolean isImpressiveButtonSelected(){
        return getImpressiveRadio().isSelected();
    }
    public boolean isCorrectMessageDisplayed(String message){
        return getMessage().getText().contains(message);
    }
}
