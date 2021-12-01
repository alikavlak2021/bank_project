package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountPage {
    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Accounts']")
    public WebElement accountsText;

    @FindBy(linkText = "Create a new Account")
    public WebElement createNewAccountLink;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusDropdown;



}
