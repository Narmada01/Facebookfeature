package StepDefinition;

import FunctionLibrary.CommonFunction;
import PageObject.AccountPOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class Accountsetting extends CommonFunction {
    AccountPOM account = new AccountPOM(driver);
    facebookLogin login = new facebookLogin();

    @When("Click on account settings")
    public void click_on_account_settings()throws Exception {
        login.i_m_on_login_page();
        login.provide_registered_email_or_phone_number();
        login.provide_valid_password();
        login.click_login_button();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        account.setIcon();
    }
    @When("Choose Display and Accessability")
    public void choose_display_and_accessability() {
        account.setDisplay();
    }
    @When("Turn on Dark mode")
    public void turn_on_dark_mode() {
        account.setOn();
    }
    @When("Turn on Compact mode")
    public void turn_on_compact_mode() {

    }
    @When("return to account setting")
    public void return_to_account_setting() {

    }
    @Then("Logout")
    public void logout() {

    }
}
