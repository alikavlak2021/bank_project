package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ReusableMethods;

public class US14_Create_or_Edit_Account {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    AccountPage accountPage = new AccountPage();
    CreateOrEditAccountPage createOrEditAccountPage = new CreateOrEditAccountPage();


    @Given("user navigates the sing in page")
    public void user_navigates_the_sing_in_page() {
        mainPage.signInAndRegistrationTab.click();
        mainPage.signInButton.click();
    }
    @Given("user verifies the sing in page")
    public void user_verifies_the_sing_in_page() {
       //Assert.assertTrue(loginPage.loginUserNameAssertion.isDisplayed());
       //Assert.assertTrue(loginPage.loginPasswordAssertion.isDisplayed());
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
        loginPage.signInButton.click();
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
        Select select = new Select(accountPage.accountTypeDropdown);
        select.selectByIndex(2);
        accountPage.accountTypeDropdown.click();
     }
    @Given("user selects Account Status Type")
    public void user_selects_account_status_type() {
        Select select = new Select(accountPage.accountStatusDropdown);
        select.selectByVisibleText("SUESPENDED");
        accountPage.accountStatusDropdown.click();
    }
    @Given("user enters Create Date")
    public void user_enters_create_date() {

    }
    @Given("user enters Closed Date")
    public void user_enters_closed_date() {

    }
    @Then("user clicks Save button")
    public void user_clicks_save_button() {

    }

}
