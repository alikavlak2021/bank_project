package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
public MainPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement gmiBankAssertion;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement signInAndRegistrationTab;

    @FindBy(xpath="(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(xpath="(//a[@class='dropdown-item'])[1]")
    public WebElement userInfoButton;

    @FindBy(id = "login-item")
    public WebElement signInButton;


}



