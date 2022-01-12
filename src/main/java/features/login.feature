Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario

	Given user is already on login page
	When title of login page is Free CRM
	Then user enters unsername and password
	Then user clicks on login button
	Then user is on home page
	Then close the browser

Scenario: user is able to create new contacts
	Given user is already on home page
	When user mouse over on contacts link
	Then user clicks on new contact link
	Then user enters firstname and lastname
	Then user clicks on save button
	Then verify new contact is created

