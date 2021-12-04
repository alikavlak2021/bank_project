package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US008_OldPassword_Step_Defs {


    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();
    DefaultPage defaultPage = new DefaultPage();
    CustomersPasswordPage customersPasswordPage = new CustomersPasswordPage();

    @Given("user clicks signInAndRegistrationTab")
    public void user_clicks_sign_ın_and_registration_tab() {
        mainPage.signInAndRegistrationTab.click();
        mainPage.signInButton.click();

    }

    @Given("user enters username as a customer {string}")
    public void user_enters_username_as_a_customer(String ders) {
        loginpage.loginUserName.sendKeys("tarkan");
    }

    @Given("user enters password {string}")
    public void user_enters_password(String pass) {
        loginpage.loginPassword.sendKeys(pass);
    }

    @Given("user clicks names button")
    public void user_clicks_names_button() {
        defaultPage.namesButton.click();
    }

    @Given("user clicks Password button")
    public void user_clicks_password_button() {
        defaultPage.passwordButton.click();
        ReusableMethods.waitFor(1);
    }

    @Given("user types current password {string}")
    public void user_types_current_password(String doesntmatter) {
        customersPasswordPage.currentPassword.sendKeys(doesntmatter);
    }

    @Given("user types new password {string}")
    public void user_types_new_password(String püf)    {
    customersPasswordPage.newPasswordField.sendKeys(püf);
    customersPasswordPage.confirmPasswordField.click();
    ReusableMethods.waitFor(2);
    }

    @Then("user verify the error message")
    public void user_verify_the_error_message() {
    ReusableMethods.waitFor(2);
     Assert.assertTrue(customersPasswordPage.differentText.isDisplayed());

    }
    @Then("user clears the new password fields")
    public void user_clears_the_new_password_fields() {
        customersPasswordPage.newPasswordField.clear();
    }

    @Then("user enter uppercase char and verify level chart increase")
    public void user_enter_uppercase_char_and_verify_level_chart_increase() {
        customersPasswordPage.newPasswordField.sendKeys("A");
        Assert.assertTrue(customersPasswordPage.firstofChartLevel.isEnabled());
    }

    @Then("user enter lowercase char and verify level chart increase")
    public void user_enter_lowercase_char_and_verify_level_chart_increase() {
        ReusableMethods.waitFor(1);
        customersPasswordPage.newPasswordField.sendKeys("a");
        Assert.assertTrue(customersPasswordPage.secondofChartLevel.isEnabled());
    }

    @Then("user enter a digit and level chart increase")
    public void user_enter_a_digit_and_level_chart_increase() {
        ReusableMethods.waitFor(1);
        customersPasswordPage.newPasswordField.sendKeys("1");
        Assert.assertTrue(customersPasswordPage.thirdofChartLevel.isEnabled());
    }

    @Then("user enter special char and verify level chart increase")
    public void user_enter_special_char_and_verify_level_chart_increase() {
        ReusableMethods.waitFor(1);
        customersPasswordPage.newPasswordField.sendKeys("+");
        Assert.assertTrue(customersPasswordPage.fourthofChartLevel.isEnabled());
    }

    @Then("user enter any {int} char and verify level chart becames full green")
    public void user_enter_any_char_and_verify_level_chart_becames_full_green(Integer int1) {
        ReusableMethods.waitFor(1);
        customersPasswordPage.newPasswordField.sendKeys("sdf");
        Assert.assertTrue(customersPasswordPage.fifthofChartLevel.isEnabled());
    }
    @Then("user confirm the new password")
    public void user_confirm_the_new_password() {
    customersPasswordPage.confirmPasswordField.sendKeys(ConfigReader.getProperty("customerConfirmPassword"));
    }


    }

