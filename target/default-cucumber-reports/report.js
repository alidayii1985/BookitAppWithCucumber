$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/accounts/mydetails.feature");
formatter.feature({
  "name": "My details page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "my information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefinitions.userOnTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in using \"ucharlot7y@nbcnews.com\" and \"archibaldmelloy\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinitions.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user goes to the \"my self\" page",
  "keyword": "When "
});
formatter.match({
  "location": "MapDetailsStepDefinitions.the_user_goes_to_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});