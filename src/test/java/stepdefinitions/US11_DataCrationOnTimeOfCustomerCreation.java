package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ReusableMethods;

public class US11_DataCrationOnTimeOfCustomerCreation {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    CustomersPage customersPage = new CustomersPage();
    EditCustomerPage editCustomerPage = new EditCustomerPage();

    @Given("user clicks the Manage Customers")
    public void user_clicks_the_manage_customers() {
        defaultPage.manageCustomers.click();
        ReusableMethods.waitFor(1);
    }
    @Given("user navigates the Customers Page")
    public void user_navigates_the_customers_page() {
        Assert.assertTrue(customersPage.createANewCustomer.isDisplayed());
    }
    @Given("user clicks Create a new Customer")
    public void user_clicks_create_a_new_customer() {
        customersPage.createANewCustomer.click();
    }
    @Given("user verifies the Create or edit a Customer text")
    public void user_verifies_the_create_or_edit_a_customer_text() {
        Assert.assertTrue(editCustomerPage.createOrEditACustomerText.isDisplayed());
    }
    @Given("user enters middleInitial {string}")
    public void user_enters_middle_initial(String middleInitial) {
        editCustomerPage.editCustomerMiddleInitial.sendKeys(middleInitial);
    }
    @Given("user enters an email {string}")
    public void user_enters_an_email(String email) {
       editCustomerPage.editCustomerEmail.sendKeys(email);
    }
    @Given("user enters mobile phone number {string}")
    public void user_enters_mobile_phone_number(String MobilePhoneNumber) {
        editCustomerPage.editCustomerMobilePhoneNumber.sendKeys(MobilePhoneNumber);
    }
    @Given("user enters phone number {string}")
    public void user_enters_phone_number(String PhoneNumber) {
        editCustomerPage.editCustomerPhoneNumber.sendKeys(PhoneNumber);
    }
    @Given("user enters zip code {string}")
    public void user_enters_zip_code(String ZipCode) {
        editCustomerPage.editCustomerZipCode.sendKeys(ZipCode);
    }
    @Given("user enters city {string}")
    public void user_enters_city(String City) {
        editCustomerPage.editCustomerCity.sendKeys(City);
    }
    @Given("user enters ssn number {string}")
    public void user_enters_ssn_number(String Ssn) {
        editCustomerPage.editCustomerSsn.sendKeys(Ssn);

    }
    @Given("user clicks the Country dropbox")
    public void user_clicks_the_country_dropbox() {
        editCustomerPage.editCustomerCountry.click();
    }
    @Given("user select USA")
    public void user_select_usa() {
        Select select = new Select(editCustomerPage.editCustomerCountry);
        select.selectByVisibleText("USA");
    }
    @Given("user enters state {string}")
    public void user_enters_state(String state) {
        editCustomerPage.editCustomerState.sendKeys(state);
    }
    @Given("user clicks User dropbox")
    public void user_clicks_user_dropbox() {
        editCustomerPage.editCustomerUser.click();
    }
    @Given("user selects cup-tan cup ay")
    public void user_selects_cup_tan_cup_ay() {
        Select select = new Select(editCustomerPage.editCustomerUser);
        select.selectByVisibleText("cup-tan cup ay");
    }
    @Given("user clicks account box")
    public void user_clicks_account_box() {
        editCustomerPage.editCustomerAccount.click();
    }
    @Given("user select test account from options")
    public void user_select_test_account_from_options() {
        editCustomerPage.testAccountOptionFromAccountDropdown.click();
    }
    @Given("user click the zelle enrolled")
    public void user_click_the_zelle_enrolled() {
        editCustomerPage.editCustomerZelleEnrolled.click();
    }
    @Then("user verifies the success message")
    public void user_verifies_the_success_message() {

    }


}
