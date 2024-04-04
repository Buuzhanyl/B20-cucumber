package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.SelPlaygroundHomepage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.Map;

public class SelPlaygroundStepDef {
private WebDriver driver;
private SelPlaygroundHomepage shp;

    @Given("I am on Selenium Playground home page")
    public void i_am_on_selenium_playground_home_page() {
        driver= DriverUtils.getDriver("chrome");
        String url= ConfigUtils.getConfigProp("SelPlayground_url3");
        driver.get(url);
    }
    @When("I click Input Form Submit Link")
    public void i_click_input_form_submit_link() {
        SelPlaygroundHomepage shp=new SelPlaygroundHomepage(driver);
        shp.InForSub.click();


    }
    @Then("I enter all required data in form")
    public void i_enter_all_required_data_in_form() {
        SelPlaygroundHomepage shp=new SelPlaygroundHomepage(driver);
        shp.name.sendKeys("John");
        shp.email.sendKeys("john@gmail.com");
        shp.password.sendKeys("john123");
        shp.company.sendKeys("Codefish");
        shp.website.sendKeys("Codefish.io");
        Select select=new Select(shp.country);
        select.selectByVisibleText("United States");
        shp.city.sendKeys("DesPlanes");
        shp.address.sendKeys("2200 e Devon");
        shp.address2.sendKeys("2200 e Devon");
        shp.state.sendKeys("Illinois");
        shp.zipcode.sendKeys("60018");









    }
    @Then("I click submit")
    public void i_click_submit() {
        SelPlaygroundHomepage shp=new SelPlaygroundHomepage(driver);
        shp.submit.submit();

    }
    @Then("I validate success message")
    public void i_validate_success_message() {
        SelPlaygroundHomepage shp=new SelPlaygroundHomepage(driver);
        String succesMessHeader=shp.successMessage.getText();
        Assert.assertEquals("Thanks for contacting us, we will get back to you shortly.",succesMessHeader);

    }




    //second


    @Given("I am on Lambda home page")
    public void i_am_on_lambda_home_page() {

    }
    @When("I navigate to input form page")
    public void i_navigate_to_input_form_page() {

    }
    @When("I fill out the form with following information")
    public void i_fill_out_the_form_with_following_information(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> dataMap=dataTable.asMap();
        shp=new SelPlaygroundHomepage(driver);
        //retrieving values from datatable by keys
        String name=dataMap.get("name");
        System.out.println(name);
        shp.name.sendKeys(name);

        String email=dataMap.get("email");
        System.out.println(email);
        shp.email.sendKeys(email);

        String pWord=dataMap.get("password");
        System.out.println(pWord);
        shp.password.sendKeys(pWord);

        String company=dataMap.get("company");
        System.out.println(company);
        shp.company.sendKeys(company);

        String website=dataMap.get("website");
        System.out.println(website);
        shp.website.sendKeys(website);

        String country=dataMap.get("country");
        System.out.println(country);
        Select select=new Select(shp.country);
        select.selectByVisibleText(country);

        String city=dataMap.get("city");
        System.out.println(city);
        shp.city.sendKeys(company);

        String address1=dataMap.get("address1");
        System.out.println(address1);
        shp.address.sendKeys(address1);

        String address2=dataMap.get("address2");
        System.out.println(address2);
        shp.address2.sendKeys(address2);

        String state=dataMap.get("state");
        System.out.println(state);
        shp.state.sendKeys(state);

        String zipCode=dataMap.get("zipCode");
        System.out.println(zipCode);
        shp.zipcode.sendKeys(zipCode);



    }
    @When("click submit")
    public void click_submit() {
        shp.submit.submit();

    }
    @Then("I should see success message")
    public void i_should_see_success_message() {
        String successMessageFooter=shp.successMessage.getText();
        Assert.assertEquals("Thanks for contacting us, we will get back to you shortly.",successMessageFooter);




    }


}
