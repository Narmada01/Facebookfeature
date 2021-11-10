package StepDefinition;

import FunctionLibrary.CommonFunction;
import PageObject.searchPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class searchFriends extends CommonFunction {
    searchPOM search = new searchPOM(driver);
    facebookLogin login = new facebookLogin();

    @Given("I'm on homepage")
    public void i_m_on_homepage()  throws Exception{
        login.i_m_on_login_page();
        login.provide_registered_email_or_phone_number();
        login.provide_valid_password();
        login.click_login_button();
    }
    @When("Click on Search facebook text")
    public void click_on_search_facebook_text() {
        search.setSearchField();
    }

    @Then("land on result search page {string}")
    public void land_on_result_search_page(String expectedName) {
        search.checkTitleName(expectedName);
    }
}
