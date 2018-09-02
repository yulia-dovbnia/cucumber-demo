Feature: Yulia's super feature
  First cucumber demo. Here you can write feature description

  Scenario: Data table example - list

    When I print users using data table and raw:
      | yuliia |
      | maria  |
      | petro  |

    When I print users using list:
      | yuliia |
      | maria  |
      | petro  |



  Scenario: Data table example - map

    When I print keys and values using data table and raw:
#      | superKey | superValue |
      | name   | Yuliia |
      | age    | 24     |
      | gender | F      |

    When I print keys and values using map:
#      | superKey | superValue |
      | name   | Yuliia |
      | age    | 24     |
      | gender | F      |


  Scenario: Data table example  - list map
    When I add First + Second it should be Result using data table and raw:
      | first | second | result |
      | 20    | 30     | 50     |
      | 10    | 10     | 20     |
      | -5    | -6     | -11    |

    When I add First + Second it should be Result using list map:
      | first | second | result |
      | 20    | 30     | 50     |
      | 10    | 10     | 20     |
      | -5    | -6     | -11    |

    When I add First + Second it should be Result using list map and foreach:
      | first | second | result |
      | 20    | 30     | 50     |
      | 10    | 10     | 20     |
      | -5    | -6     | -11    |
