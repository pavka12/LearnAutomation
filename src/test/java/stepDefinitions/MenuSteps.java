package stepDefinitions;

import utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MenuSteps extends CommonFunctions {




    @Given("^home page \"([^\"]*)\"$")
    public void home_page(String url) throws Throwable {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        takeScreenShot( "menuValidation0fProducts.png");
    }

    @When("^click to menu \"([^\"]*)\"/\"([^\"]*)\"$")
    public void click_to_menu(String menuOption, String submenuOption) throws Throwable {

        driver.findElement(By.xpath("//span[text()='"+menuOption+"']")).click();


        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//a[@title='"+submenuOption+"']"))).click().perform();


    }


    @Then("^i should be in the appropriate product lists page with header as \"([^\"]*)\"$")
    public void i_should_be_in_the_appropriate_product_lists_page_with_header_as(String expectedTitle) throws Throwable {
        String actualTitle = driver.findElement(By.xpath("//h1[contains(text(), '" + expectedTitle + "')]")).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        takeScreenShot("menuValidation1.png");
    }

}


