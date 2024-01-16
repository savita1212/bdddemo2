@RegressionTesting
Feature: Test the Orange HRM Application

  @LoginPage @EndToEndTesting
  Scenario: Test Login Functionality
    Given user is on login page
    When user enter valid username and valid password

  @HomePage @EndToEndTesting
  Scenario: Test Home Page Functionality
    Then user is on home page and validate home page title
    And user validate home page URL

  @PIMPage @EndToEndTesting
  Scenario Outline: Test PIM Page add Employee Functionality
    When user click on pim link
    Then validate user is on pim page
    And click on add employee
    And user enter "<firstname>" and "<middle>" and "<lastname>"
    And click on save button

    Examples: 
      | firstname | middle | lastname |
      | abc1      | pqr1   | xyz1     |
      | abc2      | pqr2   | xyz2     |
      | abc3      | pqr3   | xyz3     |
      | abc4      | pqr4   | xyz4     |
      | abc5      | pqr5   | xyz5     |
      | abc6      | pqr6   | xyz6     |
      | abc7      | pqr7   | xyz7     |
