Feature: Test click on login button
Scenario Outline:  Login functionality for a social networking site.

Given user navigates to Testing demo website

#When User enter Username as "<username>" and Password as "<password>"
When User enter Username as "<username>"

Then login should be successful
    
Examples:
		 | username  | password  | 
		 | standard_user | secret_sauce | 
		 | problem_user | secret_sauce |