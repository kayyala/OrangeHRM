import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 14/09/2017.
 */
public class AddEMP extends BasePage {

    public void newEMP() throws Exception {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/a/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']/span[2]")).click();


        Thread.sleep(2000);
    }
        public void enterfield(){

        driver.findElement(By.id("firstName")).sendKeys("david");
        driver.findElement(By.id("lastName")).sendKeys("beckam");
        new Select(driver.findElement(By.xpath(".//*[@id='location_inputfileddiv']/div/input"))).selectByVisibleText("United Kingdom");
        driver.findElement(By.xpath(".//*[@id='systemUserSaveBtn']")).click();

    }

}
