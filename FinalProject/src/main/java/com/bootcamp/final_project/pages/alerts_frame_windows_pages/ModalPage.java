package com.bootcamp.final_project.pages.alerts_frame_windows_pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage extends BasePage {
    private By modalDialogsNav =
            By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[5]");
    private By smallModalBtn = By.id("showSmallModal");
    private By largeModalBtn = By.id("showLargeModal");
    private By closeSmallModalBtn = By.id("closeSmallModal");
    private By closeLargeModalBtn = By.id("closeLargeModal");
    private By modalBody = By.xpath("//*[@class='modal-body']");
    private By smallModalTitle = By.id("example-modal-sizes-title-sm");
    private By largeModalTitle = By.id("example-modal-sizes-title-lg");
    public ModalPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getModalDialogsNav(){
        return getDriver().findElement(this.modalDialogsNav);
    }
    public WebElement getSmallModalBtn(){
        return getDriver().findElement(this.smallModalBtn);
    }
    public WebElement getLargeModalBtn(){
        return getDriver().findElement(this.largeModalBtn);
    }
    public WebElement getCloseSmallModalBtn(){
        return getDriver().findElement(this.closeSmallModalBtn);
    }
    public WebElement getCloseLargeModalBtn(){
        return getDriver().findElement(this.closeLargeModalBtn);
    }
    public WebElement getModalBody(){
        return getDriver().findElement(this.modalBody);
    }
    public WebElement getSmallModalTitle(){
        return getDriver().findElement(this.smallModalTitle);
    }
    public WebElement getLargeModalTitle(){
        return getDriver().findElement(this.largeModalTitle);
    }

    ////////////////////////////// CLICKS /////////////////////////////////
    public void clickModalDialogsNav(){
        getModalDialogsNav().click();
    }
    public void clickSmallModalBtn(){
        getSmallModalBtn().click();
    }
    public void clickLargeModalBtn(){
        getLargeModalBtn().click();
    }
    public void clickCloseSmallModalBtn(){
        getCloseSmallModalBtn().click();
    }
    public void clickCloseLargeModalBtn(){
        getCloseLargeModalBtn().click();
    }

    ////////////////////////////// CHECKS /////////////////////////////////
    public String smallModalText(){
        return getModalBody().getText();
    }
    public String smallModalTitleText(){
        return getSmallModalTitle().getText();
    }
    public boolean largeModalText(String text){
        return getModalBody().getText().contains(text);
    }
    public String largeModalTitleText(){
        return getLargeModalTitle().getText();
    }

    ////////////////////////////// MODAL METHODS /////////////////////////////////
    public void smallModal(){
        scrollDown();
        clickModalDialogsNav();
        clickSmallModalBtn();
    }
    public void largeModal(){
        scrollDown();
        clickModalDialogsNav();
        clickLargeModalBtn();
    }

    ////////////////////////////// SCROLL /////////////////////////////////
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
    }
}
