$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HRM.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login/out",
  "description": "",
  "id": "orangehrm-login/out",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15947455855,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "admin Login and logout",
  "description": "",
  "id": "orangehrm-login/out;admin-login-and-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am navigating to orrangeHRM Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I calick on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I should login sucessfuly",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_am_navigating_to_orrangeHRM_Website()"
});
formatter.result({
  "duration": 233388891,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_enter_username_and_password()"
});
formatter.result({
  "duration": 10348914031,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_calick_on_Login_button()"
});
formatter.result({
  "duration": 32841,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_should_login_sucessfuly()"
});
formatter.result({
  "duration": 6639287552,
  "status": "passed"
});
formatter.after({
  "duration": 22578,
  "status": "passed"
});
});