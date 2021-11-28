package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDefaultPage {

    public AdminDefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//*[.='Maria Bruno']")
    public WebElement adminAccountNameText;

    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administrationDropdown;

    @FindBy(xpath = "//span[.='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "//*[.='Metrics']")
    public WebElement metrics;

    @FindBy(xpath = "//*[.='Health']")
    public WebElement health;

    @FindBy(xpath = "//*[.='Configuration']")
    public WebElement configuration;

    @FindBy(xpath = "//*[.='Audits']")
    public WebElement audits;

    @FindBy(xpath = "//*[.='Logs']")
    public WebElement logs;

    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement adminPageManageCustomers;

    @FindBy(xpath = "//*[contains(text(),'Manage Accounts')]")
    public WebElement adminPageManageAccounts;

    @FindBy (xpath = "//span[.='do not write last']")
    public WebElement accountMenuDropdown;

    @FindBy (xpath = "//span[.='Sign out']")
    public WebElement signOutDropdown;
}
