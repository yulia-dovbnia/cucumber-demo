Feature: Yulia's super feature
  First cucumber demo. Here you can write feature description

  Scenario: Yuliia's super scenario
    When I print to console some text
    Then I print the text 'Text was printed'

  Scenario: Example with objects
    * I print user 'yuliia'
    * I print user 'maria'
    * I print user 'petro'

  Scenario: Example with custom types
    When I add '20' to '30' it should be '50'

  Scenario Outline: Scenario outline example
    When I add '<first>' to '<second>' it should be '<result>'

    Examples:
      | first | second | result |
      | 20    | 30     | 50     |
      | 10    | 10     | 20     |
      | -5    | -6     | -11    |


  Scenario: Super Cucumber feature
  This scenario was created to describe additional Cucumber features

    * I print the text
    """
    super text
    really long
    incredibly long text
    """







