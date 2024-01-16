Feature: Test Sauce Demo Application

  Scenario: Test Login Functionality
    Given User is on Sauce Demo Application
    When User enter valid username and password
    Then click on login button

  Scenario: Test Home page functionality
    When User is on home page validate home page title
    Then search products and add products to cart
    And click on Cart button

  Scenario: Checkout functionality
    Then Click on Checkout button

  Scenario: Test user information
    When User enters first name last name and zip code
    Then click on continue button

  Scenario: Test Overview Page
    Then Click on finish button
