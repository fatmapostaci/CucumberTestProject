@Parallel
Feature: Parallel Test 03
  @Parallel03
  Scenario: Facebook Test
    Given user goes to URL "https://facebook.com"
    When user prints the title
    Then close parallel driver