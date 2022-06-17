package com.bootcamp.final_project.tests;

import com.bootcamp.final_project.pages.alerts_frame_windows_pages.AlertsPage;
import com.bootcamp.final_project.pages.alerts_frame_windows_pages.BrowserWindowsPage;
import com.bootcamp.final_project.pages.alerts_frame_windows_pages.ModalPage;
import com.bootcamp.final_project.pages.elements_pages.*;
import com.bootcamp.final_project.pages.HomePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

@Getter
public abstract class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;
    private TextBoxPage textBoxPage;
    private HomePage homePage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;
    private BrowserWindowsPage browserWindowsPage;
    private AlertsPage alertsPage;
    private ModalPage modalPage;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        textBoxPage = new TextBoxPage(driver, driverWait, actions);
        homePage = new HomePage(driver, driverWait, actions);
        checkBoxPage = new CheckBoxPage(driver, driverWait, actions);
        radioButtonPage = new RadioButtonPage(driver, driverWait, actions);
        webTablesPage = new WebTablesPage(driver, driverWait, actions);
        buttonsPage = new ButtonsPage(driver, driverWait, actions);
        browserWindowsPage = new BrowserWindowsPage(driver, driverWait, actions);
        alertsPage = new AlertsPage(driver, driverWait, actions);
        modalPage = new ModalPage(driver, driverWait, actions);
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
