import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 17/09/2017.
 */
public class DeleteEMP {
    WebDriver driver;
    @FindBy(xpath = ".//*[@id='employee_name_quick_filter_employee_list_value']")
    WebElement searchby_empname;
    @FindBy(xpath = "//*[@id='quick_search_icon']")
    WebElement search;
    @FindBy(xpath = ".//*[@id='employeeListTable']/tbody/tr/td[1]/label")
    WebElement select_emp;
    @FindBy(xpath = ".//*[@id='employeeListTable']/thead/tr/th[1]/a/i")
    WebElement delete_select_emp;
    @FindBy(xpath = "/*[@ng-click='vm.delete()']")
    WebElement getDelete_select_emp;
    @FindBy(xpath = "//*[@ng-click='modal.confirm()']")
    WebElement confirm_delete;

    public DeleteEMP(WebDriver driver) {
        this.driver = driver;

    }

    public void deleteEmp() throws InterruptedException {


        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        searchby_empname.sendKeys("dad");
        Thread.sleep(10000);
//        driver.findElement(By.xpath(".//*[@id='employee_name_quick_filter_employee_list_value']")).sendKeys(Keys.ENTER);
        search.click();
        Thread.sleep(10000);
        select_emp.click();
        Thread.sleep(2000);
        delete_select_emp.click();
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[text()='Delete Selected']")).click();
        getDelete_select_emp.click();
        Thread.sleep(2000);
        confirm_delete.click();

    }
}
