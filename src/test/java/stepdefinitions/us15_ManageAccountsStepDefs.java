package stepdefinitions;

        import io.cucumber.java.en.*;
        import org.openqa.selenium.By;
        import pages.DefaultPage;
        import pages.MyAccountsPage;
        import utilities.Driver;
        import utilities.ReusableMethods;

        import java.util.List;

public class us15_ManageAccountsStepDefs {

    MyAccountsPage myAccountsPage = new MyAccountsPage();
    DefaultPage defaultPage = new DefaultPage();

    @Then("user clicks on My Accounts")
    public void user_clicks_on_my_accounts() {
        defaultPage.myOperationsDropdown.click();
        myAccountsPage.myAccountsDropdown.click();
    }
    @Then("verify that all account types are displayed")
    public void verify_that_all_account_types_are_displayed() {

        List<String> accountTypeList = ReusableMethods.getElementsText(By.xpath("//table/thead/tr/th[2])"));
        System.out.println(accountTypeList);

    }

    @Then("user clicks on View Transaction")
    public void user_clicks_on_view_transaction() {
        myAccountsPage.viewTransaction.click();
    }
    @Then("verify that executed transactions are displayed")
    public void verify_that_executed_transactions_are_displayed() {
        List<String> descriptionListOfTransactions = ReusableMethods.
                getElementsText(By.xpath("(//table)[2]/thead/tr/th[3]"));
        System.out.println(descriptionListOfTransactions);
    }






}