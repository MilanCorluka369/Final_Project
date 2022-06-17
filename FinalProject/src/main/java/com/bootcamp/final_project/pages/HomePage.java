package com.bootcamp.final_project.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class HomePage extends BasePage{
    private By elementCard = By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]");
    private By alertsCard = By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]/div/div[1]");

    public HomePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getElementCard(){
        return getDriver().findElement(this.elementCard);
    }
    public WebElement getAlertsCard() {
        return getDriver().findElement(this.alertsCard);
    }

    ///////////////////////////// CLICKS /////////////////////////////////
    public void clickOnElementsCard(){
        getActions().moveToElement(getElementCard()).click().perform();
    }
    public void clickOnAlertsCard() {
        getActions().moveToElement(getAlertsCard()).click().perform();
    }
}
