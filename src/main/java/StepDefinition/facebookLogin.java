package StepDefinition;

import FunctionLibrary.CommonFunction;
import PageObject.loginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class facebookLogin extends CommonFunction {
    loginPOM login =  new loginPOM(driver);
    @Given("I'm on Login page")
    public void i_m_on_login_page()throws Exception
    {
        String url =readProperty();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button[title*='Allow All Cookies']")).click();
    }
    @When("Provide Registered Email or phone number")
    public void provide_registered_email_or_phone_number() {
        login.setEmail();
    }
    @When("Provide Valid Password")
    public void provide_valid_password() {
        login.setPassword();
    }
    @When("Click Login Button")
    public void click_login_button() {
        login.clickLogin();
    }
    @Then("I should be re directed to home page")
    public void i_should_be_re_directed_to_home_page() {
        String resultPage =driver.getTitle();
        Assert.assertTrue(resultPage.contains("Facebook"));
    }
}
