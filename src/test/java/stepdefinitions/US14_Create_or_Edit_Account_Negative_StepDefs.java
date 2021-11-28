package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CreateOrEditAccountPage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class US14_Create_or_Edit_Account_Negative_StepDefs {
    CreateOrEditAccountPage createOrEditAccountPage = new CreateOrEditAccountPage();


    @Given("user enters early Create Date")
    public void user_enters_early_create_date() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        String text1 = formatter.format(dateTime.minusDays(2));
        String text2 = formatter.format(dateTime);
        createOrEditAccountPage.createDateBox.sendKeys(text1);
        Assert.assertFalse(createOrEditAccountPage.createDateBox.getText().equals(text2));
    }
    @Given("user enters early Closed Date")
    public void user_enters_early_closed_date() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        String text = formatter.format(dateTime.minusMonths(1));
        createOrEditAccountPage.closedDateBox.sendKeys(text);
        Assert.assertFalse(createOrEditAccountPage.closedDateBox.getText().equals(text));
    }
    @Given("user selects employee and it should not be empty")
    public void user_selects_employee_and_it_should_not_be_empty() {
        createOrEditAccountPage.employeeBox.click();
        Select select = new Select(createOrEditAccountPage.employeeBox);
        select.selectByIndex(0);
        String employee= createOrEditAccountPage.employeeBox.getAttribute("value");
        Assert.assertTrue(employee.isEmpty());
    }
    @Then("user should see This field is required for Description")
    public void user_should_see_this_field_is_required_for_description() {
        Assert.assertTrue(createOrEditAccountPage.descriptionText.isDisplayed());
    }
    @Then("user should see This field is required for Balance")
    public void user_should_see_this_field_is_required_for_balance() {
        Assert.assertTrue(createOrEditAccountPage.balanceText.isDisplayed());
    }

}
