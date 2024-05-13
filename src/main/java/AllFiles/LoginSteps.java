package AllFiles;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LoginSteps {
    WebDriver driver=new EdgeDriver();

    public LoginSteps() throws InterruptedException {
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException
    {
        LoginPage.goToLoginPage(driver);
    }
    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String password)
    {
        LoginPage.enterUsername(driver, username);
        LoginPage.enterPassword(driver, password);
    }
    @When("I press Login")
    public void i_press() throws InterruptedException {
        LoginPage.clickLoginButton(driver);
    }
    @Then("I should be logged in to the application")
    public void i_should_be_logged_in()
    {
      String currURL = driver.getCurrentUrl();
      LoginPage.assertEqualUrls("https://www.saucedemo.com/inventory.html", currURL);
    }

    @When("I enter invalid {string} and {string}")
    public void i_enter_invalid_and(String username, String password)
    {
        LoginPage.enterUsername(driver, username);
        LoginPage.enterPassword(driver, password);
    }
    @Then("I should see an error saying password field cannot be left empty")
    public void i_should_see_an_error_saying_password_field_cannot_be_left_empty()
    {
        String errorMessage=LoginPage.getErrorMessage(driver);
        LoginPage.assertUrlContains("Epic sadface:", errorMessage);
    }



}
