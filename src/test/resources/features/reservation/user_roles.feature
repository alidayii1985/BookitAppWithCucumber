Feature: User roles

  @wip
  Scenario Outline: login as <user> type
    Given the user logs in as a light-side <user>
    And there are available spots for scheduling
    When the user hunts for a spot
    Then book button <expected> be displayed
    Examples:
      | user        | expected   |
      | team member | should not |
      | team leader | should     |
      | teacher     | should     |


#  Scenario: login test
##    Given the user logs in as a light-side team member
#    Given the user logs in as a light-side team lead
#    Given the user logs in as a light-side teacher
