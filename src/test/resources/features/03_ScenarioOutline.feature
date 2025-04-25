@ScenarioOutline
Feature: Login Test
  Bu Feature ContactList uygulamasının tekrar eden Login işlemlerini
  tek bir scenario outline altında toplamayı pratik ediyoruz

  Background: User goes to homepage
    Given user goes to homepage

@PositiveLogin
  Scenario Outline: Positive login Test
    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser
    Examples:
      | email             | password |
      | ondia25@gmail.com | ondia123 |
      | weTest@test.com   | test123  |
      | weTest@test.com   | qw12345  |
      | qw@hotmail.com    | qw12345  |



