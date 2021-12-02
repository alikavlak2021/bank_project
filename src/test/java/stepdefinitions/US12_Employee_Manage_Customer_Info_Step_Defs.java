package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;
import utilities.ReusableMethods;

public class US12_Employee_Manage_Customer_Info_Step_Defs {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    CustomersPage customersPage = new CustomersPage();
    EditCustomerPage editCustomerPage = new EditCustomerPage();

    @Given("user navigates the sign in page")
    public void user_navigates_the_sign_in_page() {
        mainPage.signInAndRegistrationTab.click();

    }
    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        mainPage.signInButton.click();
        ReusableMethods.waitFor(1);
    }
    @Given("user clicks the Manage Customers")
    public void user_clicks_the_manage_customers() {
        Assert.assertTrue(defaultPage.myOperationsText.isDisplayed());
        ReusableMethods.waitFor(1);
        defaultPage.manageCustomers.click();
    }
    @Given("user navigates the Customers page")
    public void user_navigates_the_customers_page() {
        Assert.assertTrue(customersPage.customersText.isDisplayed());
    }
    @Then("user verifies {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_verifies(String firstName, String lastName, String middleInitial, String email, String mobilePhoneNumber, String phoneNumber, String address, String createDate) {
        Assert.assertTrue(customersPage.infoRowFirstName.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowLastName.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowMiddleInitial.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowEmail.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowMobilePhoneNumber.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowPhoneNumber.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowAddress.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(customersPage.infoRowCreateDate.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @Then("user sees View option and clicks")
    public void user_sees_view_option_and_clicks() {
        Assert.assertTrue(customersPage.viewButton.isDisplayed());
        ReusableMethods.waitFor(1);
        customersPage.viewButton.click();

    }
    @Then("user verifies the Edit button is visible")
    public void user_verifies_the_edit_button_is_visible() {
        Assert.assertTrue(customersPage.editButton.isDisplayed());

    }
    @Then("user sees Edit button and clicks")
    public void user_sees_edit_button_and_clicks() {
        customersPage.editButton.click();
        ReusableMethods.waitFor(1);
    }
    @Then("the Edit button should be clickable")
    public void the_edit_button_should_be_clickable() {
        Assert.assertTrue(customersPage.editButton.isEnabled());
        ReusableMethods.waitFor(1);
    }
    @Then("user navigates the Create or Edit Customer page")
    public void user_navigates_the_create_or_edit_customer_page() {
        Assert.assertTrue(editCustomerPage.createOrEditACustomerText.isDisplayed());
    }
    @Then("user edits First Name {string}")
    public void user_edits_first_name(String customerFirstName) {
        editCustomerPage.editCustomerFirstName.sendKeys("first_name");
    }
    @Then("user edits Last Name {string}")
    public void user_edits_last_name(String customerLastName) {
        editCustomerPage.editCustomerLastName.sendKeys("last_name");
    }
    @Then("user edits Email {string}")
    public void user_edits_email(String customerEmail) {
        editCustomerPage.editCustomerEmail.sendKeys("email");
    }
    @Then("user edits Mobile Phone Number {string}")
    public void user_edits_mobile_phone_number(String customerMobilePhoneNumber) {
        editCustomerPage.editCustomerMobilePhoneNumber.sendKeys("mobile_phone_number");
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        editCustomerPage.editCustomerSaveButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user sees  the green message that includes {string} in the Manage Customers page")
    public void user_sees_the_green_message_that_includes_in_the_page(String successMessage) {

        Assert.assertTrue(editCustomerPage.savedMessageText.getText().contains(successMessage));
    }
    @Then("user sees Delete button and clicks")
    public void user_sees_delete_button_and_clicks() {
        customersPage.deleteButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user verifies the {string} message")
    public void user_verifies_the_message(String confirmDeleteOperationMessage) {
        Assert.assertTrue(customersPage.confirmDeleteOperationMessage.getText().contains(confirmDeleteOperationMessage));
    }
}
