package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DefaultPage {

    public DefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//span[.='BF Employee1']")
    public WebElement employeeAccountNameText;

    @FindBy(xpath = "//span[.='BF Manager1']")
    public WebElement managerAccountNameText;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement myOperationsDropdown;

    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement manageCustomers;

    @FindBy(xpath = "//*[contains(text(),'Manage Accounts')]")
    public WebElement manageAccounts;

    @FindBy(xpath = "//*[contains(text(), 'My Operations')]")
    public WebElement myOperationsText;

    @FindBy(partialLinkText = "Manage Customers")
    public WebElement manageCustomersLink;

    @FindBy(partialLinkText = "Create a new Customer")
    public WebElement createCustomer;

    @FindBy(id = "search-ssn")
    public WebElement searchSSNField;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name='firstName']" )
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastName']" )
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@name='middleInitial']" )
    public WebElement middleInitialField;

    @FindBy(xpath = "//input[@name='email']" )
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']" )
    public WebElement mobilePhoneNumberField;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//input[@name='zipCode']" )
    public WebElement zipCodeField;

    @FindBy(xpath = "//input[@name='address']" )
    public WebElement addressField;

    @FindBy(xpath = "//input[@name='city']" )
    public WebElement cityField;

    @FindBy(xpath = "//input[@name='ssn']" )
    public WebElement ssnField;

    @FindBy(xpath = "//input[@name='createDate']" )
    public WebElement createDateDropdownField;

    @FindBy(xpath = "//input[@name='country']" )
    public WebElement countryDropdownField;

    @FindBy(xpath = "//input[@name='state']" )
    public WebElement stateField;

    @FindBy(xpath = "//input[@name='user']" )
    public WebElement userDropdownField;

    @FindBy(xpath = "//input[@name='account']" )
    public WebElement accountDropdownField;

    @FindBy(id = "save-entity")
    public WebElement saveButton;


}
