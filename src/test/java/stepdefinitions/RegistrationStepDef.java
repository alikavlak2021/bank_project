package stepdefinitions;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.ConfigReader;
import utilities.Driver;

import utilities.ReusableMethods;
import utilities.WriteToTxt;

import com.github.javafaker.Faker;


public class RegistrationStepDef {

    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    String path = "src/test/resources/test_data/customer_information.txt";
    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();


    @Given("user is on the main  page")
    public void user_iss_on_the_main_page() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("user verifies the GMIBANK text")
    public void user_verifies_the_gmibank_text() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("GMIBANK"));


    }

    @Given("navigates the registration page")
    public void navigates_the_registration_page() {
        mainPage.signInAndRegistrationTab.click();
        mainPage.registerButton.click();
    }

    @Given("user enters SSN {string} number")
    public void user_enters_ssn_number(String SSN) {
        String SSN_Number = faker.number().digits(9);
        registrationPage.ssn.sendKeys(SSN_Number);
        registrant.setSsn(SSN);
    }

    @Given("user enters firstname {string}")
    public void user_enters_firstname_number(String firstname) {
        registrationPage.firstName.sendKeys(firstname);
        registrant.setFirstName(firstname);
    }

    @Given("user enters lastname {string}")
    public void user_enters_lastname_number(String lastname) {
        registrationPage.lastName.sendKeys(lastname);
        registrant.setLastName(lastname);
    }

    @Given("user enters address {string}")
    public void user_enters_address_number(String address) {
        registrationPage.addressTab.sendKeys(address);
        registrant.setAddress(address);
    }

    @Given("user enters phonenumber {string}")
    public void user_enters_phone_number_number(String phonenumber) {
        registrationPage.phoneTab.sendKeys(phonenumber);
        registrant.setPhoneNumber(phonenumber);
    }

    @Given("user enters username {string}")
    public void user_enters_username_number(String username) {
        registrationPage.userNameTab.sendKeys(username);
        registrant.setUserName(username);
    }

    @Given("user enters email {string}")
    public void user_enters_email_number(String email) {
        registrationPage.email.sendKeys(email);
        registrant.setEmail(email);
    }

    @Given("user enters new password {string}")
    public void user_enters_new_password_number(String newpassword) {
        registrationPage.firstPassword.sendKeys(newpassword);
        registrant.setPassword(newpassword);
    }

    @Given("user enters new password2 {string}")
    public void user_enters_new_password2_number(String newpassword2) {
        registrationPage.secondPassword.sendKeys(newpassword2);
    }

    @Given("click the register button")
    public void click_the_register_button() {
        registrationPage.registerButton2.click();
        WriteToTxt.saveRegistrantData(path, registrant);
    }

    @Then("verify the success message")
    public void verify_the_success_message() {
       // System.out.println(registrationPage.successMessage.getText());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(registrationPage.successMessage.getText().contains("Registration saved"));

    }

}

