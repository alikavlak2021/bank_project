package stepdefinitions;



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
        Assert.assertEquals(expected,(registrationPage.invalidSsnText.getText()));
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
        Assert.assertEquals(expected,(registrationPage.invalidSsnText.getText()));
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
        Assert.assertEquals(expected,(registrationPage.invalidSsnText.getText()));
    }
    @Given("user left it {string} Text box")
    public void user_left_it_text_box(String blankSSN) {
       registrationPage.ssn.sendKeys(ConfigReader.getProperty("blankSSN"),Keys.ENTER);
    }
    @Given("user see the blank invalid SSN message")
    public void user_see_the_blank_invalid_ssn_message() {
        registrationPage.invalidSsnText.getText();

    }
    @Given("user verify the blank invalid SSN message")
    public void user_verify_the_blank_invalid_ssn_message() {
        String expected="Please enter your social security number.";
        Assert.assertEquals(expected,registrationPage.InvalidBlankSSN.getText());

    }

    @Given("user left it {string}")
    public void user_left_it(String blankFirstName) {
       registrationPage.firstName.sendKeys(ConfigReader.getProperty("BlankFirstName"),Keys.ENTER);

    }
    @Given("user see the  blank invalid first name message")
    public void user_see_the_blank_invalid_first_name_message() {
        registrationPage.blankUserName.getText();

    }
    @Given("user verify the invalid first name message")
    public void user_verify_the_invalid_first_name_message() {

        String expected="Please enter your first name.";
        Assert.assertEquals(expected,( registrationPage.blankUserName.getText()));
    }
    @Given("user enters {string}")
    public void user_enters(String invalidLastname) {
        registrationPage.lastName.sendKeys(ConfigReader.getProperty("BlankInvalidLastname"),Keys.ENTER);
    }
    @Given("user see the invalid last name message")
    public void user_see_the_invalid_last_name_message() {
        registrationPage.blankLastname.getText();
    }
    @Given("user verify the last name invalid message")
    public void user_verify_the_last_name_invalid_message() {
        String expected="Please enter your last name.";
        Assert.assertEquals(expected,( registrationPage.blankLastname.getText()));
    }
    @Given("user see the invalid address message")
    public void user_see_the_invalid_address_message() {
        registrationPage.addressTab.sendKeys(ConfigReader.getProperty("invalidAddress"),Keys.ENTER);
    }
    @Given("user verify the invalid address message")
    public void user_verify_the_invalid_address_message() {
        //registrationPage. bug?
    }
    @Given("user see the invalid phone number message")
    public void user_see_the_invalid_phone_number_message() {

    }
    @Given("user enter invalid char phone number")
    public void user_enter_invalid_char_phone_number() {
        registrationPage.phoneTab.sendKeys(ConfigReader.getProperty("invalidTel"),Keys.ENTER);
    }
    @Given("user enter email {string} address")
    public void user_enter_email_address(String string) {
    registrationPage.email.sendKeys(ConfigReader.getProperty("invalidEmail"),Keys.ENTER);
    }
    @Given("user see the invalid email message")
    public void user_see_the_invalid_email_message() {
        registrationPage.invalidMailText.getText();
    }
}