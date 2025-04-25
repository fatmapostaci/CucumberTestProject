@Parallel
Feature: Parallel Test 02


  @Parallel02
  Scenario: Instagram Test
    Given user goes to URL "https://instagram.com"
    When user prints the title
    Then close parallel driver
