Feature: Test Guru99 application

  Scenario: Test Register page Functionality
    Given user open a guru99 register page url
    When user enter firstname and lastname and emai and phone info
    Then user enter address and city and state and Country info
    Then user enter username and pass and confirmpass
    And Click on submit button
