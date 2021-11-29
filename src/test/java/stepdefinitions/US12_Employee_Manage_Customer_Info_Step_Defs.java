package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;

public class US12_Employee_Manage_Customer_Info_Step_Defs {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    CustomersPage customersPage = new CustomersPage();
    EditCustomerPage editCustomerPage = new EditCustomerPage();

    @Given("user navigates the sign in page")
    public void user_navigates_the_sign_in_page() {

    }
    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {

    }
    @Given("user clicks the Manage Customers")
    public void user_clicks_the_manage_customers() {

    }
    @Given("user navigates the Customers page")
    public void user_navigates_the_customers_page() {

    }
    @Then("user verifies {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_verifies(String firstName, String lastName, String middleInitial, String email, String mobilePhoneNumber, String phoneNumber, String address, String createDate) {

    }
    @Then("user sees View option and clicks")
    public void user_sees_view_option_and_clicks() {

    }
    @Then("user verifies the Edit button is visible")
    public void user_verifies_the_edit_button_is_visible() {

    }
    @Then("user sees Edit button and clicks")
    public void user_sees_edit_button_and_clicks() {

    }
    @Then("the Edit button should be clickable")
    public void the_edit_button_should_be_clickable() {

    }
    @Then("user navigates the Create or Edit Customer page")
    public void user_navigates_the_create_or_edit_customer_page() {

    }
    @Then("user edits First Name {string}")
    public void user_edits_first_name(String customerFirstName) {

    }
    @Then("user edits Last Name {string}")
    public void user_edits_last_name(String customerLastName) {

    }
    @Then("user edits Email {string}")
    public void user_edits_email(String customerEmail) {

    }
    @Then("user edits Mobile Phone Number {string}")
    public void user_edits_mobile_phone_number(String customerMobilePhoneNumber) {

    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {

    }
    @Then("user sees  the green message that includes {string} in the Manage Customers page")
    public void user_sees_the_green_message_that_includes_in_the_page(String successMessage) {

        Assert.assertTrue(editCustomerPage.savedMessageText.getText().contains(successMessage));
    }
    @Then("user sees Delete button and clicks")
    public void user_sees_delete_button_and_clicks() {

    }
    @Then("user verifies the {string} message")
    public void user_verifies_the_message(String confirmDeleteOperationMessage) {
        Assert.assertTrue(customersPage.confirmDeleteOperationMessage.getText().contains(confirmDeleteOperationMessage));
    }
}
