package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditAccountPage {
    public CreateOrEditAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Create or edit a Account']")
    public WebElement createOrEditAccountText;

    @FindBy(id = "tp-account-description")
    public WebElement descriptionBox;

    @FindBy(id = "tp-account-balance")
    public WebElement accountBox;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropDown;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusTypeDropDown;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDateBox;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDateBox;

    @FindBy(id = "tp-account-employee")
    public WebElement employeeBox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "(//div[text()='This field is required.'])[1]")
    public WebElement descriptionText;

    @FindBy(xpath = "(//div[text()='This field is required.'])[2]")
    public WebElement balanceText;


}
