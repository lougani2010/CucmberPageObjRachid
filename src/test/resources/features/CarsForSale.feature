@Search-New_Cars
Feature: Validate Cars For Sale for New Search By Make with New Cars 
	In order to validate that 
the Search By Make should work fine
we will do the acceptance testing

@Search-New_Cars-Positive
Scenario: Validate Search By Make is working as expected 

	Given the user launched the browser 
	And the user navigated to "https://www.cars.com/" 
	When the user moves to menu
	|Menu	|
	|Cars for Sale|
	|Sell Your Car|
	|Service & Repair|
	And the user clicks on subMenu
	|SubMenu	|
	|Search By Make|
	|Seach By Body Style|
	And the user selects stock type as "New Cars" from the dropdown
	And the user selects car make as "Honda" from the dropdown
	And the user selects car model as "Civic" from the dropdown
	And the user selects car price "under $25,000" from the dropdown
	And the user selects car distance "20 Miles from" from the dropdown
	And the user enters the zipCode as "22044"
	And the user clicks on Search button
	Then the list of searched car is displyed
	And the page results title should be "New Honda Civic - in 22044 - on Cars.com"
