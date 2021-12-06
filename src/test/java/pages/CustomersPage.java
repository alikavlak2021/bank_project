package pages;

import org.apache.poi.hssf.record.UserSViewBegin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomersPage {
    public CustomersPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "(//span[contains(text(),'Customers')])[2]")
    public WebElement customersText;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomerButton;

    @FindBy(xpath = "(//tr)[1]")
    public WebElement manageCustomerInfoRow;

    @FindBy(xpath = "//*[contains(text(),'First Name')]")
    public WebElement infoRowFirstName;

    @FindBy(xpath = "//*[contains(text(),'Last Name')]")
    public WebElement infoRowLastName;

    @FindBy(xpath = "//*[contains(text(),'Middle Initial')]")
    public WebElement infoRowMiddleInitial;

    @FindBy(xpath = "//*[contains(text(),'Email')]")
    public WebElement infoRowEmail;

    @FindBy(xpath = "//*[contains(text(),'Mobile Phone Number')]")
    public WebElement infoRowMobilePhoneNumber;

    @FindBy(xpath = "//*[contains(text(),'Phone Number')]")
    public WebElement infoRowPhoneNumber;

    @FindBy(xpath = "//*[contains(text(),'Address')]")
    public WebElement infoRowAddress;

    @FindBy(xpath = "//*[contains(text(),'Create Date')]")
    public WebElement infoRowCreateDate;

    @FindBy(xpath = "//*[contains(text(),'View')]")
    public WebElement viewButton;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement customerInfoEditButtonInCustomerPage; // this page opens after i click View button

    @FindBy(xpath = "//*[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "(//*[contains(text(),'Delete')])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[contains(text(),'Confirm delete operation')]")
    public WebElement confirmDeleteOperationMessage;

    @FindBy(xpath = "//*[contains(text(), 'Cancel')]")
    public WebElement cancelButton;















}
