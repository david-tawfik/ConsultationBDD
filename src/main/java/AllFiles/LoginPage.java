package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage
{
    static By  emailLocator = By.id("email");
    static By passwordLocator = By.id("password");
    static By submitButtonLocator = By.id("submit");

    static By errorMessageLocator = By.id("error");
    static By signUpButtonLocator = By.id("signup");

public LoginPage() throws InterruptedException {
    }
    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void goToLoginPage(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://thinking-tester-contact-list.herokuapp.com/login");
    }
    public static void enterEmail(WebDriver driver, String email)
    {
        explicitWait(driver,15, emailLocator);
        driver.findElement(emailLocator).sendKeys(email);
    }

    public static void enterPassword(WebDriver driver, String password)
    {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public static void clickSubmitButton(WebDriver driver) throws InterruptedException {
        driver.findElement(submitButtonLocator).click();
        Thread.sleep(3000);
    }

    public static void clickSignUpButton(WebDriver driver) throws InterruptedException {
        driver.findElement(signUpButtonLocator).click();
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




}
