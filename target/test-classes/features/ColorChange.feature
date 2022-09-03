@Regression
Feature: Validating Background Set Color
	
	@Scenario1
	Scenario: User should be able to set sky blue background
		Given Set SkyBlue Background button exists 
		When I click on the button 
		Then the background color will change to sky blue
		
		
	@Scenario2
	Scenario: User should be able to set sky background
		Given Set SkyWhite Background button exists 
		When I click on the Set White Background button 
		Then the background color will change to white