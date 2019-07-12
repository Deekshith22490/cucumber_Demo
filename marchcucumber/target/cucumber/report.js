$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/git/cucumber_Demo/marchcucumber/src/test/java/Feature/sfdc.feature");
formatter.feature({
  "line": 1,
  "name": "Sales Force TestCases Login Feature",
  "description": "",
  "id": "sales-force-testcases-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "TC02:Verify Login with valid username and password",
  "description": "",
  "id": "sales-force-testcases-login-feature;tc02:verify-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Sales force Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"mithun.r@tekarch.com\" in user name field",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "User enters \"mithun123\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumScripts.user_is_on_Sales_force_Page()"
});
formatter.result({
  "duration": 13934901389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithun.r@tekarch.com",
      "offset": 13
    }
  ],
  "location": "SeleniumScripts.user_enters_in_user_name_field(String)"
});
formatter.result({
  "duration": 672117553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithun123",
      "offset": 13
    }
  ],
  "location": "SeleniumScripts.user_enters_in_password_field(String)"
});
formatter.result({
  "duration": 167713137,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3022224526,
  "status": "passed"
});
});