@smoke
Feature: campus locations

  @va-dark
  Scenario: VA - dark side
    Given user on the login page
    When user logs in using "mstacey8r@imdb.com" and "skylargiblin"
    Then location should be "dark-side"


  @va-light
  Scenario: VA - light side
    Given user on the login page
    When user logs in using "ucharlot7y@nbcnews.com" and "archibaldmelloy"
    Then location should be "light-side"

  @il
  Scenario: Illinois
    Given user on the login page
    When user logs in using "fbawmeb7@studiopress.com" and "sherilyngohn"
    Then location should be "il"


  Scenario Outline: Verify campus names
    Given user on the login page
    When user logs in using "<email>" and "<password>"
    Then location should be "<campus>"

    Examples:
      | email                    | password     | campus |
      | fbawmeb7@studiopress.com | sherilyngohn | il     |

