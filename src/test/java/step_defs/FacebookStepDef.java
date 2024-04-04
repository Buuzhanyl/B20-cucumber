package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.FacebookHomepage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class FacebookStepDef {
    private WebDriver driver;
    private FacebookHomepage fhp;
    @Given("I am on Facebook login page")
    public void i_am_on_facebook_login_page() {
        driver= DriverUtils.getDriver("chrome");
        String url= ConfigUtils.getConfigProp("facebook_url2");
        driver.get(url);

    }
    @When("I enter invalid Facebook email {string}")
    public void i_enter_invalid_facebook_test123456_te_com(String email) {
         fhp=new FacebookHomepage(driver);
        fhp.emailField.sendKeys(email);


    }
    @When("I enter invalid facebook password {string}")
    public void i_enter_invalid_facebook_my_fav_password(String password) {

        fhp.passwordField.sendKeys(password);

        fhp.loginButton.click();

    }
    @Then("I should get message {string}")
    public void hell(String expectedErrormessage) {
    String actualErrorMessage=fhp.error.getText();

        Assert.assertTrue(actualErrorMessage.contains(expectedErrormessage));


    }
}
