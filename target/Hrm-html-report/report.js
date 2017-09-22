$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/HRM.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login/out",
  "description": "",
  "id": "orangehrm-login/out",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8996797241,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "admin Login and logout",
  "description": "",
  "id": "orangehrm-login/out;admin-login-and-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@loginpage"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am navigating to orrangeHRM Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should login sucessfuly",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should logout sucessfuly",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_am_navigating_to_orrangeHRM_Website()"
});
formatter.result({
  "duration": 219851226,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_enter_username_and_password()"
});
formatter.result({
  "duration": 633573,
  "error_message": "java.lang.NullPointerException\r\n\tat MyStepdefs.i_enter_username_and_password(MyStepdefs.java:30)\r\n\tat ✽.When I enter username and password(src/main/resources/HRM.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.i_calick_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.i_should_login_sucessfuly()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.iShouldLogoutSucessfuly()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 23262,
  "status": "passed"
});
});