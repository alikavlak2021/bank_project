package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class US14_Create_or_Edit_Account_Positive_StepDefs {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    AccountPage accountPage = new AccountPage();
    RegistrationPage registrationPage = new RegistrationPage();
    CreateOrEditAccountPage createOrEditAccountPage = new CreateOrEditAccountPage();


    @Given("user navigates the sing in page")
    public void user_navigates_the_sing_in_page() {
        mainPage.signInAndRegistrationTab.click();
        mainPage.signInButton.click();
        ReusableMethods.waitFor(1);
    }
    @Given("user verifies the sing in page")
    public void user_verifies_the_sing_in_page() {
       Assert.assertTrue(loginPage.singInText.isDisplayed());

    }
    @Given("user enters Username {string}")
    public void user_enters_username(String userName) {

        loginPage.loginUserName.sendKeys(userName);
    }
    @Given("user enters Password {string}")
    public void user_enters_password(String password) {

        loginPage.loginPassword.sendKeys(password);
    }
    @Given("user enters Sing in button")
    public void user_enters_sing_in_button() {
        loginPage.signInButtonTab.click();
        ReusableMethods.waitFor(2);
    }
    @Given("user navigates the default page")
    public void user_navigates_the_default_page() {
        Assert.assertTrue(defaultPage.employeeAccountNameText.isDisplayed());
    }
    @Given("user clicks the My Operations")
    public void user_clicks_the_my_operations() {

        defaultPage.myOperationsDropdown.click();
    }
    @Given("user clicks the Manage Accounts")
    public void user_clicks_the_my_accounts() {

        defaultPage.manageAccounts.click();
    }
    @Given("user navigates the account page")
    public void user_navigates_the_account_page() {

        Assert.assertTrue(accountPage.accountsText.isDisplayed());
    }
    @Given("user clicks Create a new Account button")
    public void user_clicks_create_a_new_account_button() {

        accountPage.createNewAccountLink.click();
    }
    @Given("user navigates the Create or Edit Account Page")
    public void user_navigates_the_create_or_edit_account_page() {
       Assert.assertTrue(createOrEditAccountPage.createOrEditAccountText.isDisplayed());
    }
    @Given("user enters Description {string}")
    public void user_enters_description(String description) {
        createOrEditAccountPage.descriptionBox.sendKeys(description);
    }
    @Given("user enters Balance {string}")
    public void user_enters_balance(String account) {

        createOrEditAccountPage.accountBox.sendKeys(account);
    }
    @Given("user selects Account Type")
    public void user_selects_account_type() {
        createOrEditAccountPage.accountTypeDropDown.click();
        Select select = new Select(createOrEditAccountPage.accountTypeDropDown);
        select.selectByValue("SAVING");
        ReusableMethods.waitFor(1);
    }
    @Given("user selects Account Status Type")
    public void user_selects_account_status_type() {
        createOrEditAccountPage.accountStatusTypeDropDown.click();
        Select select = new Select(createOrEditAccountPage.accountStatusTypeDropDown);
        select.selectByValue("ACTIVE");
    }
    @Given("user enters Create Date")
    public void user_enters_create_date() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        String text = formatter.format(dateTime);
        createOrEditAccountPage.createDateBox.sendKeys(text);
        Assert.assertFalse(createOrEditAccountPage.createDateBox.getText().equals(text));

    }
    @Given("user enters Closed Date")
    public void user_enters_closed_date() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        String text = formatter.format(dateTime.plusYears(2));
        createOrEditAccountPage.closedDateBox.sendKeys(text);
        Assert.assertFalse(createOrEditAccountPage.closedDateBox.getText().equals(text));
    }
    @Given("user selects employee")
    public void user_selects_employee() {
       createOrEditAccountPage.employeeBox.click();
       Select select = new Select(createOrEditAccountPage.employeeBox);
       select.selectByIndex(0);
       String employee= createOrEditAccountPage.employeeBox.getAttribute("value");
       Assert.assertTrue(employee.isEmpty());
    }
    @Then("user clicks Save button")
    public void user_clicks_save_button() {
        createOrEditAccountPage.saveButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user verify the accounts page")
    public void user_verify_the_success_message() {

        Assert.assertTrue(accountPage.accountsText.isDisplayed());
    }

}
