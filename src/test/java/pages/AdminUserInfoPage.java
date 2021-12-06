package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminUserInfoPage {

    public AdminUserInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Created date']")
    public WebElement createDateSorting;

    @FindBy (xpath = "//span[.='Deactivated']")
    public WebElement firstDeactivatedButton;

    @FindBy (xpath = "(//span[.='Edit'])[2]")
    public WebElement firstEditButton;

    @FindBy (xpath = "//option[@value='ROLE_EMPLOYEE']")
    public WebElement roleEmployeeDropdown;

    @FindBy (xpath = "//span[.='Save']")
    public WebElement roleAssignSaveButton;




}