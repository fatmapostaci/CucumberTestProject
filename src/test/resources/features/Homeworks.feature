@Homeworks
Feature:

##  /*
##  Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
##  Add 10 titles and notes by using Scenario Outline
##  */

  @Hw01
  Scenario Outline: Add Title and Notes
    When user goes to url "https://testpages.eviltester.com/styled/apps/notes/simplenotes.html"
    And user adds title on simple note taker page "<title>"
    And user adds note on simple note taker page "<note>"
    Then user clicks Add button on simple note taker page
    Then verify "<title>" isAddedSuccesfully
    And  user closes the browser
    Examples:
      | title   | note  |
      | title1  | note1 |
      | title2  | note2 |
      | title3  | note3 |
      | title4  | note4 |
      | title5  | note1 |
      | title6  | note2 |
      | title7  | note3 |
      | title8  | note4 |
      | title9  | note1 |
      | title10 | note1 |



@  #  /*
#  Go to https://testpages.eviltester.com/styled/validation/input-validation.html
#  Fill form and submit
#  Do this with 3 scenarios
#  Use background and scenario outline
#  */
@Hw02
Scenario Outline: Fill form and Submit
  When
  And
  Then
  Examples: