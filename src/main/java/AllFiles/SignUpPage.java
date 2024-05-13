package AllFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {

    static By firstNameLocator = By.id("firstName");
    static By lastNameLocator = By.id("lastName");
    static By emailLocator = By.id("email");
    static By passwordLocator = By.id("password");
    static By signUpButtonLocator = By.id("submit");
    static By errorMessageLocator=By.id("error");

    public SignUpPage() throws InterruptedException {
    }

    public static void explicitWait(WebDriver driver,int time, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void goToSignUpPage(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
    }

    public static void enterFirstName(WebDriver driver,String firstName)
    {
        explicitWait(driver,15, firstNameLocator);
        driver.findElement(firstNameLocator).sendKeys(firstName);
    }

    public static void enterLastName(WebDriver driver,String lastName)
    {
        explicitWait(driver,15, lastNameLocator);
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public static void enterEmail(WebDriver driver,String email)
    {
        explicitWait(driver,15, emailLocator);
        driver.findElement(emailLocator).sendKeys(email);
    }


    public static void enterPassword(WebDriver driver,String password)
    {
        explicitWait(driver,15, passwordLocator);
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public static void clickSignUpButton(WebDriver driver) throws InterruptedException {
        explicitWait(driver,15, signUpButtonLocator);
        driver.findElement(signUpButtonLocator).click();
        Thread.sleep(2000);
    }



    public static String getErrorMessage(WebDriver driver)
    {
        explicitWait(driver,15, errorMessageLocator);
        return driver.findElement(errorMessageLocator).getText();
    }

    public static void assertEqualUrls(String expectedUrl, String actualUrl) {
        if (!expectedUrl.equals(actualUrl)) {
            throw new AssertionError("URLs are not equal: expected=" + expectedUrl + ", actual=" + actualUrl);
        }
    }

}
