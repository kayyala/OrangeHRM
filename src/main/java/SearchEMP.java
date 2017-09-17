import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 17/09/2017.
 */
public class SearchEMP extends BasePage {

    public void emplist() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/a/span[1]")).click();
Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']/span[2]")).click();
        //.//*[@id='menu_pim_viewEmployeeList']/span[2]

    }

    public void searchempname() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='employee_name_quick_filter_employee_list_value']")).sendKeys("sri");
        driver.findElement(By.xpath(".//*[@id='quick_search_icon']")).click();
        String actual=driver.findElement(By.xpath("//*[text()='sri  beckamrr ']")).getText();
        String expected = "sri beckamrr";
//        System.out.println("expected resultAAAAAAAAAA  "+expected);
        Assert.assertEquals(expected,actual);
        System.out.println("sucessfuly seach by name ");
    }
}
