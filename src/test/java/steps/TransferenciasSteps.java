package steps;

import io.cucumber.java.en.*;
import pages.TransferenciasPage;


public class TransferenciasSteps {
    /*
     ** PAGE INSTANCE **
     */

    TransferenciasPage transferenciasPage = new TransferenciasPage();

    @And("^I click on the \"(.*)\" tab$")
    public void iClickOnTheTab(String arg0) {
        transferenciasPage.clickBtnTransferFunds();
    }

    @And("^I click on \"(.*)\"$")
    public void iClickOn(String arg0) {
        transferenciasPage.clickBtnFromAccount();
    }

    @And("^I select the option \"(.*)\" from the first dropdown menu$")
    public void iSelectTheOptionFromTheFirstDropdownMenu(String value) {
        transferenciasPage.selectFirstDDL(value);
    }

    @And("^I select the option \"(.*)\" from the second dropdown menu$")
    public void iSelectTheOptionFromTheSecondDropdownMenu(String value) {
        transferenciasPage.clickValueToAccount(value);
    }

    @And("^I enter an \"(.*)\" amount in the blank field$")
    public void iEnterAnAmountInTheBlankField(String value) {
        transferenciasPage.enterValue(value);
    }

    @And("^I select the option \"(.*)\" from the dropdown menu$")
    public void iSelectTheOptionSavingsAvailBalance$FromTheDropdownMenu(int arg0) {
    }

    @And("^I click on the \"(.*)\" button to login in the web$")
    public void iClickOnTheButtonToLoginInTheWeb(String btn) {
        transferenciasPage.clickBtnSubmitAndBack();
    }
}
