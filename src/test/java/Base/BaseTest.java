package Base;

import driver.MyDriveri;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public static void max() {
        driver.manage().window().maximize();
    }


    @BeforeMethod(alwaysRun = true)
//   @Parameters({"browser"})
    public static void createDriver() {
        driver = MyDriveri.createDriver("chrome");


    }

    @AfterMethod(alwaysRun = true)
    public static void driverQuit() {
        driver.quit();
    }

}
//@BeforeMethod
//public static void login(){
//    driver.get(HomePageLocators.HOME_URL);
//    WaitFor.WaitFori(driver, HomePageLocators.LOGIN);
//    driver.findElement(By.cssSelector(HomePageLocators.LOGIN)).click();
//    WaitFor.WaitFori(driver, LoginLocators.EMAIL_FIELD);
//    driver.findElement(By.cssSelector(LoginLocators.EMAIL_FIELD)).sendKeys("tcohasmik+7@gmail.com");
//    driver.findElement(By.cssSelector(LoginLocators.PASSWORD_FIELD)).sendKeys("654654654");
//    WaitFor.WaitFori(driver, LoginLocators.NEXT);
//    driver.findElement(By.cssSelector(LoginLocators.NEXT)).click();
//}}
