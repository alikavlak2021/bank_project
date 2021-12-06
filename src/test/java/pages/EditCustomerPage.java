package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditCustomerPage {

    public EditCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//*[contains(text(),'Create or edit a Customer')]")
    public WebElement createOrEditACustomerText;

    @FindBy(id = "tp-customer-firstName")
    public WebElement editCustomerFirstName;

    @FindBy(id = "tp-customer-lastName")
    public WebElement editCustomerLastName;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement editCustomerMiddleInitial;

    @FindBy(id = "tp-customer-email")
    public WebElement editCustomerEmail;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement editCustomerMobilePhoneNumber;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement editCustomerPhoneNumber;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement editCustomerZipCode;

    @FindBy(id = "tp-customer-address")
    public WebElement editCustomerAddress;

    @FindBy(id = "tp-customer-city")
    public WebElement editCustomerCity;

    @FindBy(id = "tp-customer-ssn")
    public WebElement editCustomerSsn;

    @FindBy(id = "tp-customer-createDate")
    public WebElement editCustomerCreateDate; //date format --> YYYY-MM-DD HH:mm

    @FindBy(id = "tp-customer-country")
    public WebElement editCustomerCountry;//dropdown

    @FindBy(id = "tp-customer-state")
    public WebElement editCustomerState;

    @FindBy(id = "tp-customer-user")
    public WebElement editCustomerUser;//dropdown

    @FindBy(id = "tp-customer-account")
    public WebElement editCustomerAccount;

    @FindBy(xpath = "//option[@value='2310']")
    public WebElement savingOptionFromAccountDropdown;

    @FindBy(xpath = "//option[@value='3976']")
    public WebElement testAccountOptionFromAccountDropdown;

    @FindBy(xpath = "//option[@value='2349']")
    public WebElement turkerAccountOptionFromAccountDropdown;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement editCustomerZelleEnrolled;

    @FindBy(id = "save-entity")
    public WebElement editCustomerSaveButton;

    //After clicking save button above, this message appears on the Customers Page
    @FindBy(xpath = "//*[contains(text(),'translation-not-found')]")
    public WebElement savedMessageText;

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

    @FindBy(id = "tp-customer-country")
    public WebElement countryDropdownField;

    @FindBy(xpath = "//input[@name='state']" )
    public WebElement stateField;

    @FindBy(xpath = "//input[@name='user']" )
    public WebElement userDropdownField;

    @FindBy(xpath = "//input[@name='account']" )
    public WebElement accountDropdownField;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(partialLinkText = "My Accounts")
    public WebElement myAccountsDropdown;

    @FindBy(xpath = "//div[contains(text(), 'translation-not-found')]")
    public WebElement translationNotFound;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement successMessageCreateCustomerBackup;

    @FindBy(xpath = "//div[@class='invalid-feedback' and .='This field is required.']")
    public WebElement thisFieldRequiredMessage;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[3]")
    public WebElement accountNameDropdown;

    @FindBy (linkText = "Sign out")
    public WebElement signOut;



}