import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 14/09/2017.
 */
public class AddEMP  {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='menu_pim_viewPimModule']/a/span[1]")
    WebElement PIM;
    @FindBy(xpath = ".//*[@id='menu_pim_addEmployee']/span[2]")
    WebElement getAdd_emp;
    @FindBy(id = "firstName")
    WebElement add_fname;
    @FindBy(xpath = ".//*[@id='lastName']")
    WebElement add_lname;
    @FindBy(xpath = "/.//*[@id='location_inputfileddiv']/div/input")
    WebElement location_dropdown_select;
    @FindBy(xpath = "//div[@class='select-wrapper initialized']/ul/li[5]/span")
    WebElement location_select;
    @FindBy(xpath = ".//*[@id='systemUserSaveBtn']")
    WebElement savebtn;
    public AddEMP(WebDriver driver){
        this.driver=driver;

    }

    public void newPIM() throws Exception {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        PIM.click();
        // driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']/span[2]")).click();
    }

    public void enterfield() throws Exception {
        Thread.sleep(2000);
        getAdd_emp.click();
        add_fname.sendKeys("sri1");
        add_lname.sendKeys("beckamrr");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(location_dropdown_select).click().build().perform();
        Thread.sleep(3000);
        location_select.click();
        savebtn.click();

    }

}
