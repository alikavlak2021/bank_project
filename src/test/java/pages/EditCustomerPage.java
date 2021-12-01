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

    //ssn1  yeni eklendi
    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement ssn1;

    //search button yeni eklendi
    @FindBy(xpath = "//*[contains(text(),'Search')]")
    public WebElement searchButton;

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
}
