Feature: Map page details


  Scenario: Light side rooms
    Given user on the login page
    When user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    Then I should be able to see "ping pong" room


  Scenario: Light side all rooms
    Given user on the login page
    When user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    Then user should be able to see following conference rooms:
      | harvard   |
      | yale      |
      | princeton |
      | stanford  |
      | duke      |
      | berkeley  |
      | ping pong |


  Scenario: Team members test
    Given user on the login page
    And user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    When the user goes to the "my team" page
    Then following team members should be displayed:
      | Leonard   |
      | Lorette   |
      | Durant    |
      | Archibald |

