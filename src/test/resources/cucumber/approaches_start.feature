Feature: Approaches

  Scenario: Using Given\When\Then
    Given Something like as a precondition
    When Do something
    Then I get something
    And It is a good result
    But It is stll steps
    * Use this if you don't want to use keywords
    * Or it is not a test

  Scenario: Readability + common steps
    * type 'text1' to field 'some field1'
    * type 'text2' to field 'some field2'
    * type 'text3' to field 'some field3'
    * type 'text4' to field 'some field4'

    * fill following data:
      | text1 | some field1 |
      | text2 | some field2 |
      | text3 | some field3 |
      | text4 | some field4 |

    * login as user 'userName'


  Scenario: Imperative
    Given I am on the homepage
    When I click on the "Login" button
    And I fill in the "Email" field with "me@example.com"
    And I fill in the "Password" field with "secret"
    And I click on "Submit"
    Then I should see "Welcome to the app, John Doe"

  Scenario: Declarative
    Given I am on the homepage
    When I log in
    Then I should see a login notification

