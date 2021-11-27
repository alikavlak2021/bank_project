package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_Negative_Password_Step_Defs {
    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();

    @When("navigates the login page")
    public void navigates_the_login_page() {
        mainPage.signInAndRegistrationTab.click();
        mainPage.signInButton.click();
    }

    @When("user enters username on login page {string}")
    public void user_enters_username_on_login_page(String username) {
        loginpage.loginUserName.sendKeys(username);

    }

    @When("user enters password on login page {string}")
    public void user_enters_password_on_login_page(String password) {
        loginpage.loginPassword.sendKeys(password);

    }

    @When("click the signin button")
    public void click_the_signin_button() {
        loginpage.signInButton.click();
    }

    @Then("user verifies the Did you forget your password? link")
    public void user_verifies_the_did_you_forget_your_password_link() {
        loginpage.forgetPassword.click();

    }

    @Then("user clicks on the Did you forget your password? link")
    public void user_clicks_on_the_did_you_forget_your_password_link() {
        Assert.assertTrue(loginpage.resetYourPasswordText.getText().equals("Reset your password"));
        ReusableMethods.waitFor(2);
        Driver.getDriver().navigate().back();
    }

    @Then("user clicks on the Register a new account link")
    public void user_clicks_on_the_register_a_new_account_link() {
        loginpage.registerNewAccount.click();
    }

    @Then("user verifies the Register a new account link")
    public void user_verifies_the_register_a_new_account_link() {
       Assert.assertTrue(loginpage.registerTitleText.getText().equals("Registration"));
        ReusableMethods.waitFor(2);
        Driver.getDriver().navigate().back();
    }
}