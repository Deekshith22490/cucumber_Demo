$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/git/cucumber_Demo/marchcucumber/src/test/java/Feature/sfdc.feature");
formatter.feature({
  "line": 1,
  "name": "Sales Force TestCases Login Feature",
  "description": "",
  "id": "sales-force-testcases-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "TC02:Verify Login with valid username and password",
  "description": "",
  "id": "sales-force-testcases-login-feature;tc02:verify-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@ignore"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User login page is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Valid Username enters username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Valid Password enters Password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumScripts.user_login_page_is_launched()"
});
formatter.result({
  "duration": 19863751433,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.Valid_Username_enters_username_field()"
});
formatter.result({
  "duration": 4603505566,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.Valid_Password_enters_Password_field()"
});
formatter.result({
  "duration": 4289818666,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 9999411890,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.close_the_browser()"
});
formatter.result({
  "duration": 1904256613,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "TC04A:Test forgot password link",
  "description": "",
  "id": "sales-force-testcases-login-feature;tc04a:test-forgot-password-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@ignore"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User login page is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks forgot password link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "SalesForce forgot password page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Valid username enters username field in forgot password page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Continue button is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Password reset message page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumScripts.user_login_page_is_launched()"
});
formatter.result({
  "duration": 13111186664,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.user_clicks_forgot_password_link()"
});
formatter.result({
  "duration": 696162659,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.salesforce_forgot_password_page_should_be_displayed()"
});
formatter.result({
  "duration": 53680691,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.valid_username_enters_username_field_in_forgot_password_page()"
});
formatter.result({
  "duration": 4304163727,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.continue_button_is_clicked()"
});
formatter.result({
  "duration": 1003302346,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.password_reset_message_page_is_displayed()"
});
formatter.result({
  "duration": 16909959,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumScripts.close_the_browser()"
});
formatter.result({
  "duration": 1155175342,
  "status": "passed"
});
});