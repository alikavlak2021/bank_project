package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountsPage {
    public MyAccountsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//table/thead/tr/th[1]")
    public WebElement accountID;

    @FindBy (xpath = "//table/thead/tr/th[2]")
    public WebElement accountType;

    @FindBy (xpath = "//*[contains(text(), 'View Transaction')]")
    public WebElement viewTransaction;

    //table/tbody/tr[1]/td[4]  ==> viewTransaction için table xpath ile

    @FindBy(partialLinkText = "My Accounts")
    public WebElement myAccountsDropdown;

    @FindBy(xpath = "(//table)[2]/thead/tr/th[3]")
    public WebElement description;




}