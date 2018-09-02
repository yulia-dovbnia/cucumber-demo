Business Need: my feature

  Scenario: Sample
#Feature
#Business Need: Super feature
#Ability: Super feature

    * I print the text 'Simple scenario text'
##############################################################
  Scenario Outline: Sample
    * I print the text '<text>'
    Examples:
      | text               |
      | Outline + Examples |
##############################################################
  Scenario Template: Sample
    * I print the text '<text>'
    Examples:
      | text                |
      | Template + Examples |
##############################################################

##############################################################
  Scenario Outline: Sample
    * I print the text '<text>'
    Scenarios:
      | text                |
      | Outline + Scenarios |
##############################################################
  Scenario Template: Sample
    * I print the text '<text>'
    Scenarios:
      | text                 |
      | Template + Scenarios |
##############################################################