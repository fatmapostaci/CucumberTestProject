@Parametrezing
Feature: Login Test
  Bu Feature ContactList uygulamasının Login işlemleri ile
  ilgili testlerini içerir

  Background: User goes to homepage
    Given user goes to homepage


  Scenario: Positive login Test
    When user enters email "ondia25@gmail.com"
    And user enters password "ondia123"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  Scenario: Positive login Test
    When user enters email "weTest@test.com"
    And user enters password "test123"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  Scenario: Positive login Test
    When user enters email "qw@hotmail.com"
    And user enters password "qw12345"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser


  @NegativeLogin
  Scenario: Negative login Test
    When user enters email "ondia25@gmail.com"
    And user enters password "invalidPAss"
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeLogin
  Scenario: Negative login Test
    When user enters email "invalid@gmail.com"
    And user enters password "ondia123"
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeLogin
  Scenario: Negative login Test with empty password
    And user enters email "ondia25@gmail.com"
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  Scenario: Negative login Test
    And user enters password "ondia123"
    And user clicks on submit
    Then user validates error message
    And user closes the browser