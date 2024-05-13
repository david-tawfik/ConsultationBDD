package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
    static By  usernameLocator = By.id("user-name");
    static By passwordLocator = By.id("password");
    static By loginButtonLocator = By.id("login-button");

    static By errorMessageLocator = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

public LoginPage() throws InterruptedException {
    }
    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void goToLoginPage(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://www.saucedemo.com/");
    }
    public static void enterUsername(WebDriver driver, String email)
    {
        explicitWait(driver,15, usernameLocator);
        driver.findElement(usernameLocator).sendKeys(email);
    }

    public static void enterPassword(WebDriver driver, String password)
    {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public static void clickLoginButton(WebDriver driver) throws InterruptedException {
        driver.findElement(loginButtonLocator).click();
        Thread.sleep(3000);
    }

    public static void clickSignUpButton(WebDriver driver) throws InterruptedException {
        driver.findElement(loginButtonLocator).click();
           Thread.sleep(3000);
    }

    public static String getErrorMessage(WebDriver driver)
    {
        return driver.findElement(errorMessageLocator).getText();
    }
    public static void assertEqualUrls(String expectedUrl, String actualUrl)
    {
        if (!expectedUrl.equals(actualUrl)) {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }

    public static void assertUrlContains(String expectedUrl, String actualUrl)
    {
        if (!actualUrl.contains(expectedUrl)) {
            throw new AssertionError("URL does not contain expected value: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }



}
