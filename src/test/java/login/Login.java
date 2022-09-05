package login;

import helpers.WaitFor;
import locators.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseTest;

public class Login extends BaseTest {
    @Test(description = "login with invalid password  ", groups = {"login"})
    public void logInValidData() {
        driver.get(locators.HomePage.HOME_URL);
        WaitFor.WaitFori(driver, HomePage.EMAIL).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.EMAIL)).click();
        WaitFor.WaitFori(driver, HomePage.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.EMAIL)).sendKeys("tatev@solidblock.co");
        driver.findElement(By.cssSelector(HomePage.PASSWORD)).sendKeys("111aaaAAA!!!");
        WaitFor.WaitFori(driver, HomePage.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.LOGIN_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePage.AFTER_LOGIN).isDisplayed();


    }

    @Test(description = "login with invalid email ", groups = {"login"})
    public void logInInValidEmail() {
        driver.get(locators.HomePage.HOME_URL);
        WaitFor.WaitFori(driver, HomePage.EMAIL).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.EMAIL)).click();
        WaitFor.WaitFori(driver, HomePage.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.EMAIL)).sendKeys("tatev@test.co");
        driver.findElement(By.cssSelector(HomePage.PASSWORD)).sendKeys("111aaaAAA!!!");
        WaitFor.WaitFori(driver, HomePage.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.LOGIN_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePage.INVALID_EMAIL).isDisplayed();


    }
    @Test(description = "login with invalid password  ", groups = {"login"})
    public void logInInValidPassword() {
        driver.get(locators.HomePage.HOME_URL);
        WaitFor.WaitFori(driver, HomePage.EMAIL).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.EMAIL)).click();
        WaitFor.WaitFori(driver, HomePage.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.EMAIL)).sendKeys("tatev@solidblock.co");
        driver.findElement(By.cssSelector(HomePage.PASSWORD)).sendKeys("11111111");
//        WaitFor.WaitFori(driver, HomePage.LOGIN_BUTTON).isDisplayed();
        driver.findElement(By.cssSelector(HomePage.LOGIN_BUTTON)).click();
        WaitFor.WaitFori(driver, HomePage.INVALID_PASS).isDisplayed();


    }


}