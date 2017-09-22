import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sudhakar on 17/09/2017.
 */
public class SearchEMP {
    WebDriver driver;
    @FindBy(xpath = ".//*[@id='menu_pim_viewEmployeeList']/span[2]")
    WebElement PIM_VIEW;
    @FindBy(xpath = ".//*[@id='employee_name_quick_filter_employee_list_value']")
    WebElement search_byempname;
    @FindBy(xpath = ".//*[@id='quick_search_icon']")
    WebElement search_click;
    @FindBy(xpath = ".//*[text()='sri  beckamrr ']")
    WebElement asserting_byname;
    public SearchEMP(WebDriver driver){
        this.driver=driver;

    }

    public void emplist() throws InterruptedException {
        Thread.sleep(2000);
//         driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']/span[2]")).click();
        PIM_VIEW.click();
        //.//*[@id='menu_pim_viewEmployeeList']/span[2]

    }

    public void searchempname() throws InterruptedException {
        Thread.sleep(2000);
        search_byempname.sendKeys("dad");
        search_click.click();
        String actual = asserting_byname.getText();
        String expected = "sri beckamrr";
        System.out.println("expected result is  " + expected);
        Assert.assertEquals(expected, actual);
        System.out.println("sucessfuly seach by name ");
    }
}
