package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditCustomerPage {

    public EditCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//span[contains(text(),'Create or edit a Customer')]")
    public WebElement createOrEditACustomerText;

    @FindBy(name = "firstName")
    public WebElement editCustomerFirstName;

    @FindBy(name = "lastName")
    public WebElement editCustomerLastName;

    @FindBy(name = "middleInitial")
    public WebElement editCustomerMiddleInitial;

    @FindBy(name = "email")
    public WebElement editCustomerEmail;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement editCustomerMobilePhoneNumber;

    @FindBy(name = "phoneNumber")
    public WebElement editCustomerPhoneNumber;

    @FindBy(name = "zipCode")
    public WebElement editCustomerZipCode;

    @FindBy(name = "address")
    public WebElement editCustomerAddress;

    @FindBy(name = "city")
    public WebElement editCustomerCity;

    @FindBy(name = "ssn")
    public WebElement editCustomerSsn;

    @FindBy(name = "createDate")
    public WebElement editCustomerCreateDate; //date format --> YYYY-MM-DD HH:mm

    @FindBy(name = "country")
    public WebElement editCustomerCountry;//dropdown

    @FindBy(name = "state")
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
