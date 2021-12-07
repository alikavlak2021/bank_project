package stepdefinitions;

        import io.cucumber.java.en.*;
        import org.junit.Assert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import pages.DefaultPage;
        import pages.MyAccountsPage;
        import utilities.Driver;
        import utilities.ReusableMethods;

        import java.sql.SQLOutput;
        import java.util.List;

public class US015_ManageAccountsStepDefs {

    MyAccountsPage myAccountsPage = new MyAccountsPage();
    DefaultPage defaultPage = new DefaultPage();

//    @Then("user clicks on My Operations on customer page")
//    public void user_clicks_on_my_operations_on_customer_page() {
//    ReusableMethods.waitFor(2);
//    defaultPage.myOperationsDropdown.click();
//    }

    @Then("user clicks on My Accounts")
    public void user_clicks_on_my_accounts() {
        defaultPage.myAccountsDropdownOfMyOperations.click();
    }
    @Then("verify that all account types are displayed")
    public void verify_that_all_account_types_are_displayed() {

        List<String> accountTypeList = ReusableMethods.getElementsText(By.xpath("//table/tbody/tr/td[1]"));
        System.out.println(accountTypeList);
        Assert.assertTrue(accountTypeList.contains("3976"));
    }

    @Then("user clicks on View Transaction")
    public void user_clicks_on_view_transaction() {
        myAccountsPage.viewTransaction.click();
    }
    @Then("verify that executed transactions are displayed")
    public void verify_that_executed_transactions_are_displayed() {
       List<String> descriptionListOfTransactions = ReusableMethods.getElementsText(By.xpath("//table//tbody//tr//td[3]"));

    List <WebElement> descriptionLists = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[3]"));
//    int row = 1;
//    for (WebElement eachElement : descriptionLists) {
//        System.out.println(row-1 + ". ==> " + eachElement.getText());
//        row++;
//       }

        System.out.println("description list size = " + descriptionLists.size());
        System.out.println(descriptionLists.get(30).getText());
        Assert.assertTrue(descriptionLists.get(30).getText().contains("Transfer 100.00 from account ID: 2310"));
    }
}