package stepdefinitions;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;



public class US009_CreateCustomerStepDefs {


    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();

    @Then("verify that user successfully logins to the account")
    public void verify_that_user_successfully_logins_to_the_account() {
        String myOperations = defaultPage.myOperationsText.getText();
        Assert.assertTrue(myOperations.contains("My Operations"));
    }

    @Then("user clicks Manage Customers")
    public void user_clicks_manage_customers() {
        defaultPage.manageCustomers.click();
    }

    @Then("user clicks Create a new Customer")
    public void user_clicks_create_a_new_customer() {
        defaultPage.createCustomer.click();
    }

    @Then("user enters {string} number to search for the customer")
    public void user_enters_number_to_search_for_the_customer(String SSN) {
        defaultPage.searchSSNField.sendKeys(SSN);
    }

    @Then("user clicks search button")
    public void user_clicks_search_button () {
        defaultPage.searchButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("verify that First Name is populated")
    public void verify_that_first_name_is_populated() {
        String firstNameText = defaultPage.firstNameField.getAttribute("Value");
        System.out.println(firstNameText);
        Assert.assertFalse(firstNameText.isEmpty());
    }

    @Then("verify that Last Name is populated")
    public void verify_that_last_name_is_populated() {
        String lastNameText = defaultPage.lastNameField.getAttribute("Value");
        System.out.println(lastNameText);
        Assert.assertFalse(lastNameText.isEmpty());
    }

//    @Then("verify that Middle Initial is populated")
//    public void verify_that_middle_initial_is_populated() {
//        String middleInitialsText = defaultPage.middleInitialField.getAttribute("Value");
//        Assert.assertTrue(middleInitialsText.isEmpty() || !middleInitialsText.isEmpty());
//    }

    @Then("verify that email is populated")
    public void verify_that_email_is_populated() {
        System.out.println(defaultPage.emailField.getAttribute("value"));
        Assert.assertFalse(defaultPage.emailField.getAttribute("Value").isEmpty());
    }

    @Then("verify that Mobile Phone Number is populated")
    public void verify_that_mobile_phone_number_is_populated() {
        Assert.assertFalse(defaultPage.mobilePhoneNumberField.getAttribute("Value").isEmpty());
    }

//    @Then("verify that Phone Number is populated")
//    public void verify_that_phone_number_is_populated() {
//
//       String phoneNumberFieldValue = defaultPage.phoneNumberField.getAttribute("Value");
//        Assert.assertTrue(phoneNumberFieldValue.isEmpty()||!phoneNumberFieldValue.isEmpty());
//    }

//    @Then("verify that Zip Code is populated")
//    public void verify_that_zip_code_is_populated() {
//        Assert.assertFalse(defaultPage.zipCodeField.getAttribute("Value").isEmpty());
//  }

    @Then("verify that Address is populated")
    public void verify_that_address_is_populated() {
        Assert.assertFalse(defaultPage.addressField.getAttribute("Value").isEmpty());
    }

//    @Then("verify that city is populated")
//    public void verify_that_city_is_populated() {
//        Assert.assertFalse(defaultPage.cityField.getAttribute("Value").isEmpty());
//    }

    @Then("verify that SSN is populated")
    public void verify_that_ssn_is_populated() {
        Assert.assertFalse(defaultPage.ssnField.getAttribute("Value").isEmpty());
    }

    @Then("verify that Create Date is populated")
    public void verify_that_create_date_is_populated() {
        Assert.assertFalse(defaultPage.createDateDropdownField.getAttribute("Value").isEmpty());
    }

    @Then("verify that Country is populated")
    public void verify_that_country_is_populated() {
        Assert.assertFalse(defaultPage.countryDropdownField.getAttribute("Value").isEmpty());
    }

//    @Then("verify that State is populated")
//    public void verify_that_state_is_populated() {
//        Assert.assertFalse(defaultPage.stateField.getAttribute("Value").isEmpty());
//    }

//    @Then("verify that Account is populated")
//    public void verify_that_account_is_populated() {
//        Assert.assertFalse(defaultPage.accountDropdownField.getAttribute("Value").isEmpty());
//    }


}