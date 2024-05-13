Feature: Add To Cart Feature
  Scenario: User adds an item to cart
    Given I am on the inventory page as "standard_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    Then I should see that the cart icon has a badge with 1 
    And the add to cart button of "Sauce Labs Backpack" should change to remove

  Scenario: User adds multiple items to cart
    Given I am on the inventory page as "standard_user" and "secret_sauce"
    When I click on the Add to Cart button for "Sauce Labs Backpack"
    And I click on the Add to Cart button for "Sauce Labs Bike Light"
    Then I should see that the cart icon has a badge with 2
    And the add to cart button of "Sauce Labs Backpack" should change to remove
    And the add to cart button of "Sauce Labs Bike Light" should change to remove



  # Scenario: User logs in with problem_user username
  #   Given I am on the login page
  #   When I enter valid "problem_user" and "secret_sauce"
  #   And I press Login
  #   Then I should be logged in to the application

  # Scenario: User logs in with error_user username
  #   Given I am on the login page
  #   When I enter valid "error_user" and "secret_sauce"
  #   And I press Login
  #   Then I should be logged in to the application




