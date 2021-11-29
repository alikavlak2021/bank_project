package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this); }


    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement loginUserNameAssertion;

    @FindBy(id = "password")
    public WebElement loginPassword;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement loginPasswordAssertion;

    @FindBy(xpath= "(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement forgetPassword;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/form/div[2]/div[4]/a")
    public WebElement registerNewAccount;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButtonTab;


    @FindBy(xpath = "(//span[text()='Sign in'])[2]")
    public WebElement singInText;

    @FindBy(partialLinkText = "My Operations")
    public WebElement myOperations;

    @FindBy(xpath= "//h1")
    public WebElement resetYourPasswordText;

    @FindBy(id = "register-title")
    public WebElement registerTitleText;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement userNamePasswordWrongMessage;














}
