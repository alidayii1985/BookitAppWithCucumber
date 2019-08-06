@login @smoke
Feature: login functionality


  Scenario: teacher login
    Given user on the login page
    When user logs in using "teacheremail@gmail.com" and "teacherpassword"
    Then homepage should be displayed
    And title should be "my application title"
    And there should be 4 menu options


  Scenario: team leader login
    Given user on the login page
    When user logs in using "teamleaderemail@gmail.com" and "teamleaderpassword"
    Then homepage should be displayed
    And title should be "my application title"

