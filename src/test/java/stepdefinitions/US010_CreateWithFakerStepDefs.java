package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import pojos.Registrant;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WriteToTxt;

import java.util.List;

public class US010_CreateWithFakerStepDefs {

    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    String path = "src/test/resources/test_data/customer_information.txt";
    Registrant registrant = new Registrant();
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();
    DefaultPage defaultPage = new DefaultPage();

    @Given("user enters SSN number with faker")
    public void user_enters_ssn_number_with_faker() {
      String ssnNumber = faker.number().digits(9);
        registrationPage.ssn.sendKeys(ssnNumber);
        System.out.println(ssnNumber);
        registrant.setSsn(ssnNumber);
    }

    @Given("user enters firstname with faker")
    public void user_enters_firstname_with_faker() {
        String firstName1 = faker.name().firstName();
        registrationPage.firstName.sendKeys(firstName1);
        registrant.setFirstName(firstName1);

    }
    @Given("user enters lastname with faker")
    public void user_enters_lastname_with_faker() {
        String lastName1=faker.name().lastName();
        registrationPage.lastName.sendKeys(lastName1);
        registrant.setLastName(lastName1);

    }
    @Given("user enters address with faker")
    public void user_enters_address_with_faker() {
        String address=faker.address().streetAddress();
        registrationPage.addressTab.sendKeys(address);
        registrant.setAddress(address);
    }
    @Given("user enters phonenumber with faker")
    public void user_enters_phonenumber_with_faker() {
        String phoneNumber=faker.phoneNumber().phoneNumber();
        registrationPage.phoneTab.sendKeys(phoneNumber);
        registrant.setPhoneNumber(phoneNumber);
    }

    @Given("user enters username with faker")
    public void user_enters_username_with_faker() {
        String userName= faker.name().username();
        registrationPage.userNameTab.sendKeys(userName);
        registrant.setUserName(userName);
    }
    @Given("user enters email with faker")
    public void user_enters_email_with_faker() {
        String email = faker.internet().emailAddress();
        registrationPage.email.sendKeys(email);
        registrant.setEmail(email);

    }
    @Given("user enters password with faker and then enters password2")
    public void user_enters_new_password_with_faker() {
        String password=faker.name().prefix().toUpperCase()+faker.name().suffix().toLowerCase()+
                faker.number().digits(3)+"-.";
        registrationPage.firstPassword.sendKeys(password);
        registrationPage.secondPassword.sendKeys(password);

        registrant.setPassword(password);
    }

    @And("click the register button to register with faker")
    public void user_click_the_register_button_to_register_with_faker() {
        registrationPage.registerButton2.click();
        ReusableMethods.waitFor(1);
       // WriteToTxt.saveRegistrantData(path, registrant);

    }


    // The following part is to assign employee role to the new registrant

    AdminDefaultPage adminPage=new AdminDefaultPage();
    AdminUserInfoPage adminUserInfoPage = new AdminUserInfoPage();

    @Then("click the signin button to login")
    public void click_signin_button_to_login () {
        ReusableMethods.waitFor(1);
        loginpage.signInButton.click();
    }

    @Then("user clicks administration then user management")
    public void user_clicks_administration_then_user_management() {
        adminPage.administrationDropdown.click();
        adminPage.userManagement.click();
    }
    @Then("user finds the new registrant")
    public void user_finds_the_new_registrant() {
        adminUserInfoPage.createDateSorting.click();
        adminUserInfoPage.firstDeactivatedButton.click();
    }
    @Then("user assigns employee role to the new registrant")
    public void user_assigns_employee_role_to_the_new_registrant() {
        adminUserInfoPage.firstEditButton.click();
        adminUserInfoPage.roleEmployeeDropdown.click();
        adminUserInfoPage.roleAssignSaveButton.click();
    }
    @Then("user signs out")
    public void user_signs_out() {
        adminPage.accountMenuDropdown.click();
        adminPage.signOutDropdown.click();
    }

    //The following part is sending valid/invalid data and successfull address creation for a new Customer SSN

    EditCustomerPage editCustomerPage=new EditCustomerPage();

    @Given("user navigates the sign in page as a signed out user")
    public void user_is_on_main_page_as_signed_out_user() {
       mainPage.signInAndRegistrationTab.click();
       ReusableMethods.waitFor(1);
       mainPage.signInButton.click();
//       if(mainPage.registerButton.getText().contains("egister")){
//           System.out.println("is register displayed? It shouldnt");
//           ReusableMethods.waitFor(1);
//           mainPage.signInButton.click();
//       }
//
//       else if (!mainPage.registerButton.isDisplayed()){
//           System.out.println("register is not displayed");
//           defaultPage.accountNameDropdown.click();
//           defaultPage.signOut.click();
//           mainPage.signInAndRegistrationTab.click();
//           mainPage.signInButton.click();
//       }

    }
    @Then("user enters {string} number of new registrant to search for the customer")
    public void user_enters_number_of_new_registrant_to_search_for_the_customer(String ssnSpecified) {
//        System.out.println(ssnNum.getSSN_NumberWithHyphen());
//  we will get the ssn from customer_information.txt file
//        List<String> newRegistarntList = ReadTxt.returnCustomerSSNList(path);
//        String lastSSN = newRegistarntList.get(0);
//        System.out.println(lastSSN);
        editCustomerPage.searchSSNField.sendKeys(ssnSpecified);
    }
    @Then("user enters middle initial with faker")
    public void user_enters_middle_initial_with_faker() {
        editCustomerPage.middleInitialField.sendKeys(faker.name().nameWithMiddle().substring(0,1));

    }
    @Then("user enters phone number with faker")
    public void user_enters_phone_number_with_faker() {
        String phoneFaker = faker.number().digits(3)+"-"
                +faker.number().digits(3)+"-"
                +faker.number().digits(4);
        editCustomerPage.phoneNumberField.sendKeys(phoneFaker);
    }
    @Then("user enters zip code with faker")
    public void user_enters_zip_code_with_faker() {
        editCustomerPage.zipCodeField.sendKeys(faker.number().digits(5));
    }

    @Then("user clears address field")
    public void user_clears_address() {
        editCustomerPage.addressField.clear();
    }

    @Then("user clears city field")
    public void user_clears_city() {
        editCustomerPage.cityField.clear();
    }

    @Then("user clears country field")
    public void user_clears_country() {
        Select select = new Select(editCustomerPage.countryDropdownField);
        select.selectByValue("");
    }

    @Then("user clears state field")
    public void user_clears_state() {
        editCustomerPage.stateField.clear();
    }
    @Then("user enters city with faker")
    public void user_enters_city_with_faker() {
        editCustomerPage.cityField.sendKeys(faker.address().cityName());
    }

    @Then("user enters country as USA")
    public void user_enters_country_with_faker() {
        Select select = new Select(editCustomerPage.countryDropdownField);
        select.selectByVisibleText("USA");
    }
    @Then("user enters a state from USA with faker")
    public void user_enters_a_state_from_usa_with_faker() {
        editCustomerPage.stateField.sendKeys(faker.address().state());
    }

    @Then("user clicks on save button on customer_create page")
    public void user_clicks_on_save_button_on_customer_create_page() {
        editCustomerPage.saveButton.click();
        ReusableMethods.waitFor(1);

        //String successMessageCreateCustomer = editCustomerPage.translationNotFound.getText();
       // Assert.assertTrue(successMessageCreateCustomer.contains("translation-not-found"));
    }
    @Then("verify the error message for address field")
    public void verify_error_message_for_address() {
        Assert.assertTrue(editCustomerPage.thisFieldRequiredMessage.isDisplayed());
    }
    @Then("verify the error message for city field")
    public void verify_error_message_for_city() {
        Assert.assertTrue(editCustomerPage.thisFieldRequiredMessage.isDisplayed());
    }

    @Then("verify the error message for country field")
    public void verify_error_message_for_country() {
        Assert.assertTrue(editCustomerPage.thisFieldRequiredMessage.isDisplayed());
    }
    @Then("verify the error message for state field")
    public void verify_error_message_for_state() {
        Assert.assertTrue(editCustomerPage.thisFieldRequiredMessage.isDisplayed());

//        System.out.println("1st " +adminUserInfoPage.customersHeading.getText());
//        Assert.assertFalse(adminUserInfoPage.customersHeading.isDisplayed());
//        System.out.println("2nd "+adminUserInfoPage.customersHeading.getText());
    }
    @Then("user signs out of employee account")
    public void user_sign_out_of_employee_account() {
        editCustomerPage.accountNameDropdown.click();
        editCustomerPage.signOut.click();
    }

    @Then("verify the success message on customer creation page")
    public void verify_the_success_message_on_customer_creation_page() {
        ReusableMethods.waitFor(1);
//        Assert.assertTrue(editCustomerPage.translationNotFound.getText().contains("translation-not-found"));
//        System.out.println(editCustomerPage.translationNotFound.getText());
   Assert.assertTrue(adminUserInfoPage.customersHeading.isDisplayed());
    System.out.println(adminUserInfoPage.customersHeading.getText());
    }

}
