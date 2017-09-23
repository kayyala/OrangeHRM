import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sudhakar on 13/09/2017.
 */
public class MyStepdefs extends BasePage{
//    WebDriver driver;
    HomePage homePage1;
    AddEMP addEMP ;
    SearchEMP searchEMP;
    DeleteEMP deleteEMP ;

    @Given("^I am navigating to orrangeHRM Website$")
    public void i_am_navigating_to_orrangeHRM_Website() throws Throwable {
        homePage1.isOnHomePage();
    }

    @When("^I enter username and password$")
    public void i_enter_username_and_password() throws Throwable {
//        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//
//        homePage1.username.sendKeys("Admin");
        homePage1.login();
    }

    @Then("^I click on Login button$")
    public void i_calick_on_Login_button() throws Throwable {
//        homePage1.Login();
    }

    @Then("^I should login sucessfuly$")
    public void i_should_login_sucessfuly() throws Throwable {
        homePage1.logout();
    }

    @And("^I should logout sucessfuly$")
    public void iShouldLogoutSucessfuly() throws Throwable {
//        homePage1.logout();
    }

    @Then("^I click on PIM button$")
    public void iClickOnPIMButton() throws Throwable {
        addEMP.newPIM();
    }

    @And("^I add new Employee$")
    public void iAddNewEmployee() throws Throwable {
        addEMP.enterfield();
    }

    @And("^I click on Employee list$")
    public void iClickOnEmployeeList() throws Throwable {
        searchEMP.emplist();
    }

    @Then("^I Search by Employee Name$")
    public void iSearchByEmployeeName() throws Throwable {
        searchEMP.searchempname();
    }

    @And("^I select by name and delete employee$")
    public void iSelectByNameAndDeleteEmployee() throws Throwable {
        deleteEMP.deleteEmp();
    }
}
