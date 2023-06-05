package pages;

import com.core.utility.MasterPage;
import org.junit.Assert;


import static locators.Locators.*;

public class ExamplePage extends MasterPage {
    public void navigateToMainURL() {
        auto_openURLInBrowser();
    }

    public void clickBtnSigninMain(){
        auto_setClickElement(SIGNIN_BTN_XPATH);
    }

    public void ingresarDatos (String user,String pass){
        auto_setTextToInput(LOGIN_INPUT_XPATH,user);
        auto_setTextToInput(PASS_INPUT_XPATH,pass);
    }

    public void clickBtnSigninLogin(){
        auto_setClickElement(SIGNIN_BTN2_XPATH);
    }

    public void verificarLogin(String mjs){
        if (mjs.equals("Success")){
            page.goBack();
            Assert.assertTrue("Error alv",auto_isElementVisible(ICONO_USR_I_XPATH));
        } else {
            auto_waitForElementVisibility(MSJ_DIV_XPATH);
            Assert.assertTrue("Error alv",auto_getElementText(MSJ_DIV_XPATH).contains(mjs));
        }
    }

}
