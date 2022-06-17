package com.bootcamp.final_project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest{

    @Test (priority = 1)
    public void testTextBoxFunctionality() {
        getHomePage().clickOnElementsCard();
        getTextBoxPage().textBoxInput("Petar Petrovic", "petarpetrovic@email.com",
                "Novosadska 10", "Beogradska 20");
        Assert.assertTrue(getTextBoxPage().containsFullName("Petar Petrovic"));
        Assert.assertTrue(getTextBoxPage().containsEmail("petarpetrovic@email.com"));
        Assert.assertTrue(getTextBoxPage().containsCurrentAddress("Novosadska 10"));
        Assert.assertTrue(getTextBoxPage().containsPermanentAddress("Beogradska 20"));
    }

    @Test (priority = 2)
    public void testCheckBoxHomeFunctionality(){
        getHomePage().clickOnElementsCard();
        getCheckBoxPage().checkBoxHome();
        Assert.assertTrue(getCheckBoxPage().isMessageDisplayed());
    }

    @Test (priority = 3)
    public void testCheckBoxNotesFunctionality(){
        getHomePage().clickOnElementsCard();
        getCheckBoxPage().checkBoxNotes();
        Assert.assertEquals(getCheckBoxPage().messageText(), "You have selected :\nnotes");
    }

    @Test (priority = 4)
    public void testRadioButtonYesFunctionality(){
        getHomePage().clickOnElementsCard();
        getRadioButtonPage().clickRadioButtonYes();
        Assert.assertTrue(getRadioButtonPage().isCorrectMessageDisplayed("You have selected Yes"));
        Assert.assertFalse(getRadioButtonPage().isImpressiveButtonSelected());
    }

    @Test (priority = 5)
    public void testRadioButtonImpressiveFunctionality(){
        getHomePage().clickOnElementsCard();
        getRadioButtonPage().clickRadioButtonImpressive();
        Assert.assertTrue(getRadioButtonPage().isCorrectMessageDisplayed("You have selected Impressive"));
        Assert.assertFalse(getRadioButtonPage().isYesButtonSelected());
    }

    @Test (priority = 6)
    public void testWebTablesAddFunctionality(){
        getHomePage().clickOnElementsCard();
        getWebTablesPage().addRow("Petar","Petrovic","petar@email.com","30", "100000",
                "Insurance");
        Assert.assertTrue(getWebTablesPage().checkIfEntityIsInTable("Petar","Petrovic",
                "petar@email.com","30", "100000", "Insurance"));
    }

    @Test (priority = 7)
    public void testWebTablesEditFunctionality(){
        getHomePage().clickOnElementsCard();
        getWebTablesPage().addRow("Petar","Petrovic","petar@email.com","30", "100000",
                "Insurance");
        getWebTablesPage().editRow("Jovan", "Jovanovic", "jovan@email.com", "27",
                "120000", "Legal");
        Assert.assertTrue(getWebTablesPage().checkIfEntityIsInTable("Jovan", "Jovanovic",
                "jovan@email.com", "27", "120000", "Legal"));
    }

    @Test (priority = 8)
    public void testWebTablesDeleteFunctionality(){
        getHomePage().clickOnElementsCard();
        getWebTablesPage().addRow("Petar","Petrovic","petar@email.com","30", "100000",
                "Insurance");
        getWebTablesPage().deleteRow();
        Assert.assertTrue(getWebTablesPage().checkIfRowIsEmpty());
    }

    @Test (priority = 9)
    public void testButtonsClickFunctionality(){
        getHomePage().clickOnElementsCard();
        getButtonsPage().click();
        Assert.assertEquals(getButtonsPage().getClickMessageText(), "You have done a dynamic click");
    }

    @Test (priority = 10)
    public void testButtonsRightClickFunctionality() {
        getHomePage().clickOnElementsCard();
        getButtonsPage().rightClick();
        Assert.assertEquals(getButtonsPage().getRightClickMessageText(), "You have done a right click");
    }

    @Test (priority = 11)
    public void testButtonsDoubleClickFunctionality(){
        getHomePage().clickOnElementsCard();
        getButtonsPage().doubleClick();
        Assert.assertEquals(getButtonsPage().getDoubleClickMessageText(), "You have done a double click");
    }
}
