package AllFiles;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AddToCartSteps {
    WebDriver driver=new EdgeDriver();
    
    public AddToCartSteps() throws InterruptedException {
    }
    @Given("I am on the inventory page as {string} and {string}")
    public void i_am_on_the_inventory_page(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.resetCartItemsCount();
        LoginPage.goToLoginPage(driver);
        LoginPage.enterUsername(driver, username);
        LoginPage.enterPassword(driver, password);
        LoginPage.clickLoginButton(driver);
    }
    
    @When("I click on the Add to Cart button for {string}")
    public void i_click_on_the_add_to_cart_button_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.AddItemToCart(driver, string);
    }
    @Then("I should see that the cart icon has a badge with {int}")
    public void i_should_see_that_the_cart_icon_has_a_badge_with(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.explicitWait(driver, 1, AddToCart.cartBadgeLocator);
        AddToCart.checkCartBadge(driver);
    }
    @Then("the add to cart button of {string} should change to remove")
    public void the_add_to_cart_button_should_change_to_remove(String itemName) {
        // Write code here that turns the phrase above into concrete actions
        AddToCart.checkButtonChanged(driver,itemName);
    }
}
