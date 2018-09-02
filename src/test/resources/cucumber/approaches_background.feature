Feature: Using background for testing

  Background: Performing common steps for both scenarios
    * I print the text 'Perform precondition step1'
    * I print the text 'Perform precondition step2'
    * I print the text 'Perform precondition step3'
    * I print the text 'Perform precondition step4'
    * I print the text 'Perform precondition step5'
    * I add '20' to '30' it should be '100'

  Scenario: Scenario without background
    When I print the text 'Scenario actions1'
    Then I print the text 'Scenario checks1'

  Scenario: Scenario without background
    When I print the text 'Scenario actions2'
    Then I print the text 'Scenario checks2'





