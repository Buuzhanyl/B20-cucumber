package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.List;

public class saucedemoStepDef {
    WebDriver driver;

    @Given("I login using username")
    public void i_login_using_username() {
        driver= DriverUtils.getDriver("chrome");
        String url3= ConfigUtils.getConfigProp("url3");
        driver.get(url3);

    }
    @Then("I login suing password")
    public void i_login_suing_password() {
        WebElement loginUserName=
                driver.findElement(By.xpath("//input[@id='user-name']"));
        loginUserName.sendKeys("standard_user");
        loginUserName.click();
        WebElement loginPassword=
                driver.findElement(By.xpath("//input[@id='password']"));
        loginPassword.sendKeys("secret_sauce");
        loginPassword.click();
        WebElement clickButton=
                driver.findElement(By.xpath("//input[@id='login-button']"));
        clickButton.click();



    }
    @Then("I print all item names from page")
    public void i_print_all_item_names_from_page() {

        List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_description"));
        for (WebElement item : items) {
            System.out.println(item.getText());
        }


            }

            @Given("I am on swag login page")
            public void i_am_on_swag_login_page() {

            }
            @When("I login with visual user")
            public void i_login_with_visual_user() {
             saucedemoStepDef slp=new saucedemoStepDef();



            }
            @Then("I shoul see backpack item")
            public void i_shoul_see_backpack_item() {



    }


    }

