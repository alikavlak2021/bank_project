package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.*;

public class US011_DataCreationOnTimeOfCustomerCreation_negative {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    CustomersPage customersPage = new CustomersPage();
    EditCustomerPage editCustomerPage = new EditCustomerPage();

    @Given("user enters wrong mobile phone number {string}")
    public void user_enters_wrong_mobile_phone_number(String WrongMobilePhoneNumber) {
        editCustomerPage.editCustomerMobilePhoneNumber.sendKeys(WrongMobilePhoneNumber);
    }
    @Given("user verifies the wrong mobile phone number")
    public void user_verifies_the_wrong_mobile_phone_number() {
        String wrongMobilePhoneNumber = editCustomerPage.invalidMobilePhoneNumber.getText();
        Assert.assertTrue(wrongMobilePhoneNumber.contains("This field is invalid"));
    }
    @Given("user enters wrong phone number {string}")
    public void user_enters_wrong_phone_number(String WrongPhoneNumber) {
           editCustomerPage.editCustomerMobilePhoneNumber.sendKeys(WrongPhoneNumber);
    }
    @Given("user verifies the wrong phone number")
    public void user_verifies_the_wrong_phone_number() {
        String wrongPhoneNumber = editCustomerPage.invalidPhoneNumber.getText();
        Assert.assertTrue(wrongPhoneNumber.contains("This field is invalid"));
    }
    @Given("user enters wrong ssn number {string}")
    public void user_enters_wrong_ssn_number(String WrongSsn) {
        editCustomerPage.editCustomerSsn.sendKeys(WrongSsn);
    }
    @Given("user verifies the wrong ssn")
    public void user_verifies_the_wrong_ssn() {
        String wrongSsn = editCustomerPage.invalidSsn.getText();
        Assert.assertTrue(wrongSsn.contains("Your name must be composed only with letter and numbers"));

    }
}
