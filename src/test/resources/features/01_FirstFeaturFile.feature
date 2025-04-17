@Login
Feature: Login Test

  Bu Feature ContactList yygulamsının Login işlemleri ile ilgili testlerini içerir

  Background: User goes to homepage
    Given user goes to homepage

  @PositiveLogin  @SmokeTest  @RegressionTest
  Scenario: Positive login Test
#    Given user goes to homepage
    When user enters email
    And user enters password
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  @NegativeLogin
  Scenario: Negative login Test
#    Given user goes to homepage
    When user enters email
    And user enters invalid password
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeLogin
  Scenario: Negative login Test
#    Given user goes to homepage
    When user enters invalid email
    And user enters password
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeLogin
  Scenario: Negative login Test with empty email
#    Given user goes to homepage
    When user enters password
    And user clicks on submit
    Then user validates error message
    And user closes the browser