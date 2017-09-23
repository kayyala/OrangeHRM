import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 13/09/2017.
 */
public class HomePage extends BasePage {




  public void isOnHomePage() {
    // return driver.getCurrentUrl();
//    System.out.println("IT'S LOGIN PAGE   ");

  }

  @FindBy(xpath = ".//*[@id='txtUsername")
  WebElement username;
  @FindBy(xpath = ".//*[@id='txtPassword']")
  WebElement password;
  @FindBy(xpath = ".//*[@id='btnLogin'] ")
  WebElement btlogin;
  @FindBy(xpath = ".//*[@id='primary-header']/div/nav/div/ul[1]/li[2]/span[1]")
  WebElement dashbord;
  @FindBy(xpath = ".//*[@id='account-job']/i")
  WebElement logout_1;
  @FindBy(xpath = ".//*[@id='user_menu']/li[4]/a")
  WebElement logout_2;
  @FindBy(tagName = "iframe")
  WebElement iframe;

  public HomePage(WebDriver driver) {
//    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void login() {

    System.out.println("IT'S LOGIN PAGE   ");
    driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    username.sendKeys("Admin");
    password.sendKeys("RRofxm4R");
    btlogin.click();
  }
////        driver.findElement(By.xpath(".//*[@id='txtUsername']")).clear();
////        driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
////        driver.findElement(By.xpath(".//*[@id='txtPassword']")).clear();
////        driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("RRofxm4R");
////        driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
//        System.out.println("Login sucessfully " + driver.getTitle());
//        //Thread.sleep(3000);
//        // int sises = iframe.hashCode();
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.print("total frames in page  " + size);
//        driver.switchTo().frame(0);
//        String actual = dashbord.getText();
//        String expected = "Dashboard";
//        System.out.println("expected result  " + expected);
//        Assert.assertTrue(actual.contains("Dashboard"));
//    }
//
    public void logout() throws Exception {
        System.out.println(" THIS is url  " + driver.getTitle());

        Thread.sleep(3000);
        logout_1.click();
        //driver.findElement(By.xpath(".//*[@id='account-job']/i")).click();
        Thread.sleep(3000);
        logout_2.click();
//        //driver.findElement(By.xpath(".//*[@id='user_menu']/li[4]/a")).click();
//        System.out.println("Account as been logout succesfully");
//
//    }
  }
}