Feature: Test the Cogmento Application

  Scenario: Test Login page functionality
    Given User on login page
    When User enter the valid username and password
    Then Click on login button

  Scenario: Test home page functionality
    Then User validate Home page Title and Url
    And Click on the contact button

  Scenario Outline: Test contact page functionality
    Then click on create button
    And User enter "<firstname>" and "<lastname>" and "<email>" and "<status>"
    And Click on save button
    And Take a screenshot
    And Click on delete button
    And Click on confirm delete button

    Examples: 
      | firstname | lastname | email        | status     |
      | sj        | ja       | s@gmail.com  | Active     |
      | sari      | Kan      | sa@gmail.com | Inactive   |
      | che       | sel      | ch@gmail.com | On Hold    |
      | Pra       | Pat      | pr@gmail.com | Terminated |
