package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US002_RegistrationNegativeSceneriosStepDef {

    RegistrationPage registrationPage=new RegistrationPage();
    MainPage mainPage=new MainPage();
    Faker faker=new Faker();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("user navigates the registration page")
    public void user_navigates_the_registration_page() {
    mainPage.signInAndRegistrationTab.click();
    mainPage.registerButton.click();
    }

    @Given("user enters a {string} number")
    public void user_enters_a_number(String shortSSN) {
       registrationPage.ssn.sendKeys(ConfigReader.getProperty("shortSSN"), Keys.ENTER);
    }

    @Given("user see the invalid short SSN message")
    public void user_see_the_invalid_short_ssn_message() {
    registrationPage.invalidSsnText.getText();
    }

    @Given("user verify the short SSN invalid message")
    public void user_verify_the_short_ssn_invalid_message() {
        String expected="Ssn is invalid.";
        Assert.assertEquals(expected,equals(registrationPage.invalidSsnText.getText()));
    }

    @Given("user enter {string}")
    public void user_enter(String string) {
        registrationPage.ssn.sendKeys(ConfigReader.getProperty("charSSN"),Keys.ENTER);

    }
    @Given("user see the invalid char SSN message")
    public void user_see_the_invalid_char_ssn_message() {
    registrationPage.invalidSsnText.getText();
    }

    @Given("user verify the {string} invalid message")
    public void user_verify_the_invalid_message(String charSSN) {
        String expected="Ssn is invalid.";
        Assert.assertEquals(expected,equals(registrationPage.invalidSsnText.getText()));

    }
    @Given("user enters {string} number")
    public void user_enters_number(String longSSN) {
    registrationPage.ssn.sendKeys(ConfigReader.getProperty("longSSN"),Keys.ENTER);

    }
    @Given("user see the invalid long SSN message")
    public void user_see_the_invalid_long_ssn_message() {
        registrationPage.invalidSsnText.getText();

    }
    @Given("user verify the long SSN invalid message")
    public void user_verify_the_long_ssn_invalid_message() {
        String expected="Ssn is invalid.";
        Assert.assertEquals(expected,equals(registrationPage.invalidSsnText.getText()));
    }

    @Given("user left it {string} Text box")
    public void user_left_it_text_box(String string) {

    }

    @Given("user see the blank invalid SSN message")
    public void user_see_the_blank_invalid_ssn_message() {

    }

    @Given("user verify the blank invalid SSN message")
    public void user_verify_the_blank_invalid_ssn_message() {

    }

    @Given("user left it {string}")
    public void user_left_it(String string) {

    }

    @Given("user see the  blank invalid first name message")
    public void user_see_the_blank_invalid_first_name_message() {

    }

    @Given("user verify the invalid first name message")
    public void user_verify_the_invalid_first_name_message() {

    }

    @Given("user enters {string}")
    public void user_enters(String string) {

    }

    @Given("user see the invalid last name message")
    public void user_see_the_invalid_last_name_message() {

    }

    @Given("user verify the last name invalid message")
    public void user_verify_the_last_name_invalid_message() {

    }

    @Given("user see the invalid address message")
    public void user_see_the_invalid_address_message() {

    }

    @Given("user verify the invalid address message")
    public void user_verify_the_invalid_address_message() {

    }

    @Given("user see the invalid phone number message")
    public void user_see_the_invalid_phone_number_message() {

    }

    @Given("user enter invalid char phone number")
    public void user_enter_invalid_char_phone_number() {

    }

    @Given("user enter with invalid {string}")
    public void user_enter_with_invalid(String string) {

    }

    @Given("user see the invalid char character message")
    public void user_see_the_invalid_char_character_message() {

    }

    @Given("user see the invalid email message")
    public void user_see_the_invalid_email_message() {

    }

    @Given("user enter email {string} address")
    public void user_enter_email_address(String string) {

    }
}