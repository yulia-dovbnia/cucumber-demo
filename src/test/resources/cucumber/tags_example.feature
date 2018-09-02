@main
Feature: Feature to demonstrate tags

  @f1
  Scenario: First
    * I print the text 'First'

  @f2
  Scenario: Second
    * I print the text 'Second'

  @f3
  Scenario: Third
    * I print the text 'Third'

  @f4
  Scenario: Fourth
    * I print the text 'Fourth'

  @f8
  Scenario Outline: Fifth
    * I print the text '<text>'

  @f5
    Examples: Positive case
      | text              |
      | Example feature 1 |
  @f6
    Examples: Negative case
      | text              |
      | Example feature 2 |
  @f7
    Examples: Fails due to bug
      | text              |
      | Example feature 3 |



