$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HRM.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHrm Login/out",
  "description": "",
  "id": "orangehrm-login/out",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11309717341,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "PIM add new Employee",
  "description": "",
  "id": "orangehrm-login/out;pim-add-new-employee",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@addemp"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am navigating to orrangeHRM Website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on PIM button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I add new Employee",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_am_navigating_to_orrangeHRM_Website()"
});
formatter.result({
  "duration": 215499688,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_enter_username_and_password()"
});
formatter.result({
  "duration": 11489916883,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.i_calick_on_Login_button()"
});
formatter.result({
  "duration": 37632,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPIMButton()"
});
formatter.result({
  "duration": 5039453951,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddNewEmployee()"
});
formatter.result({
  "duration": 4763304350,
  "error_message": "org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been \"select\" but was \"input\"\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027Sudhakar-PC\u0027, ip: \u0027192.168.0.65\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:47)\r\n\tat AddEMP.enterfield(AddEMP.java:23)\r\n\tat MyStepdefs.iAddNewEmployee(MyStepdefs.java:48)\r\n\tat ✽.And I add new Employee(HRM.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 33526,
  "status": "passed"
});
});