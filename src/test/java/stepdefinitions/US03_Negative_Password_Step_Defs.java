package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_Negative_Password_Step_Defs {
    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();

    @Given("user enters negative password With Capital Char {string}")
    public void user_enters_negative_password_with_capital_char(String string) {
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutSmallChar"));
        Assert.assertFalse(registrationPage.passwordStrength5.isDisplayed());
        ReusableMethods.waitFor(2);
        registrationPage.firstPassword.clear();

    }

    @Then("user enters negative password With Small Char  {string}")
    public void user_enters_negative_password_with_small_char(String string) {
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutCapitalChar"));
        Assert.assertFalse(registrationPage.passwordStrength5.isDisplayed());
        ReusableMethods.waitFor(2);
        registrationPage.firstPassword.clear();

    }
    @Then("user enters negative password With Special Char  {string}")
    public void user_enters_negative_password_with_special_char(String string) {

        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutSpecChar"));
        Assert.assertFalse(registrationPage.passwordStrength5.isDisplayed());
        ReusableMethods.waitFor(2);
        registrationPage.firstPassword.clear();

    }
    @Then("user enters negative password With Digits  {string}")
    public void user_enters_negative_password_with_digits(String string) {
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutDigits"));
        Assert.assertFalse(registrationPage.passwordStrength5.isDisplayed());
        ReusableMethods.waitFor(3);
        registrationPage.firstPassword.clear();

    }
    @Then("user enters different from first password {string}")
    public void user_enters_different_from_first_password(String string) {

        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        Assert.assertTrue(registrationPage.passwordStrength5.isDisplayed());
        registrationPage.secondPassword.sendKeys(ConfigReader.getProperty("invalidPasswordDifferentFromFirst"));
        ReusableMethods.waitFor(1);

    }
    @Then("verify the confirmation message")
    public void verify_the_confirmation_message() {
        Assert.assertTrue(registrationPage.passwordShouldMatchWithFirstOne.getText().contains("do not match!"));
        ReusableMethods.waitFor(1);

    }

    @Then("user verifies different from first password message")
    public void user_verifies_different_from_first_password_message() {
        registrationPage.secondPassword.clear();
        registrationPage.secondPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        ReusableMethods.waitFor(3);
    }

    @Then("user close the application")
    public void user_close_the_application() {
       //Driver.closeDriver();
    }

}
