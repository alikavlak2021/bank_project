//
//package stepdefinitions;
//
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.support.ui.Select;
//import pages.DefaultPage;
//import utilities.ReusableMethods;
//
//
//public class US10_CreateAddressOfCustomerStepDefs {
//        DefaultPage defaultPage = new DefaultPage();
//
//        @Then("user enters middle initial {string}")
//        public void user_enters_middle_initial(String middleInitial) {
//        defaultPage.middleInitialField.sendKeys(middleInitial);
//        }
//
//        @Then("user enters phone number {string}")
//        public void user_enters_phone_number(String phoneNumber) {
//        defaultPage.phoneNumberField.sendKeys(phoneNumber);
//        }
//
//        @Then("user enters zip code {string}")
//        public void user_enters_zip_code(String zipCode) {
//        defaultPage.zipCodeField.sendKeys(zipCode);
//        }
//
//        @Then("user enters address {string} and {string}")
//        public void user_enters_address_and(String street, String number) {
//        defaultPage.addressField.sendKeys(street+" " +number);
//        }
//
//        @Then("user enters city {string}")
//        public void user_enters_city(String city) {
//        defaultPage.cityField.sendKeys(city);
//        }
//        @Then("user enters country {string}")
//        public void user_enters_country(String country) {
//                Select select = new Select(defaultPage.countryDropdownField);
//                select.selectByVisibleText("USA");
//               // defaultPage.countryDropdownField.sendKeys(country);
//        }
//        @Then("user enters a state {string} from USA")
//        public void user_enters_a_state_from_usa(String state) {
//        defaultPage.stateField.sendKeys(state);
//        }
////        @Then("user clicks on save button on customer_create page")
////        public void user_clicks_on_save_button_on_customer_create_page() {
////        defaultPage.saveButton.click();
////        ReusableMethods.waitFor(3);
////
////        String successMessageCreateCustomer = defaultPage.successMessageCreateCustomer.getText();
////        Assert.assertTrue(successMessageCreateCustomer.contains("error"));
////        }
//
//}