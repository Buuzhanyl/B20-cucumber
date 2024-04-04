package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelPlaygroundHomepage {
   public SelPlaygroundHomepage(WebDriver driver){
       PageFactory.initElements(driver, this);

   }
   @FindBy(xpath = "//a[@href='https://www.lambdatest.com/selenium-playground/input-form-demo']")
    public WebElement InForSub;
   @FindBy(xpath = "//input[@id='name']")
    public WebElement name;
   @FindBy(xpath = "//input[@id='inputEmail4']")
    public WebElement email;
   @FindBy(xpath = "//input[@id='inputPassword4']")
    public WebElement password;
   @FindBy(xpath = "//input[@id='company']")
    public  WebElement company;
   @FindBy(xpath = "//input[@id='websitename']")
    public WebElement website;
   @FindBy(xpath = "//select[@name='country']")
    public WebElement country;
   @FindBy(xpath = "//input[@id='inputCity']")
    public WebElement city;
   @FindBy(xpath = "//input[@id='inputAddress1']")
    public WebElement address;
   @FindBy(xpath = "//input[@id='inputAddress2']")
    public WebElement address2;
   @FindBy(xpath = "//input[@id='inputState']")
    public WebElement state;
   @FindBy(xpath = "//input[@id='inputZip']")
    public WebElement zipcode;
   @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;
   @FindBy(xpath = "//p[@class='success-msg hidden']")
    public WebElement successMessage;


}
