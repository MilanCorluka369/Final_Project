package com.bootcamp.final_project.pages.elements.pages;

import com.bootcamp.final_project.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTablesPage extends BasePage {
    private By webTablesNav = By.id("item-3");
    private By addButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submitButton = By.id("submit");
    private By tableRow = By.xpath("//*[@class='rt-tbody']/div[4]/div");
    private By editRow = By.id("edit-record-4");
    private By deleteRow = By.id("delete-record-4");


    public WebTablesPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    ////////////////////////////// GETTERS /////////////////////////////////
    public WebElement getWebTablesNav(){
        return getDriver().findElement(this.webTablesNav);
    }
    public WebElement getAddButton(){
        return getDriver().findElement(this.addButton);
    }
    public WebElement getFirstName(){
        return getDriver().findElement(this.firstName);
    }
    public WebElement getLastName(){
        return getDriver().findElement(this.lastName);
    }
    public WebElement getEmail(){
        return getDriver().findElement(this.email);
    }
    public WebElement getAge(){
        return getDriver().findElement(this.age);
    }
    public WebElement getSalary(){
        return getDriver().findElement(this.salary);
    }
    public WebElement getDepartment(){
        return getDriver().findElement(this.department);
    }
    public WebElement getSubmitButton(){
        return getDriver().findElement(this.submitButton);
    }
    public WebElement getTableRow(){
        return getDriver().findElement(this.tableRow);
    }
    public WebElement getEditRowBtn(){
        return getDriver().findElement(this.editRow);
    }
    public WebElement getDeleteRowBtn(){
        return getDriver().findElement(this.deleteRow);
    }

    ////////////////////////////// ROW ACTIONS /////////////////////////////////
    public void addRow(String firstName, String lastName, String email, String age, String salary, String department){
        getWebTablesNav().click();
        getAddButton().click();
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getEmail().sendKeys(email);
        getAge().sendKeys(age);
        getSalary().sendKeys(salary);
        getDepartment().sendKeys(department);
        getSubmitButton().click();
    }
    public void editRow(String firstName, String lastName, String email, String age, String salary, String department){
        getEditRowBtn().click();
        clearField(this.firstName);
        getFirstName().sendKeys(firstName);
        clearField(this.lastName);
        getLastName().sendKeys(lastName);
        clearField(this.email);
        getEmail().sendKeys(email);
        clearField(this.age);
        getAge().sendKeys(age);
        clearField(this.salary);
        getSalary().sendKeys(salary);
        clearField(this.department);
        getDepartment().sendKeys(department);
        getSubmitButton().click();
    }
    public void deleteRow(){
        getDeleteRowBtn().click();
    }

    ////////////////////////////// CHECKS /////////////////////////////////
    public boolean checkIfEntityIsInTable(String firstName, String lastName, String email, String age,
                                          String salary, String department){
        List<WebElement> newRow = getTableRow().findElements(By.tagName("div"));
        String firstNameData = newRow.get(0).getText();
        String lastNameData = newRow.get(1).getText();
        String ageData = newRow.get(2).getText();
        String emailData = newRow.get(3).getText();
        String salaryData = newRow.get(4).getText();
        String departmentData = newRow.get(5).getText();
        if (firstNameData.equals(firstName) && lastNameData.equals(lastName) && ageData.equals(age)
                && emailData.equals(email) && salaryData.equals(salary) && departmentData.equals(department)){
            return true;
        }
        return false;
    }
    public boolean checkIfRowIsEmpty(){
        List<WebElement> newRow = getTableRow().findElements(By.tagName("div"));
        String firstNameData = newRow.get(0).getText();
        String lastNameData = newRow.get(1).getText();
        String ageData = newRow.get(2).getText();
        String emailData = newRow.get(3).getText();
        String salaryData = newRow.get(4).getText();
        String departmentData = newRow.get(5).getText();
        if(firstNameData.isBlank() && lastNameData.isBlank() && ageData.isBlank()
                && emailData.isBlank() && salaryData.isBlank() && departmentData.isBlank()){
            return true;
        }
        return false;
    }
}


