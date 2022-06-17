package com.bootcamp.final_project.pages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
@NoArgsConstructor
public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;

    public BasePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        this.driver = driver;
        this.driverWait = driverWait;
        this.actions = actions;
    }

    public void clearField(By locator){
        driver.findElement(locator).clear();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
}
