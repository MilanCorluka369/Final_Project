package com.bootcamp.final_project.pages.elements.pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {
    private By textBoxNav = By.id("item-0");
    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
    private By outputName = By.xpath("//p[@id='name']");
    private By outputEmail = By.xpath("//p[@id='email']");
    private By outputCurrAddress = By.xpath("//p[@id='currentAddress']");
    private By outputPermAddress = By.xpath("//p[@id='permanentAddress']");
    private By outputBox = By.id("output");

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getTextBoxNav(){
        return getDriver().findElement(this.textBoxNav);
    }
    public WebElement getFullName(){
        return getDriver().findElement(this.fullName);
    }
    public WebElement getEmail(){
        return getDriver().findElement(this.email);
    }
    public WebElement getCurrentAddress(){
        return getDriver().findElement(this.currentAddress);
    }
    public WebElement getPermanentAddress(){
        return getDriver().findElement(this.permanentAddress);
    }
    public WebElement getSubmitBtn(){
        return getDriver().findElement(this.submitBtn);
    }
    public WebElement getOutputName(){
        return getDriver().findElement(this.outputName);
    }
    public WebElement getOutputEmail(){
        return getDriver().findElement(this.outputEmail);
    }
    public WebElement getOutputCurrAddress(){
        return getDriver().findElement(this.outputCurrAddress);
    }
    public WebElement getOutputPermAddress(){
        return getDriver().findElement(this.outputPermAddress);
    }
    public WebElement getOutputBox(){
        return getDriver().findElement(this.outputBox);
    }

    ////////////////////////////// CLICKS /////////////////////////////////
    public void clickTextBox(){
        getTextBoxNav().click();
    }
    public void clickSubmit(){
        getSubmitBtn().click();
    }

    ////////////////////////////// ENTER CREDITENTIALS /////////////////////////////////
    public void enterFullName(String fullName){
        getFullName().sendKeys(fullName);
    }
    public void enterEmail(String email){
        getEmail().sendKeys(email);
    }
    public void enterCurrentAddress(String currentAddress){
        getCurrentAddress().sendKeys(currentAddress);
    }
    public void enterPermanentAddress(String permanentAddress){
        getPermanentAddress().sendKeys(permanentAddress);
    }

    ////////////////////////////// OUTPUT /////////////////////////////////
    public boolean containsFullName(String fullname){
        return getOutputName().getText().contains(fullname);
    }
    public boolean containsEmail(String email){
        return getOutputEmail().getText().contains(email);
    }
    public boolean containsCurrentAddress(String currentAddress){
        return getOutputCurrAddress().getText().contains(currentAddress);
    }
    public boolean containsPermanentAddress(String permanentAddress){
        return getOutputPermAddress().getText().contains(permanentAddress);
    }

    ////////////////////////////// TEXT BOX METHOD /////////////////////////////////
    public void textBoxInput (String fullName, String email, String currAddress, String permAddress){
        clickTextBox();
        enterFullName(fullName);
        enterEmail(email);
        enterCurrentAddress(currAddress);
        enterPermanentAddress(permAddress);
        scrollDown();
        clickSubmit();
    }

    ////////////////////////////// SCROLL /////////////////////////////////
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
    }
}
