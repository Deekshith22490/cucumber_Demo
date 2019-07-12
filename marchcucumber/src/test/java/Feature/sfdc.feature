Feature: Sales Force TestCases Login Feature
Scenario: TC02:Verify Login with valid username and password 
 Given User is on Sales force Page
 And User enters "mithun.r@tekarch.com" in user name field
 And User enters "mithun123" in password field
 Then User clicks on login button
 