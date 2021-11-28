
package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import utilities.ReusableMethods;


public class US10_CreateAddressOfCustomerStepDefs {
        DefaultPage defaultPage = new DefaultPage();

        @Then("user enters middle initial {string}")
        public void user_enters_middle_initial(String middleInitial) {
        defaultPage.middleInitialField.sendKeys(middleInitial);
        }

        @Then("user enters phone number {string}")
        public void user_enters_phone_number(String phoneNumber) {
        defaultPage.phoneNumberField.sendKeys(phoneNumber);
        }

        @Then("user enters zip code {string}")
        public void user_enters_zip_code(String zipCode) {
        defaultPage.zipCodeField.sendKeys(zipCode);
        }

        @Then("user enters address {string} and {string}")
        public void user_enters_address_and(String street, String number) {
        defaultPage.addressField.sendKeys(street+" " +number);
        }

        @Then("user enters city {string}")
        public void user_enters_city(String city) {
        defaultPage.cityField.sendKeys(city);
        }
        @Then("user enters country {string}")
        public void user_enters_country(String country) {
                Select select = new Select(defaultPage.countryDropdownField);
                select.selectByVisibleText("USA");
               // defaultPage.countryDropdownField.sendKeys(country);
        }
        @Then("user enters a state {string} from USA")
        public void user_enters_a_state_from_usa(String state) {
        defaultPage.stateField.sendKeys(state);
        }
        @Then("user clicks on save button on customer_create page")
        public void user_clicks_on_save_button_on_customer_create_page() {
        defaultPage.saveButton.click();
        ReusableMethods.waitFor(3);

        String successMessageCreateCustomer = defaultPage.successMessageCreateCustomer.getText();
        Assert.assertTrue(successMessageCreateCustomer.contains("error"));
        }

//    DefaultPage defaultPage = new DefaultPage();
//    Faker faker = new Faker();
//    @Then("verify that user successfully logins to the account")
//    public void verify_that_user_successfully_logins_to_the_account() {
//        String myOperations = defaultPage.myOperationsText.getText();
//        Assert.assertTrue(myOperations.contains("My Operations"));
//    }
//
//    @Then("user clicks Manage Customers")
//    public void user_clicks_manage_customers() {
//        defaultPage.manageCustomers.click();
//    }
//    @Then("user clicks Create a new Customer")
//    public void user_clicks_create_a_new_customer() {
//        defaultPage.createCustomer.click();
//    }
//
//    @Then("user enters {string} number to search for the customer")
//    public void user_enters_number_to_search_for_the_customer(String SSN) {
//        defaultPage.searchSSNField.sendKeys(SSN);
//    }
//
//    @Then("user clicks search button")
//    public void user_clicks_search_button () {
//        defaultPage.searchButton.click();
//        ReusableMethods.waitFor(6);
//    }
//
//    @Then("verify that First Name is populated")
//    public void verify_that_first_name_is_populated() {
//        String firstNameText = defaultPage.firstNameField.getAttribute("Value");
//        System.out.println(firstNameText);
//        Assert.assertFalse(firstNameText.isEmpty());
//    }
//    @Then("verify that Last Name is populated")
//    public void verify_that_last_name_is_populated() {
//        String lastNameText = defaultPage.lastNameField.getAttribute("Value");
//        System.out.println(lastNameText);
//        Assert.assertFalse(lastNameText.isEmpty());
//    }
//    @Then("verify that Middle Initial is populated")
//    public void verify_that_middle_initial_is_populated() {
//        String middleInitialsText = defaultPage.middleInitialField.getAttribute("Value");
//        System.out.println(middleInitialsText);
//        if (middleInitialsText.isEmpty()){
//            defaultPage.middleInitialField.sendKeys(faker.name().nameWithMiddle());
//        }
//        //defaultPage.middleInitialField.sendKeys(faker.name().nameWithMiddle());
//        defaultPage.middleInitialField.sendKeys("mehmet");
//    }
//    @Then("verify that email is populated")
//    public void verify_that_email_is_populated() {
//        System.out.println(defaultPage.emailField.getAttribute("value"));
//        Assert.assertFalse(defaultPage.emailField.getAttribute("Value").isEmpty());
//    }
//    @Then("verify that Mobile Phone Number is populated")
//    public void verify_that_mobile_phone_number_is_populated() {
//        Assert.assertFalse(defaultPage.mobilePhoneNumberField.getAttribute("Value").isEmpty());
//    }
//    @Then("verify that Phone Number is populated")
//    public void verify_that_phone_number_is_populated() {
//
//        String phoneNumberFieldValue = defaultPage.phoneNumberField.getAttribute("Value");
//        System.out.println(phoneNumberFieldValue);
//        if(phoneNumberFieldValue.isBlank()){
//            defaultPage.phoneNumberField.sendKeys(faker.phoneNumber().phoneNumber());
//        }
//        defaultPage.phoneNumberField.sendKeys("205-900-3333");
//        System.out.println("phone number" + phoneNumberFieldValue);
//    }
//    @Then("verify that Zip Code is populated")
//    public void verify_that_zip_code_is_populated() {
//        defaultPage.zipCodeField.sendKeys("10001");
//        String zipCodeFieldValue = defaultPage.zipCodeField.getAttribute("value");
//        System.out.println(zipCodeFieldValue);
//        // Assert.assertFalse(zipCodeFieldValue.isEmpty());
//        if(zipCodeFieldValue.isEmpty()){
//            defaultPage.zipCodeField.sendKeys("10001");
//        }
//
//        System.out.println("zipcode "+zipCodeFieldValue);
//
//    }
//    @Then("verify that Address is populated")
//    public void verify_that_address_is_populated() {
//        Assert.assertFalse(defaultPage.addressField.getAttribute("Value").isEmpty());
//    }
//    @Then("verify that city is populated")
//    public void verify_that_city_is_populated() {
//        String cityFieldValue=defaultPage.cityField.getAttribute("value");
//        if (cityFieldValue.isEmpty()) {
//            defaultPage.cityField.sendKeys(faker.address().cityName());
//        };
//        defaultPage.cityField.sendKeys(faker.address().cityName());
//    }
//    @Then("verify that SSN is populated")
//    public void verify_that_ssn_is_populated() {
//        Assert.assertFalse(defaultPage.ssnField.getAttribute("Value").isEmpty());
//    }
//    @Then("verify that Create Date is populated")
//    public void verify_that_create_date_is_populated() {
//        Assert.assertFalse(defaultPage.createDateDropdownField.getAttribute("Value").isEmpty());
//    }
//    @Then("verify that Country is populated")
//    public void verify_that_country_is_populated() {
//        String countryFieldValue = defaultPage.countryDropdownField.getAttribute("Value");
//        Select select = new Select(defaultPage.countryDropdownField);
//        ReusableMethods.waitFor(3);
//        if(countryFieldValue.isEmpty()){
//            select.selectByVisibleText("USA");
//        };
//        ReusableMethods.waitFor(3);
//        select.selectByVisibleText("USA");
//    }
//    @Then("verify that State is populated")
//    public void verify_that_state_is_populated() {
//        String stateFieldValue = defaultPage.stateField.getAttribute("Value");
//        if(stateFieldValue.isEmpty()) {
//            defaultPage.stateField.sendKeys(faker.address().state());
//        };
//        defaultPage.stateField.sendKeys(faker.address().state());
//    }
////    @Then("verify that Account is populated")
////    public void verify_that_account_is_populated() {
////        Assert.assertFalse(defaultPage.accountDropdownField.getAttribute("Value").isEmpty());
////    }

}