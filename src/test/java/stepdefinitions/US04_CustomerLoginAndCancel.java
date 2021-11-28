package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ReusableMethods;

public class US04_CustomerLoginAndCancel {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();

    @Given("goes to the login page")
    public void goes_to_the_login_page() {
        mainPage.signInAndRegistrationTab.click();
        mainPage.signInButton.click();
    }

    @Then("verifies the user successfully login")
    public void verifies_the_user_successfully_login() {
        ReusableMethods.waitFor(2);
        System.out.println(defaultPage.myOperationsText.getText());
        Assert.assertTrue(defaultPage.myOperationsText.isDisplayed());
    }

    @Then("clicks the signin button")
    public void clicks_the_signin_button() {
        loginPage.signInButtonTab.click();
    }

    @Then("user verify cancel button")
    public void user_verify_cancel_button() {
        Assert.assertTrue(loginPage.loginPageCancelButton.isDisplayed());
    }
}
