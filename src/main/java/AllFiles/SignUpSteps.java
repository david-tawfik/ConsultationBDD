package AllFiles;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SignUpSteps {
    WebDriver driver=new EdgeDriver();

    public SignUpSteps() throws InterruptedException {
    }

    @Given("the user is in the SignUp page")
    public void the_user_is_in_the_sign_up_page() throws InterruptedException {
        SignUpPage.goToSignUpPage(driver);
    }

    @When("the user enters {string}, {string}, {string}, {string}")
    public void the_user_enters_valid(String firstName, String lastName, String email, String password)
    {
        SignUpPage.enterFirstName(driver, firstName);
        SignUpPage.enterLastName(driver, lastName);
        SignUpPage.enterEmail(driver, email);
        SignUpPage.enterPassword(driver, password);
    }

    @When("the user clicks on the submit button")
    public void the_user_clicks_on_the_button() throws InterruptedException
    {
        SignUpPage.clickSignUpButton(driver);
    }

    @Then("the system should create a new account for the user and redirect them to the home page.")
    public void the_system_should_create_a_new_account_for_the_user_and_redirect_them_to_the_home_page()
    {
        SignUpPage.assertEqualUrls(driver.getCurrentUrl(),"https://thinking-tester-contact-list.herokuapp.com/contactList");
    }

    @Then("the system should display an error message missing firstname field.")
    public void the_system_should_display_an_error_message_firstname()
    {
        String errorMessage=SignUpPage.getErrorMessage(driver);
        SignUpPage.assertEqualUrls(errorMessage,"User validation failed: firstName: Path `firstName` is required.");
    }

    @Then("the system should display an error message missing email field.")
    public void the_system_should_display_an_error_message_email()
    {
        String errorMessage=SignUpPage.getErrorMessage(driver);
        SignUpPage.assertEqualUrls(errorMessage,"User validation failed: email: Email is invalid");
    }

    @Then("the system should display an error message of email already taken.")
    public void the_system_should_display_an_error_message_taken()
    {
        String errorMessage=SignUpPage.getErrorMessage(driver);
        SignUpPage.assertEqualUrls(errorMessage,"Email address is already in use");
    }



}
