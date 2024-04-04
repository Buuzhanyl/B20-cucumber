package step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.time.Duration;
import java.util.List;

public class HerokuappStepDefs {
    WebDriver driver;

    @When("I navigate to home page")
    public void i_navigate_to_home_page() {
        driver= DriverUtils.getDriver("chrome");
        String url= ConfigUtils.getConfigProp("url");
        driver.get(url);





    }
    @Then("I shuold see {int} links")
    public void i_shuold_see_links(int int1) {
        List<WebElement>linkElementList=driver.findElements(By.xpath("//li//a"));

        int linkCount=linkElementList.size();
        Assert.assertEquals(int1,linkCount);


    }

    @When("I navigate to checkboxes page")
    public void i_navigate_to_herokuapp() {
        driver= DriverUtils.getDriver("chrome");
        String url2= ConfigUtils.getConfigProp("url2");
        driver.get(url2);

    }
    @Then("I validate page header")
    public void i_sould_print_checkboxes(int int2) {
        List<WebElement>linkElementList=driver.findElements(By.tagName("h3"));

        int checkboxes=linkElementList.size();
        Assert.assertEquals(int2,checkboxes);


    }




}
