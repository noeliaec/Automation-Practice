package pages;

import com.core.utility.MasterPage;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.options.SelectOption;
import org.junit.Assert;

import java.util.List;

import static locators.Locators.*;
import static locators.TrasferenciasLocators.*;

public class TransferenciasPage extends MasterPage {
    public void navigateToMainURL() {
        auto_openURLInBrowser();
    }

    public void clickBtnTransferFunds(){
        auto_setClickElement(TRANSFERFUNDS_BTN_XPATH);
    }
    public void clickBtnFromAccount(){
        auto_setClickElement(FROMACCOUNT_BTN_XPATH);
    }
    public void selectFirstDDL(String value){
        //auto_setClickElement(VALUE1_DDL_XPATH);
        ElementHandle select = page.querySelector(VALUE1_DDL_XPATH);
        select.selectOption(new SelectOption().setLabel(value));
    }
    public void clickValueToAccount(String value){
        ElementHandle select = page.querySelector(VALUE2_DDL_XPATH);
        select.selectOption(new SelectOption().setLabel(value));
    }

    public void enterValue(String value){
        auto_setTextToInput(AMOUNT_IMPUT_XPATH,value);
    }
    public void clickBtnSubmit1(){
        auto_setClickElement(SUBMIT1_BTN_XPATH);
    }

    public void clickBtnSubmitAndBack() {
        auto_setClickElement(SIGNIN_BTN2_XPATH);
        page.goBack();
    }

    public void verificarTransaccion(String msj){
        auto_waitForElementVisibility(SUCCESS_MSJ_DIV_XPATH);
        Assert.assertTrue("Error alv",auto_getElementText(SUCCESS_MSJ_DIV_XPATH).contains(msj));
    }

}
