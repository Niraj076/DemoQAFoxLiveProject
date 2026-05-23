Feature: Registrationfunctionality scenarios
Scenario: Verify whether user is able to register into the application by providing all the details
	Given I launch the application
	And I navigate to Account Registeration page
	When I provide all the below details
		| FirstName | Niraj                  | 
		| LastName  | Parmar                 |
		| Email     | parmaniraj76@gmail.com |
		| Telephone | 76938797879            |
		| Password  | Abcd@1234              | 
	And I select the Privacy Policy
	And I click on Continue button
	Then I should see that  the user account has created successfully
	