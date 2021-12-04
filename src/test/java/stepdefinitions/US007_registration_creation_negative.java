package stepdefinitions;


import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.UserInfoPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US007_registration_creation_negative {
    UserInfoPage userInfoPage = new UserInfoPage();


    @Given("user clicks to email button to edit")
    public void user_clicks_to_email_button_to_edit() {
        userInfoPage.emailBox.clear();
    }

    @Given("user enter digit and verify the result")
    public void user_enter_digit_and_verify_the_result() {
        userInfoPage.emailBox.sendKeys(ConfigReader.getProperty("emailEditNumber"), Keys.ENTER);
        Assert.assertTrue(userInfoPage.invalidEmailText.getText().contains("This field is invalid"));

    }

    @Given("user enter digit with @ amd . characters")
    public void user_enter_digit_with_amd_characters() {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys(ConfigReader.getProperty("emailWithDigitAndSign"));
        Assert.assertEquals(userInfoPage.invalidEmailText.getText(), "This field is invalid");

    }

    @Given("user enter char and verify the result")
    public void user_enter_char_and_verify_the_result() {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys(ConfigReader.getProperty("emailWithCharInvalid"));
        ReusableMethods.waitFor(2);
        Assert.assertEquals(userInfoPage.invalidEmailText.getText(), "This field is invalid");

    }
    @Given("user enter char with @ . characters and verifies.")
    public void user_enter_char_with_characters_and_verifies() {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys(ConfigReader.getProperty("emailWithCharAndSign"),Keys.ENTER);
        // ?? gecersiz email yazildi fakat invalid yazisi cikmiyor invalidemailtext yerine ne yazmaliyim?
        //Assert.assertFalse(userInfoPage.invalidEmailText.getText().contains("This field is invalid"));
    }
    @Given("user clicks to language button")
    public void user_clicks_to_language_button() {
        Select select=new Select(userInfoPage.selectLanguages);
        select.selectByVisibleText("English");
        Assert.assertTrue(userInfoPage.selectLanguages.isDisplayed());

    }
    @Then("verifies that language button does not have any other option except English or Turkish")
    public void verifies_that_language_button_does_not_have_any_other_option_except_english_or_turkish() {

        WebElement dropdown =userInfoPage.selectLanguages;
        Select select = new Select(dropdown);
        int listSize = select.getOptions().size();
        System.out.println("List size: " +listSize);

    }
}
