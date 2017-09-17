$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HRM.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login/out",
  "description": "",
  "id": "orangehrm-login/out",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10280642769,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "PIM search Employee",
  "description": "",
  "id": "orangehrm-login/out;pim-search-employee",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am navigating to orrangeHRM Website",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on PIM button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click on Employee list",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I Search by Employee Name",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I should logout sucessfuly",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_am_navigating_to_orrangeHRM_Website()"
});
formatter.result({
  "duration": 204923259,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_enter_username_and_password()"
});
formatter.result({
  "duration": 11082636814,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_calick_on_Login_button()"
});
formatter.result({
  "duration": 25316,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPIMButton()"
});
formatter.result({
  "duration": 2012638620,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnEmployeeList()"
});
formatter.result({
  "duration": 3157975221,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchByEmployeeName()"
});
formatter.result({
  "duration": 4113445160,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldLogoutSucessfuly()"
});
formatter.result({
  "duration": 9453688955,
  "status": "passed"
});
formatter.after({
  "duration": 1667261240,
  "status": "passed"
});
});