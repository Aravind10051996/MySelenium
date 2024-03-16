@LoginPage

Feature: Login Page Automation of saucedemo App


Scenario Outline: Check login is successful with valid creds 
Given User open url and on login page login  
When User enters valid "<username>" and "<password>"
And Clicks on login Button
Then User should navigate to home page 
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
