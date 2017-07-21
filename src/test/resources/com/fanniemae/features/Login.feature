Feature: Login Feature

Scenario Outline: User should able to login
	Given user is on sdettraining homepage
	When user clicks on Signin link
	And user enters "<user>" as username or email address
	And user enters "<password>" as password
	And user click on signin button
	Then user should see Welcome back message

	Examples:
	| user					| password				|
	| djasani@gmail.com		| Test123			    |
