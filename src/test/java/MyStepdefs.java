import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sudhakar on 13/09/2017.
 */
public class MyStepdefs {
    HomePage homePage = new HomePage();

    @Given("^I am navigating to orrangeHRM Website$")
    public void i_am_navigating_to_orrangeHRM_Website() throws Throwable {
        homePage.isOnHomePage();

    }

    @When("^I enter username and password$")
    public void i_enter_username_and_password() throws Throwable {
        homePage.Login();
    }

    @Then("^I calick on Login button$")
    public void i_calick_on_Login_button() throws Throwable {
        //homePage.Login();
    }

    @Then("^I should login sucessfuly$")
    public void i_should_login_sucessfuly() throws Throwable {
        homePage.Logout();

    }
}
