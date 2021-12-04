package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002_RegistrationNegativeSceneriosStepDef {

    RegistrationPage registrationPage=new RegistrationPage();
    MainPage mainPage=new MainPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("user navigates the registration page")
    public void user_navigates_the_registration_page() {
       mainPage.signInAndRegistrationTab.click();
       mainPage.registerButton.click();
    }

    @Given("user enters invalid shortSSN {string}")
    public void user_enter_a_number(String shortSSN) {
       registrationPage.ssn.sendKeys(shortSSN, Keys.ENTER);
    }
    @Given("user verify the short SSN invalid message")
    public void user_verify_the_short_ssn_invalid_message() {
        ReusableMethods.waitFor(1);
        String expected="Ssn is invalid.";
        Assert.assertEquals(expected,(registrationPage.invalidSsnText.getText()));
    }
    @Given("user enter charSSN {string}")
    public void user_enter(String charSSN) {
        registrationPage.ssn.clear();
        registrationPage.ssn.sendKeys(charSSN,Keys.ENTER);

    }
    @Given("user verify the {string} invalid message")
    public void user_verify_the_invalid_message(String charSSN) {
        String expected="Ssn is invalid.";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expected,(registrationPage.invalidSsnText.getText()));
    }
    @Given("user enters {string} number")
    public void user_enters_number(String longSSN) {
        registrationPage.ssn.clear();
        registrationPage.ssn.sendKeys (longSSN,Keys.ENTER);
    }
    @Given("user verify the long SSN invalid message")
    public void user_verify_the_long_ssn_invalid_message() {

        Assert.assertFalse(registrationPage.invalidSsnText.getText().contains("is invalid."));
    }
    @Given("user left it {string} Text box")
    public void user_left_it_text_box(String blankSSN) {
        registrationPage.ssn.clear();
       registrationPage.ssn.sendKeys(blankSSN,Keys.ENTER);
    }
    @Given("user verify the blank invalid SSN message")
    public void user_verify_the_blank_invalid_ssn_message() {
        String expected="Please enter your social security number.";
        Assert.assertEquals(expected,registrationPage.InvalidBlankSSN.getText());

    }
    @Given("user left it {string}")
    public void user_left_it(String blankFirstName) {
       registrationPage.firstName.sendKeys(blankFirstName,Keys.ENTER);

    }
    @Given("user verify the invalid first name message")
    public void user_verify_the_invalid_first_name_message() {

        String expected="Please enter your first name.";
        Assert.assertEquals(expected,( registrationPage.blankUserName.getText()));
    }
    @Given("user enters invalidLastname {string}")
    public void user_enters(String invalidLastname) {
        registrationPage.lastName.sendKeys(invalidLastname,Keys.ENTER);
    }
    @Given("user verify the last name invalid message")
    public void user_verify_the_last_name_invalid_message() {
        String expected="Please enter your last name.";
        Assert.assertEquals(expected,( registrationPage.blankLastname.getText()));
    }
    @Given("user see the invalid address message")
    public void user_see_the_invalid_address_message(String invalidAddress) {
        registrationPage.addressTab.sendKeys(invalidAddress,Keys.ENTER);
    }
    @Given("user verify the invalid address message")
    public void user_verify_the_invalid_address_message() {
     Assert.assertFalse( registrationPage.invalidTextAddress.getText().contains("is invalid"));
    }
    @Given("user see the invalid phone number message")
    public void user_see_the_invalid_phone_number_message() {
        Assert.assertFalse( registrationPage.invalidPhoneText.getText().contains("is invalid"));

    }
    @Given("user enter invalid char phone number")
    public void user_enter_invalid_char_phone_number(String invalidTel) {
        registrationPage.phoneTab.sendKeys(invalidTel,Keys.ENTER);
    }

    @Given("user see the invalid email message")
    public void user_see_the_invalid_email_message() {
      Assert.assertTrue(registrationPage.invalidMailText.getText().contains("is invalid"));
    }
    @Given("user enter invalid address {string}")
    public void user_enter_invalid_address(String invalidAddress) {
    registrationPage.addressTab.sendKeys(invalidAddress,Keys.ENTER);

    }
    @Given("user enter invalid phone number {string}")
    public void user_enter_invalid_phone_number(String invalidPhone) {
        registrationPage.phoneTab.sendKeys(invalidPhone,Keys.ENTER);
    }
    @Given("user enters invalid email {string}")
    public void user_enters_invalid_email(String invalidEmail) {
       registrationPage.email.sendKeys(invalidEmail,Keys.ENTER);
    }
}