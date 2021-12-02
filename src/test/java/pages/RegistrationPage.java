package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="firstPassword")
    public WebElement firstPassword;

    @FindBy(id="secondPassword")
    public WebElement secondPassword;

    @FindBy(id="login-item")
    public WebElement signInButton;

    @FindBy(xpath= "(//input[@type='text'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressTab;

    @FindBy(id = "register-submit")
    public WebElement registerButton2;

    @FindBy(xpath = "//*[contains(text(),'Registration saved')]")
    public WebElement successMessage;

    @FindBy(id = "mobilephone")
    public WebElement phoneTab;

    @FindBy(id = "username")
    public WebElement userNameTab;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement passwordShouldContain;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement invalidSsnText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement invalidEmailText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement passwordShouldMatchWithFirstOne;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement emailTextIncorrectMessage;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrength3;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrength4;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement passwordStrength5;

    @FindBy(xpath="//*[contains(text(),'Please enter your social security number.')]")
    public WebElement InvalidBlankSSN;

    @FindBy(xpath="//*[contains(text(),'Please enter your first name.')]")
    public WebElement blankUserName;

    @FindBy(xpath="//*[contains(text(),'Please enter your last name.')]")
    public WebElement blankLastname;

    @FindBy(xpath="//*[contains(text(),'Your email is invalid.')]")
    public WebElement invalidMailText;


    }

