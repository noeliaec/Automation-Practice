package steps;

import io.cucumber.java.en.*;
import pages.ExamplePage;

public class ExampleSteps {
    /*
     ** PAGE INSTANCE **
     */

    ExamplePage examplePage = new ExamplePage();

    @Given("I have a web browser installed and internet connection")
    public void iHaveAWebBrowserInstalledAndInternetConnection() {
    }

    @When("I open the page")
    public void iOpenThePage() {
        examplePage.navigateToMainURL();
    }

    @And("^I click on the \"(.*)\" button of the main page$")
    public void iClickOnTheButton(String btn) {
        examplePage.clickBtnSigninMain();
    }

    @And("^I click on the \"(.*)\" button to login$")
    public void iClickOnTheButtonToLogin(String btn) {
        examplePage.clickBtnSigninLogin();
    }

    @And("^I enter the \"(.*)\" and \"(.*)\"$")
    public void iEnterTheUsernameAndPassword(String user, String pass) {
        examplePage.ingresarDatos(user, pass);
    }

    @Then("^the screen should display the validation message \"(.*)\"$")
    public void theScreenShouldDisplayTheValidationMessageValidation_message(String msj) {
        examplePage.verificarLogin(msj);
    }
}
