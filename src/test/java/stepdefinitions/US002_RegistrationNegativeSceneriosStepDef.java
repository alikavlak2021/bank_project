package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;

 //       import com.github.javafaker.Faker;
        import io.cucumber.java.en.Given;
        import org.junit.Assert;
        import org.openqa.selenium.Keys;
        import pages.LoginPage;
        import pages.RegistrationPage;
        import utilities.ReusableMethods;

public class US002_RegistrationNegativeSceneriosStepDef {
    LoginPage loginPage= new LoginPage();
    RegistrationPage registrationPage= new RegistrationPage();
    Faker faker=new Faker();

    @Given("user enters a short SSN {string} number")
    public void user_enters_a_short_ssn_number(String SSN)  {
        registrationPage.ssn.sendKeys(faker.number().digits(8), Keys.ENTER);
        ReusableMethods.waitFor(2);
    }
    @Given("verify the short SSN message")
    public void verify_the_short_ssn_message() {
        Assert.assertTrue(registrationPage.invalidSsnText.isDisplayed());

    }
    @Given("user enters long SSN {string} number")
    public void user_enters_long_ssn_number(String SSN) {
        registrationPage.ssn.sendKeys(faker.number().digits(9));

    }
    @Given("click the registration button")
    public void click_the_registration_button() {
      registrationPage.registerButton2.click();
    }
    @Given("user enter char character {string}")
    public void user_enter_char_character(String phonenumber) {
        registrationPage.ssn.sendKeys(".ds58451515");
    }
    @Given("user left blank {string}")
    public void user_left_blank(String username) {

       registrationPage.userNameTab.sendKeys("  ");
    }
    @Given("user enter email without @ sign {string}")
    public void user_enter_email_without_sign(String email) {
        registrationPage.email.sendKeys("test com.");
        Assert.assertTrue(registrationPage.invalidEmailText.getText().contains("Your email is invalid."));

    }
    @Given("user enter email without . extensions {string}")
    public void user_enter_email_without_extensions(String string) {
        registrationPage.email.sendKeys("test@com");
            Assert.assertTrue(registrationPage.email.getText().contains("Your email is invalid."));

    }
    @Given("user verify invalid attempt")
    public void user_verify_invalid_attempt() {
          Assert.assertTrue(registrationPage.phoneTab.getText().contains("Your email is invalid."));


    }

}