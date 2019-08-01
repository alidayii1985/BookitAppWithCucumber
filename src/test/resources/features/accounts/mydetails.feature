Feature: My details page


  Scenario: room information
    Given user on the login page
    And user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    Then user should be able to see quotes info for each room
      | ping pong | the more the better |
      | harvard   | the more the better |
      | yale      | the more the better |
      | stanford  | the more the better |
      | princeton | less is more        |
      | duke      | less is more        |
      | berkeley  | less is more        |

@account
  Scenario: my information
    Given user on the login page
    And user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    When the user goes to the "my self" page
#    Then user should see his information:
#      | name   | Archibald Melloy    |
#      | role   | student-team-member |
#      | team   | Nukes               |
#      | batch  | #8                  |
#      | campus | VA                  |


  Scenario Outline: my information data driven test <user_name>
    Given user on the login page
    And user logs in using "<user_email>" and "<user_password>"
    When the user goes to the "my self" page
    Then user should see his information:
      | name   | <user_name>   |
      | role   | <user_role>   |
      | team   | <user_team>   |
      | batch  | <user_batch>  |
      | campus | <user_campus> |

    Examples:
      | user_email             | user_password   | user_name        | user_role           | user_team | user_batch | user_campus |
      | ucharlot7y@nbcnews.com | archibaldmelloy | Archibald Melloy | student-team-member | Nukes     | #8         | VA          |












