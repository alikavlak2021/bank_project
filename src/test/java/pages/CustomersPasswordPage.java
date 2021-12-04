package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomersPasswordPage {

    public CustomersPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

@FindBy(id="currentPassword")
    public WebElement currentPassword;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement differentText;

    @FindBy(id = "newPassword")
    public WebElement newPasswordField;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement firstofChartLevel;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement secondofChartLevel;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement thirdofChartLevel;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement fourthofChartLevel;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement fifthofChartLevel;

    @FindBy(id="confirmPassword")
    public WebElement confirmPasswordField;


}
