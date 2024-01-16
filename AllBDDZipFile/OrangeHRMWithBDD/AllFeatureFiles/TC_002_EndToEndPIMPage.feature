Feature: Test Orange HRM PIM End to End application Functionality

  @PIMPage
  Scenario: Test the Login page Functionality
    Given user is on login page
    When user enter valid username and valid password
    Then click on login button

  @PIMPage
  Scenario: Test the Home Page Functionality
    When user is on home page then validate home page logo
    And validate home page title
    And validate home page url

  #Scenario Outline:
  Scenario Template: Test PIM Page functionality
    When user click on pim link
    Then user click on add employee button
    And user enter "<firstname>" and "<middlename>" and "<lastname>"
    Then click on save button

    #Examples:
    Scenarios: 
      | firstname | middlename | lastname |
      | Amol      | pqr1       | shinde   |
      | Anjali    | pqr2       | patil    |
      | gauri     | pqr3       | more     |
      | rajesh    | pqr4       | patel    |
